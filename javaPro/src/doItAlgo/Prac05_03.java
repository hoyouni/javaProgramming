package doItAlgo;

import java.util.Scanner;

// 배열 내의 모든 요소들의 최대 공약수 구하기 
public class Prac05_03 {
	// 정수 x, y의 최대 공약수를 비재귀적으로 구하여 반환
	public static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}

	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
	public static int gcdArray(int a[], int start, int no) {
		if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("정수 몇 개의 최대 공약수를 구할 것입니까? (2개 이상) ");
			num = sc.nextInt();
		} while(num <= 1);

		int[] x = new int[num];

		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");

	}
}



























