package doItAlgo;

import java.util.Scanner;

// 유클리드 호제법을 이용한 최대공약수 구하기
public class Ex05_02_EuclidGCD {
	public static int gcd(int n1, int n2) {
		if(n2 == 0) {
			return n1;
		}
		return gcd(n2, n1 % n2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력 하시오 ");
		System.out.print("요소 1 : ");
		int n1 = sc.nextInt();
		System.out.print("요소 2 : ");
		int n2 = sc.nextInt();
		
		System.out.println("두 정수의 최대 공약수는  " + gcd(n1, n2) + " 입니다.");
		
		
		
	}
}





























