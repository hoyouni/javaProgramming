package doItAlgo;

import java.util.Scanner;

// 버블 정렬
public class Ex06_05_InsertionSort {
	public static void insertSort(int[] x, int nx) {
		for(int i = 1; i < nx; i++) {
			int j;
			int temp = x[i];
			for(j = i; j > 0 && x[j - 1] > temp; j--) 
				x[j] = x[j - 1];
			x[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삽입 정렬 ");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		insertSort(x, nx);
		
		System.out.println("오름차순 정렬");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] = " + x[i]);
		}
	}
}




























