package recursion;

// x^n 구하기 
// x^0 = 1
// x^n = x * x^n-1
public class Ex04 {
	public static void main(String[] args) {
		double result = power(2, 3);
		System.out.println((int)result);
	}
	
	public static double power(double x, int n) {
		if(n == 0) {
			return 1;
		} else {
			return x * power(x, n-1);
			// 2 * power(2, 2)
			// 2 * 2 * power(2, 1)
			// 2 * 2 * 2 * power(2, 0)
			// 2 * 2 * 2 * 1
		}
	}
}
