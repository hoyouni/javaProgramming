package days25;

import java.util.Calendar;
import java.util.Date;

public class Ex13 {

	public static void main(String[] args) {
		// 1. Date -> Calendar 형 변환
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		
		// 2. Calendar -> Date 형 변환
		//                            long
		Date dt = new Date( c.getTimeInMillis() );
		
		
		
		
		System.out.println("---------------------------------------");
		// 현재 날짜
		Calendar today = Calendar.getInstance();
		
		// 수료일
		Calendar finishDay = (Calendar) today.clone();
		finishDay.set(2020, 1, 24);
		
		// 두 날짜 사이의 차이.. 계산
		// long today.getTimeInMillis()
		System.out.println( today.getTimeInMillis() );
		System.out.println( finishDay.getTimeInMillis() );
		long difference = finishDay.getTimeInMillis() - today.getTimeInMillis();
		System.out.println( difference +"ms" );
		System.out.println( difference/1000 +"s" );
		System.out.println( difference/1000/60 +"m" );
		System.out.println( difference/1000/60/60 +"h" );
		System.out.println( difference/1000/60/60/24 +" days" );
		
		// 1 일
		// 24 시간
		// 24 * 60 분
		// 24 * 60 * 60 초
		// 24 * 60 * 60 * 1000 밀리세컨드
		
		

	}

}
//









//