package programmers;

import java.util.ArrayList;
import java.util.List;

public class Programmers_Lv1_dart {
	public static int solution(String dartResult) {
		List<List<Character>> result = new ArrayList<List<Character>>();
		List<Character> list;
		
		int idx = 1;
		for(int i = 0; i <= dartResult.length() - 1; i+= 2) {
			list = new ArrayList<Character>();
			for(int j = i; j <= idx; j++) {
				list.add(dartResult.charAt(j));
			}
			if(dartResult.charAt(idx + 1) == '#' || dartResult.charAt(idx + 1) == '*') {
				list.add(dartResult.charAt(idx + 1));
				i++;
			}
			result.add(list);
			idx += 2;
			
		}
		
		System.out.println(result);
		
		return -1;
	}

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int result = solution(dartResult);
		System.out.println(result);
	}
}


































