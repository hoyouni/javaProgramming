package doItAlgo;

import java.util.Scanner;

// b - a 구하기
public class Ex04 {
	public static int minus(int a, int b) {
		int result = 0;
		
		while(b <= a) {
			System.out.print("b 다시 입력 하세요 : ");
			b = new Scanner(System.in).nextInt();
		}
		
		result = b - a;
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.print("a : ");
		int a = new Scanner(System.in).nextInt();
		System.out.print("b : ");
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("b - a : " + minus(a, b));
		System.exit(0);
	}
}



































