package days27;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 9. 4. - 오전 9:17:56
 * @Subject 
 */
public class Ex02 {

	public static void main(String[] args) {
		String msg ="안녕하세요.";
		// 1. 바이트 단위로 파일에 저장.
		String name = "msg.dat";  // .\\파일명
		FileOutputStream fos  = null;
		try {
			fos = new FileOutputStream(name);
			// (기억) 문자열 -> byte[] 변환..
			byte [] msgBytes = msg.getBytes();
			
			// fos.write(msgBytes);
			
			for (int i = 0; i < msgBytes.length; i++) {
				byte b = msgBytes[i];
				fos.write(b);
				fos.flush(); // 
			}
			
			System.out.println("END");
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}finally {
			if( fos != null) {				
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// 2. 문자    단위로 파일에 저장.

	}

}
//









//