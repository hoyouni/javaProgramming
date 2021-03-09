package days19;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 23. - 오전 8:10:27
 * @Subject 
 */
public class Ex01 {

	public static void main(String[] args) {
		/* 
		Employee emp1 = new Employee("홍길동", "당산", "020-1234-1234", "2018.12.21");
		emp1.dispEmpInfo();
		*/
		
		//Regular emp2 = new Regular("이영재", "안산", "010-1333-1222", "2018.11.01", 2500000);
		// 다형성
		// UpCasting : 자식-참조->부모 / 자동 형 변환
		/*
		Employee emp2 = new Regular("이영재", "안산", "010-1333-1222", "2018.11.01", 2500000);
		emp2.dispEmpInfo();
	    System.out.println(emp2.getPay());
        */
		
		/*
		Employee emp3 = new SalesMan("정영진", "목동", "010-3423-1232", "2017.04.07", 500000, 20, 75000);
		emp3.dispEmpInfo();
	    System.out.println(emp3.getPay());
		*/
		
		/*
		Employee emp4 = new Temp("여원경", "역삼", "010-5444-1562", "2019.01.05",  20, 150000);
		emp4.dispEmpInfo();
	    System.out.println(emp4.getPay());
	    */
		
		// 모든 사원의 급여 정산...
		/*
		Regular emp2 = new Regular("이영재", "안산", "010-1333-1222", "2018.11.01", 2500000);
		SalesMan emp3 = new SalesMan("정영진", "목동", "010-3423-1232", "2017.04.07", 500000, 20, 75000);		 
		Temp emp4 = new Temp("여원경", "역삼", "010-5444-1562", "2019.01.05",  20, 150000);
		
		// 
	    System.out.println(emp2.getPay());	 
	    System.out.println(emp3.getPay()); 
	    System.out.println(emp4.getPay());
	    
	    모든사원급여계산해라( emp2 )   // 매개변수 다형성
	    모든사원급여계산해라( emp3 ) 
	    모든사원급여계산해라( emp4 ) 
	    */
		
		// 클래스 배열 초기화 + UpCasting
		Employee [] emps = {
				  new Regular("이영재", "안산", "010-1333-1222", "2018.11.01", 250000),
				  new SalesMan("정영진", "목동", "010-3423-1232", "2017.04.07", 50000, 20, 75000),		 
				 new Temp("여원경", "역삼", "010-5444-1562", "2019.01.05",  20, 150000)
		};
		
		// 다형성
		for (int i = 0; i < emps.length; i++) {
				emps[i].dispEmpInfo();
		}
	}
	 
	//                                                    참조타입 매개변수
	/*
	public static void 모든사원급여계산해라( Employee emp ) {
		// emp   R/S/T 객체
		// instanceof 연산자
		if ( emp instanceof SalesMan) {
			// DownCasting
			SalesMan e =  (SalesMan) emp;
			// 
		} else if ( emp instanceof Regular) {
			Regular e =  (Regular) emp;
			// 
		}else if ( emp instanceof Temp) {
			// DownCasting
			Temp e =  (Temp) emp;
			// 
		}
		 
		System.out.println(emp.getPay());
	}
    */
}
// 천재희 ( 아파서 결석 )
// 장동환 ( 아파서 결석 )
// 박성훈 ( 결석 )
// 정영진 ( 늦잠 지각 10:00 )
// 김호연 ( 늦잠 지각 10:27 )
// 정의호 ( 늦잠 지각 예정 )
// 









//
