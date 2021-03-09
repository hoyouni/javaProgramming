package days16;

import days14.Point;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 20. - 오전 10:06:58
 * @Subject p 246
 */
public class Ex01 {

	public static void main(String[] args) {
		// [변수]
		// ㄱ. 필드 - 클래스 변수(static) ,            인스턴스 변수
		// ㄴ. 지역 변수
		// [메서드] p 278 설명
		// ㄱ.         클래스(static)메소드,           인스턴스메소드
		
		/*
		disp(10);
		int [] m = {1,2,3};
		disp(m);
		*/
		
		Point p1 = new Point();
		p1.x = 100;
		// The field Point.y is not visible
		//  접근 X  필드에 접근하는 방법
		//p1.y = 200;  // 쓰기 전용의 필드로 선언.  setter
		p1.setY(200);
		
		Point p2 = new Point();
		p2.x = 1;
		p2.setY(2);
		
		// 필드 방법    :   객체명.필드명
		// 메소드 방법 :  객체명.메소드명()
		p1.dispPoint();  // p1.x=100, p1.y=200
		
		// Point p = p2
		//Point p3 = p1.dispPoint(p2);
		//p3.dispPoint();
		
		p1
		   .dispPoint(p2)
		   .dispPoint();
		
		
		
		/*
		//System.out.println( p1.getY() );
		int kor = 101;
		Student s = new Student();
		// s.kor = kor;
		s.setKor(kor);
		*/
		/*
		if( kor >=0 && kor <=100) {
		   s.kor = kor;
		}
		*/
		
	}

	// call by reference
	private static void disp(int[] m) {  // 참조형 : 배열
	}

	// call by value
	private static void disp(int i) {       // 기본형 : int
		 
	} //
	

}  // class

class Student{
	private int kor;

	// Alt + Shift +S
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if( kor >=0 && kor <=100) {
		   this.kor = kor;
		}else {
			System.out.println(" 국어 점수 범위 벗어남....");
		}
	}
	
	
	
}









//