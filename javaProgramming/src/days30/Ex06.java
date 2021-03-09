package days30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex06 {

	public static void main(String[] args) {
		String originalPath = "C:\\test.exe";
		String copyPath = "D:\\test.exe"; 
		
        Runnable target = new FileCopy(originalPath, copyPath);
        
        System.out.println(" Copy End ");

	}

}
//

class FileCopy extends Frame implements Runnable, ActionListener  {
	
    String originalPath,  copyPath;
    
    Button btnFileCopy = null;
    
	
	FileCopy(){ 
		
	}
	
	FileCopy(String originalPath, String copyPath){
		// this();
		this.originalPath = originalPath;
		this.copyPath = copyPath;
		
		this.setSize(500, 500);
		this.setVisible( true );
		this.setTitle( this.originalPath + " 파일 복사중...");
		//
		this.btnFileCopy = new Button("File Copy");
		this.btnFileCopy.addActionListener(this);
		this.add(this.btnFileCopy); 
		
	}
	
	@Override
	public void run() { 
		String tName = Thread.currentThread().getName();
		for (int i = 1; i <= 100; i++) {
			System.out.printf("[%s] %s  파일 복사 : %d%%\n"
					, tName, this.copyPath,  i);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("버튼 클릭!!!");
		 new Thread(this, "t1").start();
	}

	 
}









//