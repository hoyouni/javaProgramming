package algo;

import java.util.Arrays;
import java.util.Stack;

public class Practice7 {
	public static int[] solution(int[] heights) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		for(int i = 0; i < heights.length; i++) {
			stack.push(heights[i]);
		}
		System.out.println("현재 stack의 값 : " + stack);
		
		return null;
	}

	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
		int[] result = solution(heights);
		System.out.println(Arrays.toString(result));
	}
}



















