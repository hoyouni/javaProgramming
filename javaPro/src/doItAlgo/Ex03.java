package doItAlgo;

import java.util.Scanner;

// a 와 b 사이의 모든 수의 합 구하기 
public class Ex03 {
	public static int sum(int a, int b) {
		int sum = 0;
		
		if(a >  b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.print("a : ");
		int a = new Scanner(System.in).nextInt();
		System.out.print("b: ");
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("합 : " + sum(a, b));
		System.exit(0);
	}
}
