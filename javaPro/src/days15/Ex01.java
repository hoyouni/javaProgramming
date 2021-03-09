package days15;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 19. - 오전 7:36:01
 * @Subject  4시 이후 상담
 */
public class Ex01 {

	public static void main(String[] args) {
		// [지역변수]는 반드시 초기화해서 사용해야 된다.
		/*
		int age ;
		age = 10;
		// The local variable age may not have been initialized
		System.out.println(age);
		*/
		
		// 1. Car 클래스 선언 - 클래스도 참조타입의 일종( 자료형 )
		// 2. Car 객체 선언
		// 객체 ? "클래스를 자료형으로 선언된 참조변수"
		// 클래스자료형 객체;  // 변수, 지역변수, 참조변수, 객체
		// Car myCar = null;
		// 3. 클래스 생성 
		Car myCar = new Car();
		// 3. 클래스에 선언된 멤버(필드,메서드)를 사용하는 방법.
		// 변수명.필드명   변수명.메소드명()
		// The local variable myCar may not have been initialized
		myCar.move();
		//myCar.stop();
		//  myCar.필드  X
		
		// The field Car.name is not visible
		System.out.println( myCar.name );
		
		
		
	}

}
//









// 김예주( 아파서 결석 )