package days01;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		int num;
		int[] result = new int[100];
		int k = 2;

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수 분해할 정수를 입력 하시오 : ");
		num = sc.nextInt();
		System.out.printf("%s = ", num);
		if(num < 2 || num > 1000) {
			System.out.println("2 < n < 1000 인 수를 입력 하시오.");
		} else {

			for(int i = 0; k <= num; i++) {
				if(num % k == 0) {
					num = num / k;
					result[i] = k;
					
				} else if(num % k != 0) {
					k++;
				}

			} 
			for(int i = 0;  i < result.length; i++) {
				if(result[i] == 0) {
				} else {
					System.out.printf("%d*", result[i]);
					
					}
				}
			} System.out.print("\b");
			
		} 		
	}



