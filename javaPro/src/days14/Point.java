package days14;

public class Point {
	// fields  == 멤버변수
	// 1. 클래스변수
	// 2. 인스턴스 변수
	public int x;
	int y;   // default
	private int z;
	protected int t ;
	
	// Point this; = 0x100
	
	// default constructor
	// 매개변수가 없는 생성자를 디폴트 생성자
	
	// 생성자는 중복선언할 수 있다. ( 오버로딩 가능 )
	public Point() {
		// 필드 초기화
		x = 10;
		y = 10;
		z = 10;
		t = 10;
		System.out.println("> Point default constructor  호출됨.");
	}
	public Point(int a, int b) {
		// 필드 초기화 
		x = a;
		y = b;
		System.out.println("> Point 2 constructor  호출됨.");
	}
	
	// setter
	public void setY(int n) {
		y = n;
	}
	// getter
 
	public int getY() {
		return y;
	}
	 
	
	// method
	public void dispPoint() {
		int temp; // 지역변수
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
		// return ;
	}
	
	// 참조형 매개변수 추가...
   /*
	public Point dispPoint(Point p) {	
		System.out.printf("x=%d, y=%d\n", p.x, p.y); 
		return p;
	}
	*/
	 
	
	//              p1.dispPoint(p2) 
	public Point dispPoint(Point p) {	
		System.out.printf("x=%d, y=%d\n", p.x, p.y); 
		return this; // 리턴값....
	}
	 

}
/*
 * Modifers = 접근지정자 + 기타제어자
 * 1) 접근지정자 (  access modifiers ) 
 *     ㄱ. public                        다른 패키지에서도 클래스를 사용(참조, 상속)할 수 있다.
 *         import days14.Point; 
 *         
 *     ㄴ. (default == package) 같은 패키지 내에서만 사용(참조, 상속)할 수 있다.
 *     
 *     중첩클래스를 선언할때[만] 사용.
 *     ㄷ. private( 비활성화 )     : 같은 [파일] 내에서 상속,참조 가능   Ex03 + TV  => Ex03.java
 *     ㄹ. protected( 비활성화 )  : 같은 [패키지] 내에서 상속, 참조 가능
 *                                           + 다른 패키지에서 상속만 가능
 * 2) 기타제어자
 *     ㄱ. abstract : 추상 클래스
 *     ㄴ. final       : 최종(마지막) 클래스
 *     ㄷ. static( 비활성화 )   : 정적(static) 클래스 
 * 
 * */









//