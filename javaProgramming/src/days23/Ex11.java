package days23;

import java.util.HashSet;

public class Ex11 {

	public static void main(String[] args) {
		String s = "abac";
		//String s = "abcd";
		//String s = "zxzxz";

		System.out.println( solution(s) );

	}

	public static int solution(String s) {
		int answer = 0;
		HashSet<String> set  = new HashSet<>();  // cnt
		int len = s.length();
		HashSet<Character> cset  = null;		
		for (int i = 1; i <= len ; i++) {				
			for (int j = 0; j+i <= len; j++) {				
				cset = new HashSet<>();  // 	
				String sub = s.substring(j,j+i);
				for (int k = 0; k < sub.length(); k++) 	cset.add(sub.charAt(k));
				if( cset.size() == sub.length() )  set.add(sub);
			} 
		}		
		answer = set.size(); 
		return answer;
	}


}
//









//