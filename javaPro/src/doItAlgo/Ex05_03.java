package doItAlgo;

import java.util.Scanner;

public class Ex05_03 {
	public static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	/*
	public static void recur2(int x) {
		if(x > 0) {
			recur2(x - 2);
			System.out.println(x);
			recur2(x - 1);
		}
	}
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int x = sc.nextInt();

		recur(x);
		//recur2(x);
	}
}






























