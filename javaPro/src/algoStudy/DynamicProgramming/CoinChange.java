package algoStudy.DynamicProgramming;

import java.util.Arrays;

// 1, 2, 5원을 이용해서 11원을 만들 수 있는 가장 최소값
public class CoinChange {
	public static int coinChange(int[] coins, int amount) {
		// 1. 
		int max = amount + 1; // 12
		int[] dp = new int[max];
		Arrays.fill(dp, max);
		dp[0] = 0;
		
		// 2.
		for(int i = 1; i <= amount; i++) {
			for(int j = 0; j < coins.length; j++) {
				if(i >= coins[j]) {
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}
		
		
		return dp[amount] > amount ? -1 : dp[amount];
	}
	
	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}
}


































