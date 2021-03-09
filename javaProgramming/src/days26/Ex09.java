package days26;

import java.time.LocalDate;
import java.time.Period;

public class Ex09 {

	public static void main(String[] args) {
		// p 567 Period와 Duration
		//        날짜-날짜     시간-시간
		LocalDate now = LocalDate.now();
		LocalDate eDay = LocalDate.of(2020, 2, 24);
		// 위의 두 날짜 간격 :         0 <=     < e
		Period  p = Period.between(now, eDay.plusDays(1) );
		// p 568      between()와 until() 비교
		// Period  p = now.until(eDay.plusDays(1));
		
		System.out.println(p);  // P5M22D
		
		System.out.println( p.getYears() );
		System.out.println( p.getMonths() );
		System.out.println( p.getDays() );
		

	}

}
//









//