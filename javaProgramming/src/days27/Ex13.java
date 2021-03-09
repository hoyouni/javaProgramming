package days27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		// p 903 StringReader/StringWriter
		// [메모리 스트림]
		// ByteArray + InputStream/OutputStream ( 바이트 스트림 )  byte []		
		// CharArray + Reader/Writer                    ( 문자 스트림 )    char []
		// ***  StringReader/Writer                       ( 문자 스트림 )     String
		
		String content = "package days10;                                             \r\n"
        +"                                                            \r\n"
		+"import java.util.Random;                                    \r\n"
		+"import java.util.Scanner;                                   \r\n"
        +"                                                            \r\n"
		+"/**                                                         \r\n"
		+" * @Author k≡n¡k                                            \r\n"
		+" * @Source Ex05.java                                        \r\n"
		+" * @Date 2019. 8. 9. - 오후 2:46:31                         \r\n"
		+" * @Subject  근사치 구하기...                               \r\n"
		+" */                                                         \r\n"
		+"public class Ex06 {                                         \r\n"
        +"                                                            \r\n"
		+"	public static void main(String[] args) {                  \r\n"
		+"		int [] m = new int[20];                               \r\n"
		+"		fillM(m);                                             \r\n"
		+"		dispM(m);                                             \r\n"
		+"		// ( Approximate Value ) 근사치  구하기.              \r\n"
		+"		int n ;                                               \r\n"
		+"		Scanner  scanner = new Scanner(System.in);            \r\n"
		+"		System.out.print(\"> 정수 입력 ? \");                   \r\n"
		+"		n = scanner.nextInt();                                \r\n"
		+"		//                                                    \r\n"
		+"		int [] gaps = new int[m.length];                      \r\n"
		+"		for (int i = 0; i < gaps.length; i++) {               \r\n"
		+"			gaps[i] =  Math.abs(  n - m[i]  ) ;               \r\n"
		+"		}                                                     \r\n"
		+"		dispM(gaps);                                          \r\n"
		+"		// min                                                \r\n"
		+"	    int min = gaps[0];                                    \r\n"
		+"	    for (int i = 1; i < gaps.length; i++) {               \r\n"
		+"			if( min > gaps[i] ) min = gaps[i];                \r\n"
		+"		}                                                     \r\n"
		+"	                                                          \r\n"
		+"	    System.out.println(\"> 가장 작은  min : \" + min);      \r\n"
		+"		//                                                    \r\n"
		+"	    for (int i = 0; i < m.length; i++) {                  \r\n"
		+"			 if(  Math.abs( m[i] - n)  ==   min ) {           \r\n"
		+"				System.out.printf(\"%d   -   %d\n\", i, m[i]);  \r\n"
		+"			 }                                                \r\n"
		+"		}                                                     \r\n"
		+"	                                                          \r\n"
		+"		                                                      \r\n"
		+"		//                                                    \r\n"
		+"	}                                                         \r\n"
        +"                                                            \r\n"
		+"	// 출력....                                               \r\n"
		+"	private static void dispM(int[] m) {                      \r\n"
		+"		for (int i = 0; i < m.length; i++) {                  \r\n"
		+"			System.out.printf(\"[%02d]\", m[i]);                \r\n"
		+"			if( i % 10 == 9 ) System.out.println();           \r\n"
		+"		}                                                     \r\n"
		+"		System.out.println();                                 \r\n"
		+"	}                                                         \r\n"
        +"                                                            \r\n"
		+"	                                                          \r\n"
		+"	// 랜덤하게 배열을 1~100 정수를 채워넣는 함수             \r\n"
		+"	private static void fillM(int[] m) {                      \r\n"
		+"		 // 0.0 <= Math.random()  < 1.0		                  \r\n"
		+"		Random rnd = new Random();                            \r\n"
		+"		// 1<= int rnd.nextInt(100)+1 <= 100                  \r\n"
		+"		for (int i = 0; i < m.length; i++) {                  \r\n"
		+"			m[i] = rnd.nextInt(100)+1;                        \r\n"
		+"		}                                                     \r\n"
		+"	}                                                         \r\n"
        +"                                                            \r\n"
		+"}                                                           \r\n"
		+"//                                                          \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
        +"                                                            \r\n"
		+"//                                                          \r\n";

		
		// 문제) 10번째 라인의 문자열을 출력하세요.
		// 메모리 스트림 StringReader
		StringReader in = new StringReader(content);
		BufferedReader br = new BufferedReader(in);
		
		 for (int i = 1; i <=9 ; i++) {
			br.readLine();
		} 
		String line10 = br.readLine();
		
		System.out.println(line10);
		
		
		br.close();
		in.close();
		
	} // main

}
//









//