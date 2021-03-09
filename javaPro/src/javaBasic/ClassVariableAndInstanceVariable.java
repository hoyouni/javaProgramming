package javaBasic;

class Calculator {
	// 클래스 소유 변수? static, 모든 인스턴스(객체)에서 똑같은 값을 갖고있는것, 모든 인스턴스가 공유하는 변수
	final static double PI = 3.14;
	static int base = 0;
	//인스턴스 소유 변수? 인스턴스 마다 각각 다른 변수값을 갖고 있는 것
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right + base);
	}
	
	public void avg() {
		System.out.println((left + right) / 2 + base);
	}
}

public class ClassVariableAndInstanceVariable {
	public static void main(String[] args) {
		/*
		 * member?
		 * field?
		 * 클래스 맴버와 인스턴스 맴버
		 * 객체 : 변수와 메소드의 집합 
		 * 클래스 변수의 용도 : 인스턴스에 따라서 변하지 않는 값이 필요할 경우
		 * 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우 - 메모리 낭비 줄일 수 있다.
		 * 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
		 */
		
		Calculator c1 = new Calculator();
		// 인스턴스를 이용한 호출 
		System.out.println(c1.PI);
		
		// 클래스 변수는 클래스를 통해 직접 호출 할 수 있음
		System.out.println(Calculator.PI);
		
		Calculator c2 = new Calculator();
		
		// 클래스 변수 base 값을 10으로 지정 
		Calculator.base = 10;
		c2.setOprands(10, 20);
		c2.sum();
	}
}









