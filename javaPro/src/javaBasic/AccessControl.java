package javaBasic;

class A {
	public String y() {
		return "y()";
	}
	
	private String z() {
		return "z()";
	}
	
	public String x() {
		return z();
	}
}

public class AccessControl {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z());
		System.out.println(a.x());
	}
}



























