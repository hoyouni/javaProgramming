package doItAlgo;

import java.util.Scanner;

// 선형검색 (순차검색)
public class Ex03_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("요소 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("원하는 값을 입력 하시오 : ");
		int search = sc.nextInt();
		
		int result = searchArr(arr, n, search);
		
		if(result == -1) {
			System.out.println("원하는 값이 없습니다.");
		} else {
			System.out.println("원하는 값이 배열의 " + result + "번째 인덱스에 있습니다.");
		}
		
	}

	public static int searchArr(int[] arr, int n, int search) {
		// 요소수가 n인 배열 arr에서 search와 같은 요소를 선형검색 하는 알고리즘
		int cnt = 0;
		while(true) {
			if(arr[cnt] == search) {
				return cnt;
			}
			if(cnt == n) {
				return -1;
			}
			cnt++;
		}
	}
}































