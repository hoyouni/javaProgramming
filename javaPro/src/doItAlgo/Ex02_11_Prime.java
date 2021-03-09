package doItAlgo;

// 소수 열거 알고리즘 (개선 2)
public class Ex02_11_Prime {
	public static void main(String[] args) {
		//int cnt = 0;
		int ptr = 0;
		int[] prime = new int[50];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3; // ptr = 2가 된다.
		
		for(int n = 5; n <= 100; n+=2) {
			boolean flag = false;
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				//cnt += 2;
				if(n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) { // not 연산 했을 때 flag 가 true 일 경우 
				prime[ptr++] = n;
				//cnt++;
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.print(prime[i] + " ");
		}
		
		System.out.println();
		//System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + cnt);
		
	}
}

































