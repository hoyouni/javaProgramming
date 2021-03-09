package days27;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 9. 4. - 오전 9:17:56
 * @Subject 
 */
public class Ex02_02 {

	public static void main(String[] args) {		
		String msg ="안녕하세요."; 
		
		String fileName = "msg.txt";  // .\\파일명
		// true   파일이 존재하면 추가, 생성
		// false  파일 존재 상관없이 새로 생성.
		boolean append = false ; // false
		// 2. 문자  단위 바이트 스트림으로 파일에 저장.	
		try (FileWriter  fw= new FileWriter( fileName, append ) ){
			
			// fw.append(c)
			fw.write(msg);
			fw.flush(); //
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	 
		System.out.println(" END ");
		

	}

}
//









//