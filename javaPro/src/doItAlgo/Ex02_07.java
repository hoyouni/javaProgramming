package doItAlgo;

import java.util.Scanner;

// 같은 배열 판단
public class Ex02_07 {
	public static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요소수 : ");
		int cntA = sc.nextInt();
		int[] a = new int[cntA];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요소수 : ");
		int cntB = sc.nextInt();
		int[] b = new int[cntB];
		
		for(int i = 0; i < b.length; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "다릅니다."));
		
	}
}
































