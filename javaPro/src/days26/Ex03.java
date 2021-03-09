package days26;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex03 {

	public static void main(String[] args) {
		// 특정 필드의 값을 얻어오기 - get(), getXXX()
		// p 556 표 10-4
		
		LocalDate now = LocalDate.now();
		System.out.println( now.get(ChronoField.YEAR) );  						// 년
		System.out.println( now.get(ChronoField.MONTH_OF_YEAR) ); 	// 월
		System.out.println( now.get(ChronoField.DAY_OF_MONTH) ); 	// 일
		System.out.println( now.get(ChronoField.DAY_OF_WEEK) );  		// 요일
				
		/*
		
		System.out.println( now.lengthOfMonth() );  //  날짜. 마지막 날짜.
		System.out.println( now.isLeapYear() ); // false 윤년체크
		System.out.println( now.getYear() ); // 2019
		System.out.println( now.getMonth() ); //SEPTEMBER
		System.out.println( now.getMonthValue() ); //9
		System.out.println( now.getDayOfMonth() ); // 3
		System.out.println( now.getDayOfYear() );    // 246
		System.out.println( now.getDayOfWeek() );   // TUESDAY 요일
		// 
		System.out.println( now.getDayOfWeek().getValue() );   // 화(2)
		*/
		

		

	}

}
//









//