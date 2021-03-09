package days10;

// 1+ 1+ 2+ 3+ 5+ 8+ ..
public class Practice3 {
	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		int sum = 2;
		System.out.printf("%d + %d + ", first, second);
		for(int i = 3; i <= 20; i++) {
			int third = first + second;
			System.out.printf("%d + ", third);
			sum = sum + third;
			first = second;
			second = third;
		}
		System.out.printf("=%d", sum);
	}
}
