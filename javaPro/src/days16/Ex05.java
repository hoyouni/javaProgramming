package days16;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [생성자]   
		 * 1. 객체 생성될 때 자동으로 호출되는 메서드
		 * 2. 클래스명 == 메서드명
		 * 3. 리턴자료형 X
		 * 4. 오버로딩 가능
		 * 5. 역할 : 필드 초기화
		 * 6. 매개변수가 없는 생성자를 디폴트 생성자 라고 한다.
		 * 7. 상속 X
		 * */

		//  객체 생성될 때 디폴트 생성자가 자동으로 호출된다.
		//  디폴트 생성자를 선언하지 않았다. -> 컴파일러가 자동으로 디폴트 생성자를 생성.
		// The constructor Car() is undefined
		Car myCar1 = new Car();
		// The constructor Car(String, String, int) is undefined
		Car myCar2 = new Car("빨강", "수동", 3);
		System.out.println(" = END = ");
	} // main

} // class

class Car{
	
	// fields 
	String color;
	String gearType;
	int door;
	
	// constructor 
	public Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
		System.out.println("> Car 3 constructor 호출됨.");
	}

	public Car() {  }
	
	// methods
}









//