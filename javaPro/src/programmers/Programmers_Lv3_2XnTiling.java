package programmers;

// 프로그래머스 lv 3 2 X n 타일링
// DP 
// dp[n] = dp[n-1] + dp[n-2] 규칙 찾아서 해결 
public class Programmers_Lv3_2XnTiling {
	public static int solution(int n) {
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        
        for(int i = 2; i <= n; i++) {
        	result[i] = result[i - 1] + result[i - 2] % 1000000007;
        }
		
        
		return result[n];
    }
	
	public static void main(String[] args) {
		int n = 4;
		int result = solution(n);
		System.out.println(result);
	}
}







































