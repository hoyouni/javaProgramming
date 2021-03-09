package days27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// 표준 입력 스트림 :  표준 입력 장치 로부터 읽을 수 있는 스트림 
		// ( 키보드 )
		// 바이트 스트림
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
		
		InputStream is =  System.in; // k
		 InputStreamReader isr  = new InputStreamReader(is);
		 BufferedReader br = new BufferedReader(isr);
		 
		 String data =  br.readLine();
		 
		 System.out.println(data);
		/*
	    char [] buffer = new char[1024];
		// 바이트 -> 문자 변환해주는 문 보조 자스트림
		 InputStreamReader isr  = new InputStreamReader(is);
		  isr.read()
		 //  kenik lee 엔터
		
		  String data = new String(buffer);
		*/
		
		/*
		// 0 ~ 255 정수 바이트값              //  가   3byte
		int b = is.read();		
		// 입력받은 한 문자 ....  형변환   byte -> char
		char c = (char)b;
		System.out.println(c);
		*/
	}

}
//









//