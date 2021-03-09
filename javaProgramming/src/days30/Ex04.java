package days30;

public class Ex04 {

	public static void main(String[] args) {
		// Ex03.java ....
		// 익명클래스 사용.
		Thread thread1 = new Thread(
				new Runnable() {			
					@Override
					public void run() {
						String tName = Thread.currentThread().getName();
						for (int i = 1; i <= 100; i++) {
							System.out.printf("[%s] - 대청소 : %d%%\n", tName, i);
						}
					}
				}
				, "영재스레드");
		thread1.start();
		
		// 람다식 
		new Thread(
				() -> {
					String tName = Thread.currentThread().getName();
					for (int i = 1; i <= 100; i++) {
						System.out.printf("[%s] - 장보기 : %d%%\n", tName, i);
					}
				}
				, "길동아줌마").start();

	}

}
//










//