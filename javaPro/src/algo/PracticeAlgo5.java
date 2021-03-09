package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class PracticeAlgo5 {
	public static int[] solution(int[] progresses, int[] speeds) {
		Stack<Integer> endDay = new Stack<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < progresses.length; i++) {
			endDay.add(num(progresses[i], speeds[i]));
		}
		
		Collections.reverse(endDay);
		System.out.println(endDay);
		
		while(!endDay.isEmpty()) {
			int first = endDay.pop();
			
			if(first < endDay.peek()) {
				count1 = count1 + 1;
			}
			
			else if(first > endDay.peek()) {
				for(int i = 0; i <= endDay.indexOf(endDay.peek()); i++) {
					int number = endDay.get(i);
					number = number + 1;
					endDay.set(i, number);
					
					if(first == endDay.get(i)) {
						endDay.pop();
						count2 = count2 + 2;
						//break;
					}
				}
			}
			
		}
		
		
		
		
		int[] result = new int[list.size()];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
	
	// 기능별 걸리는 일 수 계산
	public static int num(int first, int second) {
		int completeDay = 100;
		double lastDay = (double)(completeDay - first) / second;
		int result = (int)Math.ceil(lastDay);
		return result;
	}
	
	public static void main(String[] args) {
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5 , 10, 7};
		int[] result = solution(progresses, speeds);
		System.out.println(Arrays.toString(result));
	}

}


























