package days26;

import java.io.IOException;
import java.io.InputStream;

public class Ex13 {

	public static void main(String[] args) {
		// 표준 입력 장치로 부터 읽기 용도의 입력 바이트 스트림
		// 1byte, byte [], 정수
	    InputStream   is 	=  System.in;
	    //System.in.read()
	    
	    try {
			int  b = is.read();
			System.out.printf("%1$d - %1$c\n", b);
		} catch (IOException e) { 
			e.printStackTrace();
		}
	    

	}

}
//









//