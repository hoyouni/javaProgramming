package programmers;

public class Programmers_Lv3_networks {
	
	int m, k;
	
	public int solution(int n, int[][] computers) {
		
		m = computers.length;
		k = computers[0].length;
		
		if(computers == null || computers.length == 0) 
			return 0;
		
		int cnt = 0;
		for(int i = 0; i < computers.length; i++) {
			for(int j = 0; j < computers[i].length; j++) {
				if(computers[i][j] == 1) {
					cnt++;
					dfs(computers, i, j);
				}
			}
		}
		
		for(int i = 0; i < computers.length; i++) {
			for(int j = 0; j < computers[i].length; j++) {
				System.out.print(computers[i][j] + " ");
			}
			System.out.println();
		}
		
		return cnt;
	}
	
	public void dfs(int[][] computers, int i, int j) {
		if(i < 0 || j < 0 || i >= m || j >= k || computers[i][j] == 0) 
			return;
		
		computers[i][j] = 0;
		
		dfs(computers, i - 1, j);
		dfs(computers, i + 1, j);
		dfs(computers, i, j - 1);
		dfs(computers, i, j + 1);
		
	}
	
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {
				{1, 1, 0},	
				{1, 1, 0},	
				{0, 0, 1}	
		};
		
		Programmers_Lv3_networks a = new Programmers_Lv3_networks();
		System.out.println(a.solution(n, computers));
	}
}


































