package days11;

import java.util.ArrayList;

/**
 * @Author k≡n¡k
 * @Source Ex05.java
 * @Date 2019. 8. 12. - 오후 3:08:57
 * @Subject Ex02.java -> 컬렉션 사용... 
 */
public class Ex05 {

	public static void main(String[] args) {
		ArrayList m = new ArrayList();
		m.add(10);
		m.add(30);
		m.add(30);
		m.add(20);
		
		m.add(100);
		m.add(200);  // 크기 증가..
		// [10, 30, 30, 20, 100, 200]
		System.out.println( m );
		m.remove(3);
		System.out.println( m );
		m.add(3, 333);
		System.out.println( m );

	}

}
//









//