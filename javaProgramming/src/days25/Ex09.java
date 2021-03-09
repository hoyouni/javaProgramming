package days25;

import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		// 2010.5.1   무슨 요일? 
		Date d = new Date();
		System.out.println( d );
		
		// set???()
		d.setYear(2010 - 1900);
		d.setMonth(5-1);
		d.setDate(1);
		
		System.out.println( d );
		
		System.out.println( "일월화수목금토".charAt(  d.getDay() ) );
		
		//  마지막 몇 일 ?
		
		System.out.println( d.toGMTString()  );
		// 2010. 5. 1 오후 12:01:59
		System.out.println( d.toLocaleString() );
		
		
		

	}

}
//









//