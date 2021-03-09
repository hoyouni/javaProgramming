package programmers;

import java.util.Arrays;

// 프로그래머스 Lv3 등굣길 : 집에서 학교까지 가는 최단거리 구하기 
// DP 
// 0 0 0 0 0
// 0 1 1 1 2 이면 다음은
// 0 1 2 3 5 현재 element = 현재 기준 이전 열 element + 현재 기준 이전 행 element 
// 웅덩이와 같이 장애 요인이 없을 경우에만 해당

public class Programmers_Lv3_GotoSchool {
	public static int solution(int m, int n, int[][] puddles) {
		// m + 1 * n + 1격자 생성
		int[][] dp = new int[n+1][m+1];

		// 물에 잠긴 부분은 -1로 채워넣기 
		for(int i = 0; i < puddles.length; i++) {
			dp[puddles[i][1]][puddles[i][0]] = -1;
		}

		// 집이 있는 곳은 1로 채움
		dp[1][1] = 1;
		
		// 채워지기 전 배열 확인용
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				
				// 웅덩이일 때 건너뛰기
				if(dp[i][j] == -1) {
					System.out.println("continue에 걸릴 때 " + "i : " + i + ", j : " + j + ", dp["+i+"]["+j+"] : " + dp[i][j]);
					continue;
				}
				
				// 아래로 가면서 웅덩이를 만나지 않을 경우 
				if(i - 1 > 0 && dp[i - 1][j] != -1) {
					System.out.println("  첫 번째 조건 중 1) " + " i : " + i + ", j : " + j + ", dp["+i+"]["+j+"] : " + dp[i][j]);
					dp[i][j] = dp[i][j] + dp[i - 1][j] % 1000000007;
					System.out.println("  첫 번째 조건 중 2) " + " i : " + i + ", j : " + j + ", dp["+i+"]["+j+"] : " + dp[i][j]);
				}
				
				// 오른쪽으로 가면서 웅덩이를 만나지 않을 경우 
				if(j - 1 > 0 && dp[i][j - 1] != -1) {
					System.out.println("두 번째 조건 중 1)" + " i : " + i + ", j : " + j + ", dp["+i+"]["+j+"] : " + dp[i][j]);
					dp[i][j] = dp[i][j] + dp[i][j - 1] % 1000000007;
					System.out.println("두 번째 조건 중 2)" + " i : " + i + ", j : " + j + ", dp["+i+"]["+j+"] : " + dp[i][j]);
				}
			}
		}
		
		System.out.println();
		
		// 다 채워지고 나서의 배열
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		return dp[n][m] % 1000000007;
	}
	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		int result = solution(m, n, puddles);
		System.out.println(result);

	}
}





















