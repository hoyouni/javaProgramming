package days25;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex18 {

	public static void main(String[] args) {
		// p 544 SimpleDateFormat  형식화 클래스
		// Date, Calendar 클래스   년,월,일,시,분,초  출력형식... 
		// 2010. 5. 1 오후
		// yyyy. M. d a
		
		// "2019Y 09M 02D"
		/*
		Date d = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd(E) a hh:mm:ss:S");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'Y' MM'M' dd'D'");
		System.out.println( sdf.format(d) );
		*/
		
		Calendar c =  Calendar.getInstance();
		DateFormat sdf = new SimpleDateFormat("yyyy'Y' MM'M' dd'D'");
		// *** [ Calendar -> Date 변환 ]  ***
		// Date d = new Date( c.getTimeInMillis() );
		Date d =  c.getTime();
		System.out.println( sdf.format(d) ); 
		
		
		

	}

}
//









//