package days15;

// Car 클래스 선언 부분
public class Car {
	// 클래스 멤버 = 필드 + 메소드
	
	// 멤버 변수( 필드  fields )
	// 특징(속성)
	String name;
	int speed;
	String color;
	
	// 멤버 함수( 메소드 method )
	// 기능(함수, 메소드)
    public void move(){
    	int test; // 필드X   지역변수 O
    	System.out.println("> move method()...");
    }
	public void stop(){
		System.out.println("> stop method()...");
	}
}
//









//