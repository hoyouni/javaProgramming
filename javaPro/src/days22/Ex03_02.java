package days22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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
public class Ex03_02 {

	public static void main(String[] args) {
		// 배열 X - > ArrayList 컬렉션 클래스 
		// 수정.삭제.추가. 등등

		ArrayList  list1 = new ArrayList();  
		list1.add("정영진");  
		list1.add("이영재");
		list1.add("여원경"); 
		// 
		int index = list1.indexOf("이영재");
		list1.add(index, "고승우"); 

		// list1.listIterator()

		// list1.replaceAll(operator);

		// 고승우 -> 김호연
		/*
		int index = list1.indexOf("고승우");
		list1.remove(index);
		list1.add(index, "김호연");
		 */

		index = list1.indexOf("고승우");
		list1.set(index, "김호연");


		// p 585 Collections 클래스
		//           Arrays
		//           Objects
		// Collections.sort(list1);
		// Collections.sort(list1, c);

		/*
		list1.sort( new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;

				return s1.compareTo(s2); // *-1; descending 내림차순.
			}

		} );  // 오름차순 정렬
		 */


		//list1.isEmpty()
		/*
		while(!list1.isEmpty()) {
			list1.remove(index)
		}
		 */

		// 
		// System.out.println( list1 );

		// iterator 반복자를 사용해서 출력...( 기억 )
		Iterator ir = list1.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}

		List  subList1 = list1.subList(1, 3);

		System.out.println( subList1);

		/*  java.lang.ClassCastExceptio
		String [] names = ( String [] ) list1.toArray();
		for (String obj : names) {
			System.out.println( obj );
		}
		 */

		Object [] names = list1.toArray();
		for (Object obj : names) {
			System.out.println( (String)obj );
		} 
	}
}
//









//