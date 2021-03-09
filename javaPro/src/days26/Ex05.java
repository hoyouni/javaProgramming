package days26;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex05 {

	public static void main(String[] args) {
		// p 557
		// 필드의 값 변경하기 - with() / plus() / minus()
		LocalDate now = LocalDate.now();
		System.out.println( now );                      // 2019-09-03
		
		// 2020 년도 수정 - with()
		// System.out.println( now.withYear(2020) );
		System.out.println( now.with( ChronoField.YEAR, 2020 )  );
		
		
		// 년(필드) +/-변경
		//System.out.println( now.plusYears(5) );   // 2024-09-03
		//System.out.println( now.minusYears(5) ); // 2014-09-03
		 
		//System.out.println( now.plus(5,  ChronoUnit.YEARS ) );
		//System.out.println( now.minus(5,  ChronoUnit.YEARS ) );
		

	}

}
//









//