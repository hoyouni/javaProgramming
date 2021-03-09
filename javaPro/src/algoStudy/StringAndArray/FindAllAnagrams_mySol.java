package algoStudy.StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams_mySol {
	public static int[] solution(String txt, String pat) {
		List<Integer> list = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < txt.length() - 3; i++) {
			sb = sb.append(txt.substring(i, i + 4));
			
			int cnt = 0;
			for(int j = 0; j < pat.length(); j++) {
				if(sb.toString().contains(txt.substring(j, j + 1))) {
					cnt++;
				}
			}
			if(cnt == 4) {
				list.add(i);
			}
			sb = new StringBuffer();
		}
		
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String txt = "BACDGABCDA";
		String pat = "ABCD";
		int[] result = solution(txt, pat);
		System.out.println(Arrays.toString(result));
	}
}
































