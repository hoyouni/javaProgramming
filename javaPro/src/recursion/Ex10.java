package recursion;

// 2진수로 변환하여 출력
public class Ex10 {
	public static void main(String[] args) {
		printInBinary(14);
	}
	
	public static void printInBinary(int n) {
		if(n == 0) {
			return;
		}
		printInBinary(n / 2);
		System.out.print(n % 2);
	}
}
