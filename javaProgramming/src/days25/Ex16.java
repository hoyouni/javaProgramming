package days25;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ex16 {

	public static void main(String[] args) {
		// p 540 ~ p 551 형식화 클래스
		//    ??? Format
		//          형식화   클래스
		// 1. DecimalFormat                 - 숫자
		// 2. SimpleDateFormat ( *** ) - 날짜
		// 3. ChoiceFormat                   - 선택 ?
		// 4. MessageFormat                - 문자열
		
		int n = 12;
		//System.out.println(n);  // 0012   
		
		//String output = String.format("%04d", n);
		//System.out.println(output);
		
		// p 541  표 10-1                                    기호  0
		//DecimalFormat df = new DecimalFormat("0000");
		//System.out.println( df.format(n));
		
		int money = 1234123;
		//                  1,234,123     세자리 마다 콤마 출력..
		String m = money +"";  // "1234123";
		
		ArrayList<Character> list = new ArrayList<>();
		int len = m.length();
		for (int i = 0; i < len ; i++) {
			char one = m.charAt(   len -i -1 );
			list.add(one);
			if( i%3 == 2) list.add(',');
		}
		System.out.println( list );
		// 순서 뒤 집기.. 		
		Collections.reverse(list);		
		System.out.println(list);		
		
		// ArrayList<Character> -> String 변환.
		StringBuilder sb = new StringBuilder();
		Iterator<Character> ir = list.iterator();
		while (ir.hasNext()) {
			Character c =  ir.next();
			sb.append(c);
		}
		
		System.out.println(sb);
		
		
		
		 
 
		
	}
	
	

}
//









//