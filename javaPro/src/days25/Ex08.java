package days25;

import java.util.Date;

/**
 * @Author k≡n¡k
 * @Source Ex08.java
 * @Date 2019. 9. 2. - 오전 11:24:37
 * @Subject p 528 Chapter 10 날짜와 시간 & 형식화
 *                                          date   time   formatting
 */
public class Ex08 {

	public static void main(String[] args) {
		// 날짜 와 시간
		// Calendar 클래스와 Date 클래스 
		// 1. Date 클래스         :     날짜, 시간을 다룰 목적 JDK 1.0~ 제공된 클래스.
		// 2. Calendar 클래스 : JDK 1.1.  제공... 
		// 사용하지 말라고.................. ...취소선.. 
		
		// 3. JDK 1.8 ~ 새로운 날짜,시간을 다루는 클래스 제공...
		Date now = new Date();
		System.out.println(now); // Mon Sep 02 11:32:39 KST 2019
		System.out.println(now.toString()); // Mon Sep 02 11:32:39 KST 2019
		
		// long   1567391600222              1970.1.1 00:00:00:000  밀리세컨드
		long l =  now.getTime() ;
		
		// long 생성자 (기억)
		//Date d = new Date(l);  // long
		//System.out.println(d );
		// 날짜, 시간 정보.. 
		System.out.println( now.getYear() + 1900 );  // 119
		System.out.println( now.getMonth() + 1  );    // 8
		System.out.println( now.getDate() );             // 2
		System.out.println( now.getHours() );
		System.out.println( now.getMinutes() );
		System.out.println( now.getSeconds() );
		System.out.println( now.getDay() );  // 일(0)            토(6)
		
		//  ????년 ??월  ??일 ( ??요일)   ??:??:??
		System.out.println(  getFormatDate( now ) );
		
	}
	
	public static String getFormatDate(Date d) {
		return String.format("%d년 %d월  %d일 ( %c요일)   %d:%d:%d", 
				d.getYear()+1900, 
				d.getMonth()+1,
				d.getDate(),
				"일월화수목금토".charAt(d.getDay()),
				d.getHours(),
				d.getMinutes(),
				d.getSeconds()
				);
	}

}
//









//