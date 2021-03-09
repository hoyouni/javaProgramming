package recursion;

// 피보나치 수열 
// f0 = 1
// f1 = 1
// fn = fn-1 + fn-2, n > 1
// 1 + 1 + 2 + 3 + 5 = 12
public class Ex05 {
	public static void main(String[] args) {
		int result = fibonacci(5);
		System.out.println(result);
	}
	
	public static int fibonacci(int n) {
		if(n < 2) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
