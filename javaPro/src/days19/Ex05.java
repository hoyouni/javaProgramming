package days19;

public class Ex05 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1(); // 인터페이스간 메소드 충돌은 오버라이딩이 반드시 필요하다.
		c.method2(); // 부모클래스와 인터페이스간 메소드 충돌은 부모클래스가 우선순위를 갖는다.
		
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() { // 클래스명.메소드로 호출하기 때문에 문제되지않는다
		System.out.println("staticMethod() in MyInterface");
	}
	
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() { // 클래스명.메소드로 호출하기 때문에 문제되지않는다
		System.out.println("staticMethod() in MyInterface2");
	}
}


class Parent { 
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

class Child extends Parent implements MyInterface, MyInterface2 {
	public void method1() { // 오버라이딩 해야한다.
		System.out.println("method1() in Child");
	}
}


