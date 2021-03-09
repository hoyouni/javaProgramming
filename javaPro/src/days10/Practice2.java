package days10;

public class Practice2 {
	public static void main(String[] args) {
		//1 + 2 + 4 + 7 + 11 + 16 + . 20개 항 까지의 합
		
		int first = 1;
		int sum = 0;
		int index = 1;
		int second = 0;;
		for(int i = 1; i <= 20; i++, index++) {
			second = first + index;
			sum = sum + first;
			System.out.printf("%d + ", first);
			first = second;
			
		}
		System.out.printf("=%d", sum);
		
	}
}
