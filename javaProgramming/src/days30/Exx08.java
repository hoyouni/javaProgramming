package days30;

public class Exx08 {

	public static void main(String[] args) {
		// p 738 스레드의 우선 순위
		ThreadEx8_1 t1 = new ThreadEx8_1();
		ThreadEx8_2 t2 = new ThreadEx8_2();
		
		t2.setPriority(10); 
		
		System.out.println("t1 : " + t1.getPriority());
		System.out.println("t2 : " + t2.getPriority());
		
		t1.start();
		t2.start();
		
		System.out.println("main 스레드 종료!!!");

	}

}

class ThreadEx8_1 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			for (int j = 0; j < 10000000; j++) ;
		}
		System.out.println("\n - 찍는 t1 스레드 종료");
	}
}
class ThreadEx8_2 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int j = 0; j < 10000000; j++) ;
		}
		System.out.println("\n -| 찍는 t2 스레드 종료");
	}
}
//









//