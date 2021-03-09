package days30;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		String tName = Thread.currentThread().getName();
		
		System.in.read();
		System.in.skip(System.in.available());
		
		// 1. 대청소 일꾼(스레드)
		CleaningWorker thread1 = new CleaningWorker();
		thread1.setName("영재스레드");
		thread1.start();
		
		// 2. 장보는 일꾼(스레드)
		Runnable target = new ShoppingWorker();
		String name = "길동아줌마";
		Thread thread2 = new Thread(target, name);  // 스레드명
	    thread2.start(); //  target 의 run() 호출 
		
		
		System.out.println( Thread.currentThread().getName() + " 스레드 죽음!!!" );
	}

}

//일꾼(스레드) - 독립적으로 실행되는 메서드
class ShoppingWorker implements Runnable{

	@Override
	public void run() { 
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 100; i++) {
			System.out.printf("[%s] - 장보기 : %d%%\n", tName, i);
		}
	}
	
}

// 일꾼(스레드) - 독립적으로 실행되는 메서드
class CleaningWorker extends Thread{

	@Override
	public void run() {  // 독립적으로 처리할 일(기능) 
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 100; i++) {
			System.out.printf("[%s] - 대청소 : %d%%\n", tName, i);
		}
	}
	
}









//