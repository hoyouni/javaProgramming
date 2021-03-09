package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1260번 DFS와 BFS
public class Prac_1260 {
	static int n, m, v;
	static int[][] map;
	static boolean[] visit;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.println("\n" + "i : " + i + " ");
		System.out.println("visit : " + Arrays.toString(visit));
		
		for(int j = 1; j < n + 1; j++) {
			if(map[i][j] == 1 && visit[i] == false) {
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		System.out.println("n : " + n + ", m : " + m + ", v : " + v + "\n");
		
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];
		
		for(int i = 0; i < n + 1; i++) {
			Arrays.fill(map[i], 0);
		}
		
		System.out.println("map : ");
		for(int j = 0; j < map.length; j++) {
			for(int k = 0; k < map[j].length; k++) {
				System.out.print(map[j][k] + " ");
			}
			System.out.println();
		}
		
		Arrays.fill(visit, false);
		System.out.println("\n" + "visit : " + Arrays.toString(visit));
		
		for(int i = 0; i < m; i++) {
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge, " ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		System.out.println("\n" + "map : ");
		for(int j = 0; j < map.length; j++) {
			for(int k = 0; k < map[j].length; k++) {
				System.out.print(map[j][k] + " ");
			}
			System.out.println();
		}
		
		dfs(v);
		System.out.println();
	}
}














