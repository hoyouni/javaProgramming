package javaBasic;

class Calculator3 {
	// 클래스 메소드 static
	public static void sum(int left, int right) {
		System.out.println(left + right );
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

public class ClassMethodAndInstanceMethod {
	public static void main(String[] args) {
		/*
		 * 맴버 : 변수 + 메소드
		 * 만일 메소드가 인스턴스 변수를 참조하지 않는다면 
		 * 굳이 불필요한 인스턴스의 생성으로 메모리 낭비를 하지 않아도 된다
		 */
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}
}





















