package doItAlgo;

// 클래스 메소드와 인스턴스 메소드
class Id {
	private static int counter = 0;
	private int id;
	
	// 생성자
	public Id() {
		id = ++counter;
	}
	
	// 아이디를 반환하는 메소드
	public int getId() {
		return id;
	}
	
	// counter를 반환하는 메소드
	public static int getCounter() {
		return counter;
	}
}

public class Ex03C_01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a 의 아이디 : " + a.getId());
		System.out.println("b 의 아이디 : " + b.getId());
		
		System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
		
	}
}

































