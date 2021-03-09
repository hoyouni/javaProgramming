package doItAlgo;

import java.util.Scanner;

// 이진 검색 (Binary Search)
public class Ex03_04_BinarySearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int eleCnt = sc.nextInt();
		
		int[] num = new int[eleCnt];
		
		System.out.println("요소를 오름차순으로 입력하시오. ");
		
		for(int i = 0; i < eleCnt; i++) {
			System.out.print("요소 입력 : ");
			num[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		int idx = binSearch(num, eleCnt, search);
		
		if(idx == -1) {
			System.out.println("원하는 값이 없습니다.");
		} else {
			System.out.println("원하는 값이 " + idx + "번째 인덱스에 위치해있습니다.");
		}
		
	}

	static int binSearch(int[] num, int eleCnt, int search) {
		int start = 0;
		int end = eleCnt - 1;
		
		while(end > start) {
			int center = (start + end) / 2;
			if(num[center] == search) {
				return center;
			}
			else if(num[center] < search) {
				start = center + 1;
			}
			else if(num[center] > search) {
				end = center - 1;
			}
		}
		
		return -1;
	}
}




























