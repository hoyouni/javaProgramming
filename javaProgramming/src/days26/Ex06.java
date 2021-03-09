package days26;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex06 {

	public static void main(String[] args) {
		// (기억)
		LocalDateTime dt = LocalDateTime.now();
		System.out.println( dt );
		// dt 불변
		/*
		dt = dt.withHour(0);
		dt = dt.withMinute(0);
		dt = dt.withSecond(0);
		dt = dt.withNano(0);
		*/
		
		//
		dt =  dt.truncatedTo(ChronoUnit.DAYS);
		
		
		
		System.out.println( dt );
	}

}
//









//