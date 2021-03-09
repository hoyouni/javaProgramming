package recursion;

// 최대 공약수 : Euclid Method
// m >= n 인 두 양의 정수 m과 n 에 대하여
// m 이 n의 배수이면 gcd(m,n) = n이고,
// 그렇지 않으면 gcd(m,n) = gcd(n, m%n)이다.
public class Ex06 {
	public static void main(String[] args) {
		int result = gcd(6, 18);
		System.out.println(result);
	}
	
	public static int gcd(int m, int n) {
		return n == 0 ? m : gcd(n, m % n);
	}
	
	/*
	public static int gcd(int m, int n) { 
		if(m < n) {
			int temp = m; 
			m = n; 
			n = temp;  
		} 
		if(m % n == 0) { 
			return n; 
		} else {
			return gcd(n, m%n);
		}
	}
	*/
}





