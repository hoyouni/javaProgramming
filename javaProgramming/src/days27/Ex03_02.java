package days27;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_02 {

	public static void main(String[] args) {
		// 
		String originalPath = "C:\\Program Files\\EditPlus\\editplus.exe";
		String copyPath = "W:\\editplus_copy.exe";
		
		//> 처리 시간 : [31]859722985ns
		// > 처리 시간 :        36516313ns
		fileCopy_byteStream(originalPath, copyPath );

	}

	// [버퍼 기능]이 있는 보조 스트림을 사용해서 파일 복사..
	private static void fileCopy_byteStream(String originalPath, String copyPath) {
		long start = System.nanoTime();
		final int BUFFER_SIZE = 1024;
		byte [] buffer = new byte[BUFFER_SIZE];
		int n = -1;
		try(  FileInputStream fis = new FileInputStream(originalPath);
				FileOutputStream fos = new FileOutputStream(copyPath);
				BufferedInputStream bis = new BufferedInputStream(fis , BUFFER_SIZE );
				BufferedOutputStream bos = new BufferedOutputStream(fos , BUFFER_SIZE);
				){			
		    while (  (n = bis.read(buffer) ) != -1 ) {
				bos.write(buffer, 0, n );
			}			
			bos.flush();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.println("> 처리 시간 : " + (end - start)+"ns");
		
	}

}
//









//