package days10;

import java.util.Scanner;

//���� ��ȯ 10 -> 2
public class Practice4 {
	public static void main(String[] args) {
int [] m = new int[16];
		
		int n ;  // 10���� ������
		Scanner scanner= new Scanner(System.in);
		System.out.print(">  ���� �Է� ? ");
		n = scanner.nextInt(); // 10
		//
		int share, rest; // ��, ������
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
