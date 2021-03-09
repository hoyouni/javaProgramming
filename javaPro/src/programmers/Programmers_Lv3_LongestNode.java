package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Lv3 가장 먼 노드 
public class Programmers_Lv3_LongestNode {
	public static int solution(int n, int[][] edge) {
		int answer = 0;
		boolean[] visit = new boolean[n+1];
		boolean[][] connect = new boolean[n+1][n+1];
		
		for(int i = 0; i < edge.length; i++) {
			connect[edge[i][0]][edge[i][1]] = connect[edge[i][1]][edge[i][0]] = true;
		}
		// 연결된 노드들은 true 로 바꾸어줌 
		
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> nextNodes = new ArrayList<>();
		
		queue.add(1);
		
		visit[0] = visit[1] = true;
		
		while(true) {
			answer = queue.size();
			while(!queue.isEmpty()) {
				int node = queue.poll();
				for(int j = 1; j <= n; j++) {
					if(!visit[j] && connect[node][j]) { // 아직 방문하지 않았고 노드간 연결이 되어 있을 경우 
						nextNodes.add(j);
						visit[j] = true;
					}
				}
			}
			if(nextNodes.isEmpty()) {
				break;
			}
			queue.addAll(nextNodes);
			nextNodes.clear();
		}
		return answer;
	}
	public static void main(String[] args) {
		int[][] edge = 	{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		int n = 6;
		int result = solution(n, edge);
		System.out.println(result);
	}
}


























