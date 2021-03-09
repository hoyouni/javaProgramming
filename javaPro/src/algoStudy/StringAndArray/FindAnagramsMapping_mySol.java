package algoStudy.StringAndArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramsMapping_mySol {
	public static int[] solution(int[] a, int[] b) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[a.length];
		
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			map.put(b[i], cnt++);
		}
		
		for(int j = 0; j < b.length; j++) {
			if(map.containsKey(a[j])) {
				result[j] = map.get(a[j]);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] a = {11, 27, 45, 31, 50};
		int[] b = {50, 11, 31, 45, 27};
		int[] result = solution(a, b);
		System.out.println(Arrays.toString(result));
	}
}






























