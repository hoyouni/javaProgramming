package doItAlgo;

// 100 이하의 소수 열거 1번 방법 
public class Ex02_09 {
	public static void main(String[] args) {
		int cnt = 0;
		
		// n % i == 0 || n % i != 0?
		for(int n = 2; n<= 100; n++) {
			int i;
			for(i = 2; i < n; i++) {
				cnt++;
				if(n % i == 0) {
					break;
				}
			}
			if(n == i) {
				System.out.println(n);
			}
		}
		
		System.out.println("나눗셈 횟수 : " + cnt);
	}
}



















