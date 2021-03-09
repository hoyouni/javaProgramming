package algo;

public class PracticeAlgo24 {
	public static int solution(int n) {
		int ptr = 0;
		int[] prime = new int[500000];
		
		if(n < 5) {
			if(n < 3) {
				return 1;
			}
			else {
				return 2;
			}
		}
		else {
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int i = 5; i <= n; i+=2) {
			boolean flag = false;
			for(int j = 1; prime[j] * prime[j] <= i; j++) {
				if(i % prime[j] == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				prime[ptr++] = i;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < ptr; i++) {
			sb.append(prime[i] + " ");
		}
		
		System.out.println(sb);
		
		return ptr;
		}
	}
	
	public static void main(String[] args) {
		int n = 100;
		int result = solution(n);
		System.out.println(result);
	}
}
