package doItAlgo;

import java.util.Scanner;

// 직각 이등변 삼각형 출력
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = 0;
		do {
			System.out.print("직각 이등변 삼각형의 높이 입력 : ");
			k = sc.nextInt();
		} while(k <= 0);
		
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.exit(0);
	}
}
















