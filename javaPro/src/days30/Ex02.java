package days30;

public class Ex02 {

	public static void main(String[] args) {
		
		Thread  t  = Thread.currentThread();
		
		System.out.println( t.getName() );  // main 스레드 
		
		for (int i = 0; i < 10; i++) {
			
			System.out.printf("%s - %d\n", Thread.currentThread().getName(), i);
		}
		
		System.out.println("END");

	}

}
//









//