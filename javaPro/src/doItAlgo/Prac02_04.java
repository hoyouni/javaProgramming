package doItAlgo;

import java.util.Arrays;
import java.util.Scanner;

// 배열 복제
public class Prac02_04 {
	
	// 역순 복제
	public static void reverseCopy(int[] a, int[] b) {
		for(int i = a.length - 1; i >= 0; i--) {
			b[a.length - 1 - i] = a[i];
		}
	}
	
	// 복제
	public static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
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
		
		int[] b = new int[cntA];
		//copy(a, b);
		//System.out.println(Arrays.toString(b));
		reverseCopy(a, b);
		System.out.println("결과 :" + Arrays.toString(b));
	}
}















