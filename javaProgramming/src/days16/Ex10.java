package days16;

import days14.Point;

/**
 * @Author k≡n¡k
 * @Source Ex10.java
 * @Date 2019. 8. 20. - 오후 3:48:06
 * @Subject this 3번째 용도
 *                 단독( 리턴값, 매개변수값 )으로 사용될 때의 this  
 *                  
 */
public class Ex10 {

	public static void main(String[] args) {
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(100, 200);
		
		// 객체명.필드명
		// 객체명.메서드명
		
		// 호출하는 객체 
		// 객체명.메서드명( 매개변수 p2)
		// p1
		p1.dispPoint(p2).dispPoint();	
		// 
		

	}

}
//









//