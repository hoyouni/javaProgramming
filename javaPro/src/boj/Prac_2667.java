package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 백준 2667번 단지 번호 붙이기 
public class Prac_2667 {
	static int cnt;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean visit[][];
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void dfs(int[][] danzi, int x, int y) {
		visit[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i]; // 왼쪽 오른쪽으로 
			int ny = y + dy[i]; // 위 아래로 
			System.out.println("i : " + i + ", nx : " + nx + ", ny : " + ny);
			if(nx >= 0 && ny >= 0 && nx < danzi.length && ny < danzi.length) {
				if(danzi[nx][ny] == 1 && visit[nx][ny] == false) {
					System.out.println("dfs 돕니다.");
					dfs(danzi, nx, ny);
					cnt++;
					System.out.println("dfs 마치고 cnt 값 : " + cnt);
				}
			}
		}
	} // dfs
	
	public static int[] solution(int[][] danzi) {
		visit = new boolean[danzi.length][danzi.length];
		
		for(int i = 0; i < danzi.length; i++) {
			for(int j = 0; j < danzi.length; j++) {
				if(danzi[i][j] == 1 && visit[i][j] == false) { // 집이 있고 아직 방문하지 않은 경우 
					cnt = 1;
					dfs(danzi, i, j);
					list.add(cnt);
				}
			}
		}
		
		Collections.sort(list);
		int[] result = new int[list.size() + 1];
		result[0] = list.size();
		
		for(int i = 1; i < list.size() + 1; i++) {
			result[i] = list.get(i - 1);
		}
		
		return result;
	} //solution
	
	public static void main(String[] args) {
		int[][] danzi = {
				{0,1,1,0,1,0,0},
				{0,1,1,0,1,0,1},
				{1,1,1,0,1,0,1},
				{0,0,0,0,1,1,1},
				{0,1,0,0,0,0,0},
				{0,1,1,1,1,1,0},
				{0,1,1,1,0,0,0}
		};
		
		int[] result = solution(danzi);
		System.out.println(Arrays.toString(result));
	}
}




























