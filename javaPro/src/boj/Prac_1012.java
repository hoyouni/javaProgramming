package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// 1012 유기농 배추 
public class Prac_1012 {
	int m, n;
	int[][] dirs = {{-1, 0},{1, 0},{0, -1},{0, 1}};
	
	public int solve(int[][] grid) {
		if(grid == null || grid.length == 0) 
			return 0;
		
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					count++;
					dfs(grid, i, j);
				}
			}
		}
		
		return count;
	}
	
	public void dfs(int[][] grid, int i, int j) {
		m = grid.length;
		n = grid[0].length;
		
		if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) 
			return;
		
		grid[i][j] = 0;
		
		for(int[] dir : dirs) {
			int dx = i + dir[0];
			int dy = j + dir[1];
			dfs(grid, dx, dy);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int[][] grid;
		Prac_1012 a = new Prac_1012();
		
		for(int k = 0; k < T; k++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			grid = new int[M][N];
			for(int i = 0; i < K; i++) {
				s = br.readLine();
				st = new StringTokenizer(s, " ");
				grid[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			int result = a.solve(grid);
			list.add(result);
		}
		
		for(int answer : list) {
			System.out.println(answer);
		}
		
		sc.close();
		
	}
}
































