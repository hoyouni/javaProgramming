package days25;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ex16_02 {

	public static void main(String[] args) {
	  
		int money = 1234123;
		                //  7    654  321
		//                 "1    234   123"
		//                  1 ,
		//                  3으로 나눠서 나머지 1이라면   ,
		String m =  money + ""; 
		
		StringBuffer sb = new StringBuffer();		
		int len = m.length();
		for (int i = 0; i < m.length(); i++, len--) {
			sb.append(   m.charAt(i)  );
			if( len % 3 == 1)	sb.append(',');
		}
		
		System.out.println(sb);
		
		System.out.println("end");
		
		 
 
		
	}
	
	

}
//









//