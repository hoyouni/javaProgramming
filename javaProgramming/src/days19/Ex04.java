package days19;

/**
 * 날짜 2019. 8. 23.
 * 파일명 Ex04.java
 * p 400 
 * 인터페이스 멤버 : 상수, 추상메소드, 디폴트 메소드, static 메소드
 */
public class Ex04 {
	public static void main(String[] args) {
		
	}
} // Ex04

interface Test {
	// 상수 		 : public static final
	// 추상 메소드 : public abstract 
	
	default void s( ) {
		
	}
	
	static void t() { // static이므로 클래스 처럼 Test.t() 로 호출 가능
		System.out.println("t");
	}
} //Test

class T1 implements Test {
	public void rrr() {}
}