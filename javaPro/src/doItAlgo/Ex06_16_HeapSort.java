package doItAlgo;

import java.util.Scanner;

// 버블 정렬
public class Ex06_16_HeapSort {
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void downHeap(int[] a, int left, int right) {
		int temp = a[left];
		int child;
		int parent;
		
		for(parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;
			int cr = cl + 1;
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			if(temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	public static void heapSort(int[] a, int n) {
		for(int i = (n - 1) / 2; i >= 0; i--)
			downHeap(a, i, n - 1);
		
		for(int i = n - 1; i > 0; i--) {
			swap(a, 0, i);
			downHeap(a, 0, i - 1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("퀵 정렬 ");
		System.out.print("요소 수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		heapSort(x, nx);
		
		System.out.println("오름차순 정렬");
		for(int i = 0; i < nx; i++) {
			System.out.println("x["+i+"] = " + x[i]);
		}
	}
}




























