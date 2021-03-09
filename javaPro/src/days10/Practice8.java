package days10;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100,
				50, 10, 5, 1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int money = sc.nextInt();
		int[] share = new int[moneyUnit.length];
		int[] rest =new int[moneyUnit.length];
		
		for(int i = 0; i < moneyUnit.length; i++) {
			share[i] = money / moneyUnit[i];
			rest[i] = money % moneyUnit[i];
			
			money = money - share[i] * moneyUnit[i];
			
			System.out.printf("%d 원 : %d 장, 남은 금액 : %d원\n", moneyUnit[i], share[i], rest[i] );
		}
		
		}
	}

