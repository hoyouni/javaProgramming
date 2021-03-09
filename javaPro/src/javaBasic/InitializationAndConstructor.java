package javaBasic;

class Calculator4 {
	int left, right;
	
	// 생성자
	public Calculator4() {}
	
	// 생성자
	public Calculator4(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left + right) / 2);
	}
	
}

public class InitializationAndConstructor {
	public static void main(String[] args) {
		Calculator4 c1 = new Calculator4(10 ,20);
		c1.sum();
		c1.avg();
	}
}













