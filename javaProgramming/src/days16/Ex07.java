package days16;
 
/**
 * @Author k≡n¡k
 * @Source Ex07.java
 * @Date 2019. 8. 20. - 오후 12:46:17
 * @Subject p 300 변수의 초기화~
 *                 p 344   [static 키워드] 설명
 *                 static : 필드, 메서드, 클래스,   static 블럭 {}
 */
public class Ex07 {

	public static void main(String[] args) {
		// 객체명.필드명 ,   객체명.메서드명()
		// 클래스명.필드명
		// The field Save.rate [is not visible]
		//System.out.println( Save.rate );
		
		Save.setRate(0.01);
		System.out.println(Save.getRate());
		
		/*p 301
		 * [필드의 초기화 방법]
		 *                 1. 명시적 초기화( explicit initialization )
		 *                      필드 선언과 동시에 초기화하는 것을 "명시적 초기화"
		 * 2. 생성자( constructor )
		 * 3. 초기화 블럭( initialization block )
		 * */
		
		/* 
		Save person1 = new Save("여원경", 20000, 0.03);
		Save person2 = new Save("이영재", 120000, 0.03);
		Save person3 = new Save("정영진", 22000, 0.03);
		Save person4 = new Save("고승우", 5000, 0.03);
		Save person5 = new Save("김지민", 100000, 0.03);
		Save person6 = new Save("김호연", 120000, 0.07);
				
		person1.dispInfo();
		//Save.rate = 0.05;
		person1.rate = 0.04;
		
		person2.dispInfo();
		person3.dispInfo();
		person4.dispInfo();
		person5.dispInfo();
		person6.dispInfo();
		*/ 
		
		// 클래스 배열 선언
		/*
		Save [] persons = new Save[6];		
		persons[0] = new Save("여원경", 20000, 0.03); 
		persons[1] = new Save("이영재", 120000, 0.03);
		persons[2] = new Save("정영진", 22000, 0.03); 
		persons[3] = new Save("고승우", 5000, 0.03);  
		persons[4] = new Save("김지민", 100000, 0.03);
		persons[5] = new Save("김호연", 120000, 0.03);
		
		for(int i=0 ; i< persons.length ; i++)
		       persons[i].dispInfo();
		*/		
		// 클래스 배열 초기화 
		Save [] persons = { 
				   new Save("여원경", 20000, 0.03),
				   new Save("이영재", 120000, 0.03),
				   new Save("정영진", 22000, 0.03), 
				   new Save("고승우", 5000, 0.03),  
				   new Save("김지민", 100000, 0.03),
		           new Save("김호연", 120000, 0.03)
		}; 
	 
		// 배열 초기화
		//int [] m = {1,3,2};
		/*
		int [] m = new int[3];		
		m[0] = 1;
		m[1] = 3;
		m[2] = 2;
		*/
	}

}
// 저축 관련 클래스
// 가정) 기업은행/보통예금
class Save{
	// fields
	// 인스턴스 변수
    String name = null; // 예금주
    int money = 0;    // 예금액
    // 클래스 변수 == 공유변수 == shared 변수 == 정적변수 == static 변수
    private static double rate = 0.02;  // 이자율  1. 명시적  초기화
    
    // static 키워드 getter , setter
    // 클래스 메서드 == static 메서드 == 정적 메서드
    // static 메서드 선언하는 이유?
    // 1. private 선언된 static 변수를 사용하기 위해..
    // 2. 프로그램 코딩 시 자주 사용되기에  클래스명.~~
    public static double getRate() {
    	// 지역 변수 O 
    	// 인스턴스 변수  X
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	// constructors                        2. 생성자 초기화
	public Save(String name, int money, double rate) {
		super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public Save() {
		super();
	}
	
	// method
	// 예금 정보를 출력하는 메소드
	// 인스턴스 메서드 
	public void dispInfo() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n", 
				this.name, this.money, this.rate);
		
	}
	
	// 입금 메소드
	// 출금 메소드
    
}









//