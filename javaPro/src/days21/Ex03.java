package days21;

import java.util.Scanner;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex03.java
 */
public class Ex03 {
	public static void main(String[] args) {
		// String 생성자와 메소드
		
		// 기본형 -> String 형변환
		//String n = 10 + "";
		// String n = Integer.toString(10);
		// String n = 3.14 + "";
		// String n = true + "";
	
		// char[] -> String
		// String -> char[]
		//char[] names = {'k', 'e', 'n', 'i', 'k'};
		//String name = new String(names); // char[] -> String
		//char[] names2 = name.toCharArray(); // String -> char[]
		// String 생성자 -> String 객체 생성
		
		//문자열에서 3 인덱스 위치의 한 문자 얻어오는 메소드
		//char one = name.charAt(3);
		
		// 문자열 합치기 
		//String a = "kbs";
		//String b = "sbs";
		//String d = "jtbc";
		//String c2 = a + b + d;
		//String c = a.concat(b).concat(d); // 혹은 a+b
		
		// 문자열 속에 한 문자열이 있는지 유 무 확인
		//String msg = "안녕하세요. 반장 이영재입니다.";
		//System.out.println(msg.contains("이영재")); // boolean 값 리턴
		//System.out.println(msg.indexOf("이영재")); // 없다면 -1 있다면 그 위치값 리턴
		//System.out.println(msg.lastIndexOf("이영재")); // 뒤에서 부터 찾아줌
		
		String url;
		System.out.print("url을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		url = sc.next();
		sc.close();
		//System.out.println(url);
		System.out.println(url.startsWith("http://")); //http:// 를 포함하고 있는가?
		
		
		
	}
}


















