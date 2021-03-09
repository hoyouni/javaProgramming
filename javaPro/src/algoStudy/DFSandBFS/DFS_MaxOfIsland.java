package algoStudy.DFSandBFS;

// 육지의 최대 넓이
public class DFS_MaxOfIsland {
	int[][] dirs = {{-1, 0},{1, 0},{0, -1},{0, 1}};
	int m, n;

	public int maxAreaOfIsland(int[][] grid) {
		// 1. null check
		if(grid == null || grid.length == 0) {
			return 0;
		}
		
		m = grid.length; // 가로 길이
		n = grid[0].length; // 세로 길이
		
		int max = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(grid[i][j] == 1) {
					int area = dfs(grid, i, j, 0);
					max = Math.max(area, max);
				}
			}
		}
		
		return max;
	}

	public int dfs(int[][] grid, int x, int y, int area) {
		// 1. 탈출 조건
		if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] != 1) {
			return area;
		}
		
		// 2. 육지가 들어오는 경우 
		grid[x][y] = 0;
		area++;
		
		for(int[] dir : dirs) {
			area = dfs(grid, x + dir[0], y + dir[1], area);
		}
		
		return area;
	}

	public static void main(String[] args) {

		int[][] grid = {
				{1, 0, 0, 0},
				{0, 1, 1, 0},
				{0, 1, 1, 0},
				{0, 0, 1, 0}
		};
		DFS_MaxOfIsland a = new DFS_MaxOfIsland();
		System.out.println(a.maxAreaOfIsland(grid));
	}

}



















