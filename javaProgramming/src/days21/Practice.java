package days21;

import java.util.Arrays;

public class Practice {
	public static String solution(String s) {
		System.out.println(s.length());
		String[] splitS = s.split(" ",-1);
		String result = "";
		
		for(int i = 0; i < splitS.length; i++) {
			for(int j = 0; j < splitS[i].length(); j++) {
				if(j % 2 == 0) {
					result += Character.toString(splitS[i].charAt(j)).toUpperCase();
				} else 
					result += Character.toString(splitS[i].charAt(j)).toLowerCase();
				}
			if(result.length() < s.length()) 
				result += " ";
				
		} 
		System.out.println(result.length());
		//System.out.println(result.length());
		return result;
	}

	public static void main(String[] args) {
		String s = "try       hello world";
		String result = solution(s);
		System.out.println(result);
	}
}
