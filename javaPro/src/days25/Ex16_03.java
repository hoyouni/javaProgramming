package days25;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ex16_03 {

	public static void main(String[] args) {
	  
		int money = 1234123; 
		
		// 기호 0                     0-9 십진수 숫자 0
		// 기호 #                     0-9 십진수 숫자    
		DecimalFormat df = new DecimalFormat("#,###,###,###");
		System.out.println( df.format(money) );
		
		System.out.println("end");
		
	}
	
	

}
//









//