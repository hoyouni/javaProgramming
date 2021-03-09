package days21;
/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex02.java
 */
public class Ex02 {
	public static void main(String[] args) {
		//String c = null; // 주소값을 참조하고 있지 않다는 null을 의미
		//String d = ""; // 힙 영역에 기억공간이 생성되고 주소값을 참조한다는 뜻
		
		//char e = '\u0000';
		//char f = ' ';

		
		
		//equals() 와 compareTo() 차이점 
		String a = "abc";
		String b = "aBc";
		//위의 두 문자열 a,b 가 같은지?
		System.out.println(a.equals(b) ? "같다" : "다르다"); 
		System.out.println(a.compareTo(b)); //문자열 비교 함수
		
		/*
		int gab = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == b.charAt(i))
				continue;
			else 
				gab = a.charAt(i) - b.charAt(i);
		}
		*/
	}
}
