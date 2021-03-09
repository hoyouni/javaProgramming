package days27;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03 {

	public static void main(String[] args) {
		// 
		String originalPath = "C:\\Program Files\\EditPlus\\editplus.exe";
		String copyPath = "W:\\editplus_copy.exe";
		
		//> 처리 시간 : [31]859722985ns
		fileCopy_byteStream(originalPath, copyPath );

	}

	private static void fileCopy_byteStream(String originalPath, String copyPath) {
		long start = System.nanoTime();
		
		try(  FileInputStream fis = new FileInputStream(originalPath);
				FileOutputStream fos = new FileOutputStream(copyPath);){
			int b;
			while(   ( b = fis.read() ) != -1 ) {
				//System.out.println(b);
				fos.write(b);
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.println("> 처리 시간 : " + (end - start)+"ns");
		
	}

}
//









//