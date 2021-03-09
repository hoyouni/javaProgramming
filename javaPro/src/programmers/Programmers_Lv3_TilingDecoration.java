package programmers;

import java.util.Arrays;

// 프로그래머스 lv3 타일 장식물 문제 
// dp 활용 dp[n] = dp[n-1] + dp[n-2]
public class Programmers_Lv3_TilingDecoration {
	public static long solution(int N) {
		long[] result = new long[N + 1];
		result[0] = 1;
		result[1] = 1;
		
		for(int i = 2; i < N; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
		
		long answer = (result[N - 1] * 2) + ((result[N - 1] + result[N- 2]) * 2);
		
		return answer;
	}
	public static void main(String[] args) {
		int N = 6;
		long result = solution(N);
		System.out.println(result);
	}
}
































