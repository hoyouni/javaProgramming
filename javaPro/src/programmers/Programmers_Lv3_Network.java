package programmers;

import java.util.Arrays;

// Lv3 네트워크
public class Programmers_Lv3_Network {
	static boolean[][] visited;
	
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			if(!visited[i][i]) {
				dfs(i, n, computers);
				answer++;
			}
		}
		return answer;
	}
	
	public static void dfs(int start, int n, int[][] computers) {
		for(int i = 0; i < n; i++) {
			if(computers[start][i] == 1 && !visited[start][i]) {
				visited[start][i] = visited[i][start] = true;
				dfs(i, n, computers);
			}
		}
	}

	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {
				{1,1,0},
				{1,1,0},
				{0,0,1}
		};
		int result = solution(n, computers);
		System.out.println(Arrays.deepToString(computers));
		System.out.println(result);
	}
}




























