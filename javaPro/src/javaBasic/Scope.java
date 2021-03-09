package javaBasic;

public class Scope {
	// 클래스 메소드
	// 메소드 안에서 변수를 선언하면 메소드 안에서만 유효한 변수가 된다.
	
	// 전역변수
	static int j;
	
	static void a() {
		// 지역변수 
		int i = 0;
		
		j = 0;
	}
	
	public static void main(String[] args) {
		for(j = 0; j < 5; j++) {
			a();
			System.out.println(j);
		}
	}
}





























