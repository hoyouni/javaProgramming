package days25;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		// 마지막 날짜 얻어올때... 
		Calendar c = Calendar.getInstance();
		c.set(2010, 5, 1); // 2010.6.1    2010.5.마지막날자
		c.add(Calendar.DATE, -1);
		System.out.println( c.get(Calendar.DATE) ); //
		
		// 1. 2019.7.26
		//    ㄱ.  무슨 요일 ? 
		c.set(2019, 7-1, 26, 9, 0, 0);
		System.out.println(  c.get(Calendar.DAY_OF_WEEK) );
		
		//    ㄴ.  100일째 되는 날 ?
		c.add(Calendar.DATE , 100);
		System.out.println( c.get(Calendar.YEAR) +"년 "
		+ (c.get(Calendar.MONTH)+1)+"월 "+ c.get(Calendar.DATE) +"일" );
		
		//    ㄷ. 오늘부터 개강일까지 몇 일 지났는지? 
		
		//    ㄹ.  2020. 2. 24  수료하는 날까지 몇 일 남았는 지 ? 

		

	}

}
//









//