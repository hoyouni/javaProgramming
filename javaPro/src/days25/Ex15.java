package days25;

import java.util.Calendar;

public class Ex15 {

	public static void main(String[] args) {
		// p 535 , p 536 달력.
		int year = 2019, month=10;
		// 2019.10.1 무슨 요일 ? 
		//                 마지막 날짜?
	    Calendar c = Calendar.getInstance();
	    c.set(year, month-1, 1);
	    // 일(1) 월(2) 화(3)   ~ 토(7)	    
	    //                  3
	    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	    c.add(Calendar.DATE, -dayOfWeek+1);  
	    //
	    System.out.println("\tSU\tMO\tTU\tWE\tTH\tFR\tSA");
	    for (int i = 0; i < 42; i++) {	    	
			int date = c.get(Calendar.DATE);
			if( month == c.get(Calendar.MONTH)+1)
				System.out.printf("\t[%d]", date);
			else
				System.out.printf("\t%d", date);
			c.add(Calendar.DATE,   1 );
			if( i%7==6) System.out.println();
		}
		

	}

}
//









//