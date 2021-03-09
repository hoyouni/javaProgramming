package doItAlgo;

import java.util.Arrays;
import java.util.Scanner;

// 세 개의 수 중 중앙값 찾기 
public class Ex02 {
	public static int mid(int a, int b, int c) {
		int[] middle = {a, b, c};
		Arrays.sort(middle);
		
		int middleNum = middle[middle.length / 2];
		
		return middleNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a값 입력 : ");
		int a = sc.nextInt();
		System.out.print("b값 입력 : ");
		int b = sc.nextInt();
		System.out.print("c값 입력 : ");
		int c = sc.nextInt();
		
		System.out.println("중앙 값은 " + mid(a, b, c) + " 입니다. ");
	}
}






































