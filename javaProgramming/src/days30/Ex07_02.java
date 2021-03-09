package days30;

import java.util.Scanner;

// awt/swing/ javaFX
import javax.swing.JOptionPane;

public class Ex07_02 {

	public static void main(String[] args) {
		// p 732 예제 13-4
		// p 736 
		/*
		System.out.print("아무값이나 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String input =  scanner.next();
		*/
        //   show      hide		

		InputDialogThread t2 = new InputDialogThread();
		t2.start();
		
		
		ForThread t1 = new ForThread();
		t1.start();
		
		System.out.println( Thread.currentThread().getName() + " 종료!!!");
	}

}
//
class ForThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 10; i > 0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

class InputDialogThread extends Thread{
	
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.printf("입력하신 값은 %s 입니다.\n", input);
	}
	
}








//