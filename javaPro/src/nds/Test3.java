package nds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test3 {
	public static int[] solution(int N, int[] coffee_times) {
		// N 이 1일 경우
		int[] result = new int[coffee_times.length];
		for(int i = 0; i < result.length; i++) {
			result[i] = i + 1;
		}
		if(N == 1) {
			return result;
		}

		// 그 외 
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < coffee_times.length; i++) {
			map.put(i + 1, coffee_times[i]);
		}
		
		List<Integer> list2 = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			list2.add(i + 1);
		}
		
		int size = list2.size();
		while(list.size() != map.size()) {
			while(!map.containsValue(0)) {
				for(int i = 0; i < list2.size(); i++) {
					if(map.containsKey(list2.get(i))) {
						map.put(list2.get(i), map.get(list2.get(i)) - 1);
					}
				}
			}
			
			for(int i = 0; i < list2.size(); i++) {
				if(map.get(list2.get(i)) == 0) {
					list.add(list2.get(i));
					map.put(list2.get(i), 100000);
					list2.set(i, size++);
				}
			}
		}
		
		//
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int N = 5;
		int[] coffee_times = {1, 2, 3, 4, 5, 6, 7};
		int[] result = solution(N, coffee_times);
		System.out.println(Arrays.toString(result));
	}
}


































