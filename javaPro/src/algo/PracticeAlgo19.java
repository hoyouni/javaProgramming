package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PracticeAlgo19 {
	public static int[] solution(int[] progresses, int[] speeds) {
		Stack<Integer> st1 = new Stack<Integer>();
		for(int i = 0; i < progresses.length; i++) {
			st1.push(progresses[i]);
		}

		Collections.reverse(st1);
		System.out.println(st1);

		List<Integer> list = new ArrayList<Integer>();
		
		int cnt = 0;
		while(!st1.isEmpty()) {
			for(int i = 0; i < st1.size(); i++) {
				if(st1.peek() >= 100) {
					cnt++;
					st1.pop();
					list.add(cnt);
					if(list.get(list.indexOf(list.size() - 1)) > cnt - 1) {
						for(int j = i; j < list.indexOf(cnt) - 1; j++) {
							list.remove(j);
						}
					}
				} else {
					st1.set(i, st1.get(i) + speeds[(speeds.length - 1) -i]);
					cnt = 0;
				}
			}
		}
		
		
		int[] result = new int[list.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55, 60, 40, 65};
		int[] speeds = {1, 30, 5 , 10, 60, 7};
		int[] result = solution(progresses, speeds);
		System.out.println(Arrays.toString(result));
	}
}





























