package days19;
/**
 * 날짜 2019. 8. 23.
 * 파일명 Ex06.java
 * 중첩클래스 중 익명클래스(anonymous class)
 */
public class Ex06 {
	public static void main(String[] args) {
		NewCar myCar = new NewCar("신형", "수동", new IEngine() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void moreFuel(int fuel) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void lessFuel(int fuel) {
				// TODO Auto-generated method stub
				
			}
		});
		// 익명 클래스는 클래스 선언과 동시에 생성 -> 일회용 사용 
		// 익명 클래스 선언 형식
		// new 조상클래스이름() { // 멤버 선언부 }
		// new 구현인터페이스이름() {}
		// 주로 이벤트 처리할 때 자주 사용
	}
} //Ex06
