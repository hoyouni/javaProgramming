package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PracticeAlgo6 {
	public static int[] solution(int[] prices) {
        Stack<Integer> st = new Stack<Integer>();
		List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < prices.length; i++) {
			st.push(prices[i]);
		}
		Collections.reverse(st);
		
		while(!st.isEmpty()) {
			int pick = st.pop();
			int cnt = 0;
			//int cnt2 = 0;
			for(int i = st.size() - 1; i >= 0; i--) {
				if(pick <= st.get(i)) {
					cnt++;
				} 
				else if(pick > st.get(i)) {
					cnt++;
					break;
				}
			} // for
			result.add(cnt);
		} // while
		
		int[] notLower = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			notLower[i] = result.get(i);
		}
		
		return notLower;
    }
	
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] result = solution(prices);
		System.out.println(Arrays.toString(result));
	}
}











