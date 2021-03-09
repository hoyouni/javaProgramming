package algoStudy.StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] list = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(list));
	}

	public static List<List<String>> groupAnagrams(String[] list) {
		List<List<String>> result = new ArrayList<List<String>>();
		if(list == null || list.length == 0) {
			return result;
		}
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String str : list) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			
			String key = String.valueOf(charArr);
			
			if(map.containsKey(key)) {
				map.get(key).add(str);
			} else {
				List<String> list2 = new ArrayList<String>();
				list2.add(str);
				map.put(key, list2);
			}
			
		}
		result.addAll(map.values());
		return result;
	}
}































