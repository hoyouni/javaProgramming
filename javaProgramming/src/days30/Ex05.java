package days30;

import java.awt.Frame;

public class Ex05 {

	public static void main(String[] args) {
		/*
		// [ 파일 복사 ]
		// 바이트 스트림  editplus.exe + 보조스트림
		// 문자 스트림
		String originalPath = "C:\\test.exe";
		String copyPath = "D:\\test.exe";
		
		//fileCopy(originalPath, copyPath);
		
        Runnable target = new FileCopy(originalPath, copyPath);
		Thread thread1 = new Thread(target, "t1");
		thread1.start();
		
		 target = new FileCopy(originalPath, copyPath);
		Thread thread2 = new Thread(target, "t2");
		thread2.start();
		
		 target = new FileCopy(originalPath, copyPath);
		Thread thread3 = new Thread(target, "t3");
		thread3.start();
		
		
		System.out.println(" main 스레드 종료!!!");
		*/
	}
	
	/*
	public static void fileCopy(String originalPath, String copyPath) {
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 100; i++) {
			System.out.printf("[%s] %s  파일 복사 : %d%%\n"
					, tName, copyPath,  i);
		}
	}
	*/

}
//
/*
class FileCopy extends Frame implements Runnable{
	String originalPath,  copyPath;
	
	FileCopy(){}
	
	FileCopy(String originalPath, String copyPath){
		this.originalPath = originalPath;
		this.copyPath = copyPath;
	}

	@Override
	public void run() { 
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 100; i++) {
			System.out.printf("[%s] %s  파일 복사 : %d%%\n"
					, tName, this.copyPath,  i);
		}
	}
	
}
*/








//