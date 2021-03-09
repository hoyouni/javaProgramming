package algo;

import java.util.Collections;
import java.util.Stack;

public class PracticeAlgo20 {
	public static int solution(int[] priorities, int location) {
		Stack<Integer> first = new Stack<Integer>();
		Stack<Integer> second = new Stack<Integer>();
		
		for(int i = 0; i < priorities.length; i++) {
			first.push(priorities[priorities.length - 1 - i]);
		}
		
		System.out.println("first : " + first);
		
		int targetIndex = first.size() - 1 - location;
		int targetNum = first.get(first.size() - 1 - location);
		
		System.out.println("targetIndex : " + targetIndex);
		System.out.println("targetNum : " + targetNum);
		
		while(!first.isEmpty()) {
			int pick = first.peek();
			if(pick < Collections.max(first)) {
				first.pop();
				first.add(0, pick);
				targetIndex = targetIndex + 1;
				if(targetIndex > first.size() - 1) {
					targetIndex = 0;
				}
			}
			else {
				second.push(pick);
				if(first.get(targetIndex) == second.peek()) {
					return second.get(second.get(targetIndex)) + 1;
				}
				first.pop();
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int result = solution(priorities, location);
		System.out.println(result);
	}
}




























