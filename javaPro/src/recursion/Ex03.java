package recursion;

// Factorial : n!
// 0! = 1
// n! = n * (n - 1)! 단, n > 0
// ex) 재귀 함수를 통해 4! 구하기 
public class Ex03 {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
			// 4 * factorial(3)
			// 4 * 3 * factorial(2)
			// 4 * 3 * 2 * factorial(1)
			// 4 * 3 * 2 * 1
		}
	}
}














