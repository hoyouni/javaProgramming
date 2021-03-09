package algoStudy.DynamicProgramming;

public class UniquePaths {
	public static int uniquePaths(int m, int n) {
		int[][] map = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			map[i][0] = 1;
		}
		
		for(int i = 0; i < n; i++) {
			map[0][i] = 1;
		}
		
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				map[i][j] = map[i][j - 1] + map[i - 1][j];
			}
		}
		
		return map[map.length - 1][map[0].length - 1];
	}
	
	public static void main(String[] args) {
		int m = 7, n = 3;
		System.out.println(uniquePaths(m, n));
	}
}
