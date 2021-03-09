package ebay;

import java.util.Arrays;

public class Test2 {
	public static int solution(int num, int[] cards) {
		int max = num + 1; 
		int[] dp = new int[max];
		Arrays.fill(dp, max);
		dp[0] = 0;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < cards.length; j++) {
				if(i >= cards[j]) {
					dp[i] = Math.min(dp[i], dp[i - cards[j]] + 1);
				}
			}
		}
		
		return dp[num] > num ? -1 : dp[num];
	}
	
	public static void main(String[] args) {
		int num = 2;
		int[] cards = {2, 2};
		int result = solution(num, cards);
		System.out.println(result);
	}
}







































