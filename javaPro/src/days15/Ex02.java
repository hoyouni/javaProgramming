package days15;

import java.util.Date;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 19. - 오전 10:27:02
 * @Subject TODO 
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		Date now = new Date();
		System.out.println( now );
		System.out.println( now.toLocaleString() );
		*/
		
		System.out.println( new Date() );
		System.out.println( new Date().toLocaleString() );
		
		// The constructor System() is not visible
		// new 연산자로 객체 생성할수 없다 == 인스턴스화 할수 없다. 
		//  new System(); X
		// System obj = new System();
	 
		
		/*
		String name = null;
		System.out.println(name);
        */
		
		//   m 변수/지역변수/참조변수/배열명
		// int []  자료형  - 참조타입: 배열 
		/*
		int [] m  = {1,2,3};
		System.out.println(m[0]);
		m = null;  //
		*/
		
		/*
		// int [] m = null;
		int [] m = new int[3];
		// java.lang.NullPointerException
		System.out.println(m[0]);
		*/
	}

}
//









//