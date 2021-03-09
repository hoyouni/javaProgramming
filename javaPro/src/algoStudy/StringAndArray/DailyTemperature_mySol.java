package algoStudy.StringAndArray;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature_mySol {
	public static int[] solution(int[] nums) {
		Stack<Integer> s = new Stack<Integer>();
		int[] result = new int[nums.length];
		for(int i = nums.length - 1; i >= 0; i--) {
			s.push(nums[i]);
		}
		System.out.println(s);
		
		int idx = 0;
		while(!s.isEmpty()) {
			int first = s.pop();
			
			int cnt = 0;
			
			if(s.peek() > first) {
				cnt = 1;
				result[idx] = cnt;
				idx++;
			} else {
				for(int j = s.size() - 1; j >= 0; j--) {
					if(s.get(j) > first) {
						int idx2 = s.indexOf(s.get(j));
						cnt = s.size() - idx2;
						result[idx] = cnt;
						idx++;
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] result = solution(nums);
		System.out.println(Arrays.toString(result));
	}
}



















