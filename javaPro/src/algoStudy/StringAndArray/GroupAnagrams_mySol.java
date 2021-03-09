package algoStudy.StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams_mySol {
	public static String[][] solution(String[] input) {
		Map<String, List<Integer>> map = new HashMap<>();
		
		for(int i = 0; i < input.length; i++) {
			int[] pattern = new int[256];
			List<Integer> list = new ArrayList<>();
			String str = input[i];
			for(int j = 0; j < str.length(); j++) {
				pattern[str.charAt(j)]++;
			}
			
			for(int k = 0; k < pattern.length; k++) {
				if(pattern[k] != 0) {
					list.add(k);
				}
			}
			map.put(str, list);
			
		}
		
		String[][] result = new String[input.length + 1][input.length + 1];
		System.out.println(map);
		
		for(int i = 0; i < input.length - 1; i++) {
			Set<String> set = new HashSet<>();
			for(int j = i + 1; j < input.length; j++) {
				if(map.get(input[i]).equals(map.get(input[j]))) {
					
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		String[][] output = solution(input);
		System.out.println(Arrays.deepToString(output));
	}
}


































