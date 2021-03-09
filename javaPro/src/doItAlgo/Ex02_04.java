package doItAlgo;

import java.util.Scanner;

// 배열 요소의 최댓값을 구하는 메소드
public class Ex02_04 {
	public static int max(int[] people) {
		int max = people[0];
		for(int i = 1; i < people.length; i++) {
			if(people[i] > max) {
				max = people[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int a = new Scanner(System.in).nextInt();
		int[] people = new int[a];
		for(int i = 0; i < people.length; i++) {
			System.out.print("people["+i+"] : ");
			int b = new Scanner(System.in).nextInt();
			people[i] = b;
		}
		
		int result = max(people);
		System.out.println("최댓값은 " + result + " 입니다.");
	}
}
























