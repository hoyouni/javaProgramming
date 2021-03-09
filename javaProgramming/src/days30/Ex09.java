package days30;

public class Ex09 {

	public static void main(String[] args) {
		
		PriorityWorker [] p = new  PriorityWorker[10];
		for (int i = 0; i < p.length; i++) {
			p[i] = new PriorityWorker();
			p[i].setPriority(i+1);
			p[i].setName("t"+(i+1));
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i].start();
		}

		System.out.println("main 스레드 종료!!!");
	}

}

class PriorityWorker extends Thread{
	public void run() {
		String tName = this.getName() ; // currentThread().getName();
		int tPriority = this.getPriority();
		System.out.printf("%s [우선권:%d] 시작\n", tName, tPriority);
		int i = 0;
		while( i++ < 10000) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.printf("%s [우선권:%d] 종료\n", tName, tPriority);
	}
}
//









//