package days26;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex04 {

	public static void main(String[] args) {
		// 
		LocalTime t = LocalTime.now();
		/*
		System.out.println( t.getHour() );
		System.out.println( t.getMinute() );
		System.out.println( t.getSecond() );
		System.out.println( t.getNano() );
        */
		
		// get()
		System.out.println( t.get(ChronoField.HOUR_OF_DAY) );
		System.out.println( t.get(ChronoField.MINUTE_OF_HOUR) );
		System.out.println( t.get(ChronoField.SECOND_OF_MINUTE) );
		System.out.println( t.get(ChronoField.NANO_OF_SECOND) );
	}

}
//









//