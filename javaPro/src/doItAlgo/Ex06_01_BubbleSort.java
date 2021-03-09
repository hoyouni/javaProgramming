package doItAlgo;

import java.util.Arrays;
import java.util.Scanner;

// 버블 정렬
public class Ex06_01_BubbleSort {
	public static void swap(int[] x, int idx1, int idx2) {
		int temp = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = temp;
	}
	
	public static void selectSort(int[] x, int nx) {
		for(int i = 0; i < nx - 1; i++) {
			int min = i;
			for(int j = i + 1; j < nx; j++) {
				if(x[j] < x[min]) {
					min = j;
				}
			}
			swap(x, i, min);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택 정렬 ");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		selectSort(x, nx);
		
		System.out.println("오름차순 정렬");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] = " + x[i]);
		}
	}
}




























