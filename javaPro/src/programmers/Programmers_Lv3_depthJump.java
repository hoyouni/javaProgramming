package programmers;

// Lv3 멀리뛰기
// DP 
// 1 2 3 5 8 13 ... 피보나치 활용 
public class Programmers_Lv3_depthJump {
	public static long solution(int n) {
		long[] dp = new long[n + 1];
		dp[0] = 1;
		dp[1] = 2;
		
		for(int i = 2; i < n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] % 1234567;
		}
		
		return dp[n - 1] % 1234567;
	}

	public static void main(String[] args) {
		int n = 4;
		long result = solution(n);
		System.out.println(result);
	}
}






























