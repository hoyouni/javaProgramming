package days19;
/**
 * 날짜 2019. 8. 23.
 * 파일명 Ex07.java
 * 인터페이스 예제
 * days17 Ex06
 * days19 IEngine 인터페이스
 * days19 Engine 추상클래스
 * days19 newCar 클래스
 */
public class Ex07 {
	public static void main(String[] args) {
		
		NewCar myCar = new NewCar("신형", "수동", new S_Engine());
		//NewCar myCar = new NewCar("신형", "수동", new L_Engine());
		//NewCar myCar = new NewCar("신형", "수동", new K_Engine());
		
		
	}
} //Ex07
