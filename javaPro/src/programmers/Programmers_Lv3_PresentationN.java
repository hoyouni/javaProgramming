package programmers;

// Lv3 N으로 표현 
// DFS
//https://jayrightthere.tistory.com/entry/DFSJAVA-N%EC%9C%BC%EB%A1%9C-%ED%91%9C%ED%98%84 참고 
public class Programmers_Lv3_PresentationN {
	static int answer = -1;
	
	public static int solution(int N, int number) {
		dfs(N, number, 0, 0);
		return answer;
	}
	
	public static void dfs(int N, int number, int cnt, int prev) {
		int temp = N;
		
		if(cnt > 8) {
			answer = -1;
			return;
		}
		
		if(number == prev) {
			if(answer == -1 || answer > cnt)
				answer = cnt;
			return;
		}
		
		for(int i = 0; i < 8 - cnt; i++) {
			dfs(N, number, cnt + i + 1, prev + temp);
			dfs(N, number, cnt + i + 1, prev - temp);
			dfs(N, number, cnt + i + 1, prev * temp);
			dfs(N, number, cnt + i + 1, prev / temp);
			
			temp = increaseN(temp, N);
		}
	}
	
	public static int increaseN(int temp, int N) {
		return temp * 10 + N;
	}

	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		int result = solution(N, number);
		System.out.println(result);
	}
}
































