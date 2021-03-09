package algo;

import java.util.Arrays;

// 1. 정렬 알고리즘 (선택정렬)
// 가장 작은 수를 제일 앞으로 보내는 알고리즘(구현은 용이, 효율은 떨어짐)
// n * (n+1) / 2
// n * n 
// 시간 복잡도는 O(N^2) : 다른 정렬 알고리즘에 비해 비효율적인 정렬 알고리즘 
public class Ex01 {
	public static void main(String[] args) {
		int[] n = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int min = 0;
		int index = 0;
		int temp = 0;
		
		for (int i = 0; i < n.length; i++) {
			min = 9999;
			for(int j = i; j < n.length; j++) {
				if(min > n[j]) {
					min = n[j];
					index = j;
				}
			}
			temp = n[i];
			n[i] = n[index];
			n[index] = temp;
		}
		System.out.println(Arrays.toString(n));
	}
}
































