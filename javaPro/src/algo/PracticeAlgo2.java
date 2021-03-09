package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo2 {
	public static String solution(String s) {
	      String[] s1 = s.split(" ");
	      int[] num = new int[s1.length];
	      for(int i = 0; i < s1.length; i++) {
	    	  num[i] = Integer.parseInt(s1[i]);
	      }
	      
	      List<Integer> list = new ArrayList<Integer>();
	      for(int i = 0; i < num.length; i++) {
	    	  list.add(num[i]);
	      }
	      
	      int num1 = Collections.max(list);
	      int num2 = Collections.min(list);
	      
	      return num2 + " " + num1;
		
	      
	  }
	
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String result = solution(s);
		System.out.println(result);
	}
}






























