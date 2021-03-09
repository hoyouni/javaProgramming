package days22;

import java.util.ArrayList;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 28. - 오전 10:24:37
 * @Subject ArrayList 컬렉션 클래스 
 *                 1. Collection - List 인터페이스 구현한 컬렉션 클래스
 *                 2. List 특징
 *                     ㄱ. 순서 O
 *                     ㄴ. 중복 O
 *                 3. 기능측면에서 Vector 컬렉션 클래스와 동일하다. 
 *                   ( 차이점 : 동기화 처리 여부 )    
 */
public class Ex03 {

	public static void main(String[] args) {
		// 배열 동일 + 단점: 동적 크기 할당, 삽입, 추가, 수정, 삭제 불편함.
		// 0 번째 요소( Element )
		
		ArrayList  list1 = new ArrayList(); // 10
		list1.add("정영진"); // Element(요소)  Object <- String  업캐스팅 
		list1.add("이영재");
		list1.add("여원경");
		
		
		// 순서가 2번째 학생   m[1]
		//String name = (String) list1.get(1); // Object -> String 다운캐스팅
		//System.out.println( name );
		
		// 순서대로 모든 학생 출력.
		//System.out.println( list1.size() );
		//list1.trimToSize() ;
		
		
		
		// 자동 크기 할당
		list1.add("고승우");
		list1.add("고승우");
		
		
		
		// 고승우 확인 후 삭제... 출력...
		// System.out.println(list1.contains("고승우") );
		int index = list1.indexOf("고승우"); 
		//list1.lastIndexOf("고승우");
		 list1.remove(index);
		// list1.remove("고승우");
		
		 
	    list1.clear();	  // 모든 요소 제거....
		 
		System.out.println( list1.size() );
		
		String name ;
		for (int i = 0; i < list1.size(); i++) {
			name = (String) list1.get(i);
			System.out.println( name );
		}
		
		/*
		ArrayList  list2 = new ArrayList(); // 10
		list2.add("고승우"); // Element(요소) 
		list2.add("김지민");
		list2.add("김호연");  // 11:00
		
	    ArrayList class5 = new ArrayList();
	    class5.addAll(list1);
	    class5.addAll(list2);
		*/
		

	}

}
//









//