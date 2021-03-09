package days26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {

	public static void main(String[] args) {
		// 1.  now() 객체 생성
		/*
		LocalDate today = LocalDate.now();
		System.out.println( today );  // 2019-09-03
		
		LocalTime now = LocalTime.now();
		System.out.println( now );    // 10:07:11.815
		*/
		
		// 2019.7.26  날짜 객체 생성. 
		 
		LocalDate sDay = LocalDate.of(2019, 7, 26);
		System.out.println( sDay );
		
		LocalTime t = LocalTime.of(7, 30, 22);
		System.out.println( t );
		
		LocalDateTime dt = LocalDateTime.of( sDay, t );
		
		ZonedDateTime zdt = ZonedDateTime.of( dt , ZoneId.of("Asia/Seoul"));
		 
		
		// 2019-09-03T10:11:31.627
		/*
		LocalDateTime dt = LocalDateTime.now();
		System.out.println( dt );
		*/
		

		LocalDate d = LocalDate.ofYearDay(2019, 250);
		// 0시 0분 0초 기준으로 계산한 값 : 86399
		LocalTime t2 = LocalTime.ofSecondOfDay(86399);
		System.out.println(t2);
	}

}
//









//