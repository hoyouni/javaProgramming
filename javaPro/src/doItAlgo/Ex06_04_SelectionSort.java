package doItAlgo;

import java.util.Arrays;

// 버블 정렬
public class Ex06_04_SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 4, 3, 7, 1, 9, 8};
		
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = 0; j < num.length - 1 - i; j++) {
				if(num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
}




























