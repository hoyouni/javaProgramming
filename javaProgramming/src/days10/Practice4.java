package days10;

import java.util.Scanner;

//진법 변환 10 -> 2
public class Practice4 {
	public static void main(String[] args) {
int [] m = new int[16];
		
		int n ;  // 10진수 정수값
		Scanner scanner= new Scanner(System.in);
		System.out.print(">  정수 입력 ? ");
		n = scanner.nextInt(); // 10
		//
		int share, rest; // 몫, 나머지
		int idx = m.length-1;
		
		while(n != 0) {
			share = n / 2;
			rest = n %2;
			m[idx--] = rest;
			n = share;
		}
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]", m[i]);
		}
		System.out.println();
	}
}
