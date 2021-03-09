package days26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex16 {

	public static void main(String[] args) throws IOException {
		// 키보드로부터 문자열 입력 받아서....      InputStream      System.in
		// 1) 파일 저장....                            [FileOutputStream]/ FileWriter
		//                       상대경로 : 현재디렉토리
		String name = "fos_save.dat";
		OutputStream fos = new FileOutputStream(name);
		InputStream is = System.in;
		System.out.print("> 저장할 문자열 입력 ? ");
		int i = -1;
		while(   ( i = is.read()) != -1 ) {
			System.out.println( i );
			fos.write(i);
		}
		
		System.out.println("END");
		

	}

}
//









//