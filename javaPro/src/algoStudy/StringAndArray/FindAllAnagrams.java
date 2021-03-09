package algoStudy.StringAndArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
	public static List<Integer> solution(String txt, String pat) {
		// 1
		List<Integer> result = new ArrayList<Integer>();
		if(txt == null || txt.length() == 0 || pat == null || pat.length() == 0 || txt.length() < pat.length()) {
			return result;
		}
		
		// 2
		int[] patArr = new int[256];
		for(int i = 0; i < pat.length(); i++) {
			patArr[pat.charAt(i)]++;
		}
		
		for(int i = 0; i < txt.length() - pat.length() + 1; i++) {
			int[] txtArr = new int[256];
			for(int j = 0; j < pat.length(); j++) {
				txtArr[txt.charAt(i + j)]++;
			}
			if(check(patArr, txtArr)) {
				result.add(i);
			}
		}
		return result;
	}
	
	public static boolean check(int[] patArr, int[] txtArr) {
		for(int i = 0; i < patArr.length; i++) {
			if(patArr[i] != txtArr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String txt = "BACDGABCDA";
		String pat = "ABCD";
		List<Integer> result = solution(txt, pat);
		System.out.println(result);
	}
}





















