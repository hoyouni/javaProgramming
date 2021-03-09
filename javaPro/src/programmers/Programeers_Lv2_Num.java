package programmers;

// Lv2 숫자의 표현 
public class Programeers_Lv2_Num {
	static int cnt;
	static int sum;
	public static int dfs(int n, int num) {
		sum +=num;
		
		if(sum == n) {
			cnt++;
		}
		
		if(sum >= n) {
			return 0;
		}
		
		return sum + dfs(n, num + 1);
	}

	public static int solution(int n) {
		for(int i = 1; i <= n / 2; i++) {
			sum = 0;
			dfs(n, i);
		}
		
		return cnt + 1;
	}

	public static void main(String[] args) {
		int n = 15;
		int result = solution(n);
		System.out.println(result);
	}
}
