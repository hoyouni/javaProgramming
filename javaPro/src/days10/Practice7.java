package days10;

import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		int[] m = new int[16];
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 하시오 : ");
		int num = sc.nextInt();

		fillFirst(m, num);
		fillSecond(m);

	}

	public static void fillSecond(int[] m) {
		int n = 0;
		for(int i = 0; i < m.length; i++) {
			n += (int) (Math.pow(2, i) * m[15-i]);
		}
		System.out.println();
		System.out.println(n);
		

	}

	public static void fillFirst(int[] m, int num) {
		int share;
		int rest;
		int index = m.length - 1;

		while(num != 0) {
			share = num / 2;
			rest = num % 2;
			m[index--] = rest;
			num = share;

		} 
		for(int i = 0; i < m.length; i++) {
			System.out.printf("[%d]", m[i]);
		}


	}
}
