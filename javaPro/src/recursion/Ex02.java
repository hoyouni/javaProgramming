package recursion;

// 재귀 함수로 1부터 n 까지 합 구하기
public class Ex02 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	
	public static int func(int n) { // 1 ~ n 까지 합 구하는 함수
		if(n == 0) { // n = 0 이라면 합은 0이다.
			return 0; 
		} else { // n이 0보다 크면 0에서 n까지의 합은 0에서 n-1까지 합에 n을 더한것이다.
			return n + func(n - 1); 
			// 4 + func(3)
			// 4 + 3 + func(2)
			// 4 + 3 + 2 + func(1)
			// 4 + 3 + 2 + 1 + func(0)
			// 4 + 3 + 2 + 1 + 0
		}
	}
}
