package algo;

import java.util.Arrays;
import java.util.List;

public class MissingRangesGood {
	public static List<String> solution(int[] nums) {
		int[] arr = new int[100];
		for(int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		
		
		
		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 3, 50, 75};
		List<String> result = solution(nums);
		System.out.println(result);
		
	}
}
