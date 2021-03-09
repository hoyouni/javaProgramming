package doItAlgo;

import java.util.Scanner;

// 보초법
public class Ex03_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 입력 : ");
		int eleCnt = sc.nextInt();

		int[] num = new int[eleCnt + 1];

		for(int i = 0; i < eleCnt; i++) {
			System.out.print("요소 입력 : ");
			int element = sc.nextInt();
			num[i] = element;
		}

		System.out.print("원하는 값을 입력 하시오 : ");
		int search = sc.nextInt();

		int result = seqSearchSen(num, eleCnt, search);

		if(result == -1) {
			System.out.println("원하는 값이 없습니다.");
		} else {
			System.out.println("원하는 값이 " + result + "번째 인덱스에 위치해있습니다.");
		}

	}

	static int seqSearchSen(int[] num, int eleCnt, int search) {
		num[eleCnt] = search;
		
		for(int i = 0; i < num.length - 1; i++) {
			if(num[i] == search) {
				return i;
			}
		}
		return -1;
		
	}
}





























