package days16;

import days14.Point;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 20. - 오전 11:28:49
 * @Subject p 291 생성자( Constructor )
 */
public class Ex04 {

	public static void main(String[] args) {
		// 객체 p1~p5 를 생성한 후  x,y 필드를 초기화..
		// 1. 생성자의 역할 : 객체생성 + 필드 초기화 ( 동시에 ) -> 생성자
		// 2. 생성자 선언 형식
		//     ㄱ. 리턴자료형 X
		//     ㄴ. 생성자함수명은 반드시 클래스명 동일해야된다. 
		// [접근지정자] [기타제어자]  생성자함수([매개변수....])
		// {
		// }
		
		// 생성자는 인위적으로 호출할 수가 없다. 
		// 생성자 호출 시점 ?  객체가 생성될 때 자동으로 호출 
		/*
		new Point();   // () 생성자함수 호출
		new Point();
		new Point();
		*/
		
		Point p1 = new Point();
		p1.dispPoint();
		
		// The constructor Point(int, int) is undefined
		Point p2 = new Point(1, 2);
		p2.dispPoint();
		
		/*
		Point p1 = new Point();
		// x, y  필드를 초기화....
		p1.x = 1;
		p1.setY(2);
		
		Point p2 = new Point();
		p2.x = 1;
		p2.setY(2);
		
		Point p3 = new Point();
		p3.x = 1;
		p3.setY(2);
		*/ 

	}

}
//









//