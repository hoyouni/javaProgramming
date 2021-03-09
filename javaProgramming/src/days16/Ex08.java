package days16;

public class Ex08 {

	// static  main()  
	public static void main(String[] args) {
		
		// Ex08 obj = new Ex08();
		// obj.hap(1, 32)
		
		// 클래스명.클래스메서드();
		Ex08.hap(1,2);
		
		hap(1,4); // 클래스명 생략된 경우
		
		disp();
		
		// 클래스 안에 필드를 클래스변수(static변수)로 선언해서 사용하는 이유? 
		// 1. 모든 인스턴스가 공유할 변수(필드)가 필요하다면... 
		// 2. 
		/*
		System.out.println( Math.PI );
		System.out.println( Math.abs(-10) );
		System.out.println( Math.pow(2, 3) );
		System.out.println( Math.max(3, 5) );
		System.out.println( Math.min(3, 5) );
		System.out.println( Math.random() );
		*/

	}
	
	public static int hap(int a, int b) {
		return a+b;
	}

	private static void disp() {
		System.out.println("> disp() ~ ");
	}

}
//









//