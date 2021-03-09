package days26;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 9. 3. - 오전 7:53:40
 * @Subject  p 552
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. java.time 패키지  - JDK 1.8 ~
		 *                              Date , Calendar 날짜,시간 다루는 클래스 + 유용한 기능
		 *    (  4 개의 하위 패키지  )
		 *    java.time                   - 날짜, 시간을 다루는 핵심 클래스 제공
		 *    ㄱ. java.time.chrono    - 표준(ISO)이 아닌 달력 시스템을 위한 클래스 제공 
		 *    ㄴ. java.time.format    - 날짜, 시간, 파싱(parse), 형식화하기 클래스 제공
		 *    ㄷ. java.time.temporal - 날짜, 시간의 필드와 단위를 위한 클래스 제공
		 *    ㄹ. java.time.zone       -  시간대(time-zone) 관련 클래스 제공.                              
		 * 
		 * 2. 위의 패키지에 속한 클래들은 "불변" 한다. (  String )
		 *    String a  = "a";
		 *    a += "a";  
		 *    
		 * 3. Date, Calendar 클래스 = 날짜 + 시간 정보
		 *    java.time 패키지의 클래스는 날짜, 시간 클래스를 구분(분리).
		 *    ㄱ. 날짜 : LocalDate 클래스
		 *    ㄴ. 시간 : LocalTime 클래스
		 *    ㄷ. 날짜 + 시간 : LocalDateTime
		 *         날짜 + 시간 + 시간대 : ZonedDateTime
		 *    ㄹ. Date 클래스 유사한 클래스  : Instant 클래스     
		 *                                            날짜+시간을 초단위(나노)로 표현
		 *    ㅁ. "타임스탬프" 정의 ? 날짜와 시간을 초단위로 표현한 값.
		 *                        사용 ?  날짜또는 시간의 차, 순서, DB 에서 많이 사용                                         
		 *    ㅂ. 날짜 세부 클래스 : Year, YearMonth, MonthDay 클래스 등등                    
		 *
		 *  4.  Period 와 Duration
		 *    ㄱ. 날짜 - 날짜  ( 간격 ) : Period 클래스 
		 *                                    두 날짜 간의 차이를 표현하기 위해서 사용하는 클래스 
		 *    ㄴ. 시간 - 시간  ( 간격 ) : Duration 클래스 
		 *   
		 * 5. java.time 패키지의 속한 클래스의 객체 생성하는 방법
		 *    ㄱ.    now()
		 *    ㄴ.    of()
		 *      
		 * 6.   class LocalDate  implements Temporal, TemporalAccessor, TemporalAdjuster
		 *       class LocalTime  implements Temporal, TemporalAccessor, TemporalAdjuster
		 *       class LocalDateTime  implements Temporal, TemporalAccessor, TemporalAdjuster
		 *       
		 *       Period      implements TemporalAmount
		 *       Duration  implements TemporalAmount
		 * 
		 * 7. TemporalUnit 인터페이스 ? 날짜, 시간의 단위를 정의해 놓은 것.
		 *    위의 인터페이스를 구현한 열거형( enum ) ? ChronoUnit 열거형
		 *    
		 *     TemporalField 인터페이스 ? 년, 월, 일 등 날짜와 시간의 필드를 정의해 놓은 것.
		 *                                                       ? ChronoField 열거형.
		 * 
		 * 8.  마지막 날짜
		 *     2010.6.1 - 1 날짜객체.일		 *     add( 일 , - 1)
		 *     
		 *     plus(),   minus() 등등 날짜,시간을 다루는  메서드 제공. 
		 * */
		
		LocalDate today = LocalDate.now();
		// 불변 
		// LocalDate  tomorrow = today.plus(1, ChronoField.MINUTE_OF_HOUR);
		
		
		/*
		// 현재 시간
		LocalTime now = LocalTime.now();
		// 분
		int m = now.getMinute();
		System.out.println(m);
		m =  now.get( ChronoField.MINUTE_OF_HOUR);
		System.out.println(m);
		*/
		/*
		LocalDate d = LocalDate.now();  // 현재 시스템의 날짜. 시간. 시간대..
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		*/
		
		// of ()   사용자 원하는 날짜.시간.시간대 설정해서 객체를 생성.
		//LocalDate.of(year, month, dayOfMonth)
		
		 
		
		
	}

}

// 김예주(병원)


 








//