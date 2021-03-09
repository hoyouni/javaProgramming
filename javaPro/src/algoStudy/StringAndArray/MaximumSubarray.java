package algoStudy.StringAndArray;

public class MaximumSubarray {
	public static int solution(int[] input) {
		// 1
		int newSum = input[0];
		int max = input[0];
		
		// 2
		for(int i = 1; i < input.length; i++) {
			newSum = Math.max(input[i], newSum + input[i]);
			max = Math.max(newSum, max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int output = solution(input);
		System.out.println(output);
	}
}





























