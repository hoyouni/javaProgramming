package days26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex07 {

	public static void main(String[] args) {
		// 
		//LocalDate d = LocalDate.now();
		//LocalTime t = LocalTime.now();
		
		// [ LocalDate +  LocalDate ] LocalDateTime 객체 생성 방법. 
		// 1. LocalDateTime dt = LocalDateTime.of(d, t);   ***
		// 2. LocalDateTime dt = d.atTime(t);
		// 3. LocalDateTime dt =t.atDate(d);
		
		//String d = "2020-12-22";		
		//String d = "2020/12/22";
		String d = "2020.12.22";
		//String d = "2020년12월22일";
		
		// String -> LocalDate 형 만들기
		// java.time.format.DateTimeParseException
		//LocalDate date =  LocalDate.parse(d);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate date =  LocalDate.parse(d , formatter );
		System.out.println(date);
		
		//String t = "10:12:23";
		String t = "01h03m12s";
		// LocalTime lt = LocalTime.parse(  t );
		LocalTime lt = LocalTime.parse(  t , DateTimeFormatter.ofPattern("HH'h'mm'm'ss's'"));
		System.out.println( lt );		 // toString() 재정의 

	}

}
//









//