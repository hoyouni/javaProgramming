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
public class Ex03_03 {

	public static void main(String[] args) {
		// <E>  <T>  제네릭
		ArrayList<String> list = new  ArrayList<String>();
		list.add("정영진"); 
		list.add("이영재"); 
		list.add("여원경"); 
		
		String name =  list.get(1);
		System.out.println( name );
		
		Iterator<String> ir  = list.iterator();
		
		while (ir.hasNext()) {
			name =   ir.next();
			System.out.println(name);
		}
	   
		/*
		ArrayList  list1 = new ArrayList(3);  
		list1.add("정영진");  업캐스팅  
		list1.add("이영재");
		list1.add("여원경"); 
		
		Object obj =  list1.get(1);  
		String name = (String)obj;   다운캐스팅
		System.out.println(name);
		*/
		  
		/*
		// iterator 반복자를 사용해서 출력...( 기억 )
		Iterator ir = list1.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
	    */
		 

	}

}
//









//