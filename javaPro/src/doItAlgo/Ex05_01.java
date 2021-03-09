package doItAlgo;

import java.util.Scanner;

// 팩토리얼 (재귀)
public class Ex05_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "의 팩토리얼은 " + factorial(num) + " 입니다.");
	}

	public static int factorial(int num) {
		if(num <= 0) {
			return 1;
		}
		return num * factorial(num - 1); 
	}
}

































