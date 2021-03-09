package days24;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 30. - 오전 9:41:13
 * @Subject TreeSet p 640 생성자 또는 메서드 (표) 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 
		int [] m = { 8, 9, 15, 6, 7, 38 };
		
		//  [8, 15, 24, 26, 31, 32]
		TreeSet<Integer> tset = new TreeSet<Integer>();
		// tset 랜덤하게 1~45 정수를 6개 정도 채워넣기.
		for (int i = 0; i < 6; i++) {
			//tset.add((int)(Math.random()*45)+1 );
			tset.add( m[i] );
		} 
		
		//System.out.println(tset);
		
		// pollFirst(), pollLast()  제거 + 얻어오기
		System.out.println( tset.first() ); // 정렬된 순서에서 첫 번째 객체 반환
		System.out.println( tset.last() );  // 정렬된 순서에서 마지막 번째 객체 반환
		
		System.out.println( tset.ceiling(  12  ) );   
		System.out.println( tset.floor( 12 ) );   
 
		System.out.println( tset.higher(10)); // 지정한 객체보다 큰값을 가지는 객체 중에 가장 가까운 값의 객체
		System.out.println( tset.lower(6));

	}

}
//









//