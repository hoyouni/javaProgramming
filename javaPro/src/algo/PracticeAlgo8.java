package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class PracticeAlgo8 {
		public static int[] solution(int[] heights) {
			Stack<Integer> st = new Stack<Integer>();
			for(int i = 0; i < heights.length; i++) {
				st.push(heights[i]);
			}
			//System.out.println(st);
			
			Stack<Integer> st2 = new Stack<Integer>();
			
			while(!st.isEmpty()) {
				int first = st.pop();
				
				if(st.size() == 0) {
					st2.add(0);
				}
				
				for(int i = st.size() - 1; i >= 0; i--) {
					if(first < st.get(i)) {
						st2.add(i + 1);
						break;
					} 
					else if(first >= Collections.max(st) || st.size() == 1) {
						st2.add(0);
						break;
					}
				}
			}
			
			int[] result = new int[st2.size()];
			for(int i = st2.size() - 1; i >= 0; i--) {
				result[result.length - i - 1] = st2.get(i);
			}
			
			return result;
		}

	public static void main(String[] args) {
		int[] heights = {3,9,9,3,5,7,2};
		int[] result = solution(heights);
		System.out.println(Arrays.toString(result));
	}
}




























