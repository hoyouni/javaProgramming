package programmers;

import java.util.Arrays;

// Lv3 거스름돈 
public class Programmers_Lv3_DividedMoney {
	public static int solution(int n, int[] money) {
		int[] dp = new int[n+1];
		//System.out.println(Arrays.toString(dp));
		
		Arrays.sort(money);
		//System.out.println("money : " + Arrays.toString(money));
		
		dp[0] = 1;
		//System.out.println("dp : " + Arrays.toString(dp));
		
		for(int i=0; i<money.length; i++) {
			//System.out.println("i : " + i + " 일 때 ");
			for(int j=money[i]; j<=n; j++) {
				//System.out.println(" j : " + j);
				dp[j] = dp[j] + dp[j-money[i]];
				//System.out.println("  dp[j] = dp[j] + dp[j-money[i]] : " + "dp["+j+"] = dp["+j+"] + dp["+j+" - money["+i+"]]");
				//System.out.println("  for dp : " + Arrays.toString(dp));
			}
		}

		return dp[n] % 1000000007;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] money = {1,2,5};
		int result = solution(n, money);
		System.out.println(result);
	}
}














