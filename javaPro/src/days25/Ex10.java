package days25;

import java.util.Calendar;

public class Ex10 {

	public static void main(String[] args) {
		// Calendar 추상클래스
		// 완전한 객체 얻어오려면 Calendar.getInstance() ...
		Calendar c = Calendar.getInstance();
		
	    System.out.println(	c.getActualMaximum( Calendar.DATE)   );
	    
	    System.out.println("----");
		
		
		System.out.println(  c );
		//  년, 월, 일, 시간, 분, 초, 
		System.out.println( c.get( Calendar.YEAR ) );
		System.out.println( c.get( Calendar.MONTH ) + 1 );  // 주의
		System.out.println( c.get( Calendar.DATE ) );
		
		System.out.println( c.get(Calendar.HOUR ));                 // 0
		System.out.println( c.get(Calendar.HOUR_OF_DAY ));  // 12    [24시간]
		
		System.out.println( c.get(Calendar.MINUTE ));
		System.out.println( c.get(Calendar.SECOND ));
		// 1000 millisecond == 1 second
		System.out.println( c.get(Calendar.MILLISECOND ));
		
		System.out.println("====");
		System.out.println( c.get(Calendar.AM_PM ));   // 0(AM) 1(PM)
		
		// Calendar  객체로 요일 얻어오기.
		// Date       일(0)                                          토(6)
		// Calendar 일(1)  [월(2)] 화(3)  수(4) 목(5) 금(6) 토(7)  
		System.out.println( c.get(Calendar.DAY_OF_WEEK) );
		

	}

}
//









//