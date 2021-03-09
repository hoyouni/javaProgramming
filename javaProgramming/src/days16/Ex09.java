package days16;

import java.util.ArrayList;

/**
 * @Author k≡n¡k
 * @Source Ex09.java
 * @Date 2019. 8. 20. - 오후 3:19:06
 * @Subject TODO 
 */
public class Ex09 {

	public static void main(String[] args) {
		// [this 키워드]                                              - 상속( super 키워드)
		// 1. 정의 ? 클래스 자기 자신의 주소값을 갖는 [참조변수]
		// 0x100
		// Point p1 = new Point();  // 변수, [참조변수], 객체
		//    0x100
		// Point this = 자신 주소값;
		//  선언한 적 X      this [0x100] 
	 
		// 2.  3가지 용도
		//     ㄱ. 멤버를 가리킬 때의 this 용도
		Product p1 = new Product();
		
		//     ㄴ. 생성자에서 또 다른 생성자를 호출할 때의 this 용도
		
		//p1.name ="제품 100";

		System.out.println( p1.name );
		// System.out.println(" END ");
	}

}// class

// p 306
class Product{
	int serialNo;    // 고유번호
	int count = 0 ; // 생성된 인스턴스의 수를 저장하기 위한 변수
	String name;    // 제품명
	
	public Product() {
		//this(1,"제품 1");
		System.out.println("> Product default constructor 호출됨...");
	}
	public Product(int serialNo, String name) {
		//this();
		// 필드 초기화...
		this.serialNo = serialNo;
		this.name = name;
		
		System.out.println("> Product 2 constructor 호출됨...");
	}
}

 







//