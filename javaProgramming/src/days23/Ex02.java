package days23;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 29. - 오전 9:34:11
 * @Subject p 604 Stack
 */
public class Ex02 {

	public static void main(String[] args) {
		// LIFO Stack 컬렉션 클래스 선택 
		Stack<String> s = new Stack<String>();
		s.push("정영진 - 개인사정(11:00)");
		s.push("김재우 - 늦잠");
		s.push("김건영 - 병원");
		
		//  출력
		/*
		String name = s.pop();
		System.out.println(name);
		name = s.pop();
		System.out.println(name);
		name = s.pop();
		System.out.println(name);
        //  java.util.EmptyStackException
		name = s.pop();
		System.out.println(name);
		*/
		
		/*  // 예외처리를 활용해서 모든 요소 출력.....
		try {
			while(true) {
				String name = s.pop();
				System.out.println(name);
			}
		} catch (EmptyStackException e) {}
		*/
				
		//                peek()           pop()   차이점
		// LIFO        가져오기             제거+가져오고
		
		// System.out.println(  s.search("김재우 - 늦잠")  );  // 1
		
		System.out.println( s.peek() );		
		System.out.println("---");		
		while(  !s.empty() ) {
			String name = s.pop();
			System.out.println(name);
		}
	}

}
//









//