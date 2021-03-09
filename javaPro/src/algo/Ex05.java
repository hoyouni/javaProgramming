package algo;

import java.util.Arrays;

// 정렬 알고리즘 : 병합 알고리즘(MergeSort)
// 분할 정복 알고리즘으로 시간 복잡도는 O(NlogN)
// 최악의 경우에도 O(NlogN)을 보장해준다.
// 일단 반으로 쪼개고 나중에 합치는 알고리즘 방식
// 기존의 데이터를 담을 추가적인 배열공간이 필요하다는 점에서 메모리 활용도가 비효율
public class Ex05 {
	static int number = 8;
	static int[] sorted = new int[number];
	int size;
	int count = 0;
	
	public static void merge(int[] a, int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;
		
		// 작은 순서대로 배열에 삽입
		while(i <= middle && j <= n) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		// 남은 데이터도 삽입
		if(i > middle) {
			for(int t = j; t <= n; t++) {
				sorted[k] = a[t];
				k++;
			}
		} else {
			for(int t = i; t <= middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		// 정렬된 배열을 삽입
		for(int t = m; t <= n; t++) {
			a[t] = sorted[t];
		}
	}
	
	public static void mergeSort(int[] a, int m, int n) {
		if(m < n) {
			int middle = (m + n) / 2;
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			merge(a, m, middle, n);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {7, 6, 5, 8, 3, 5, 9, 1};
		int number = 8;
		mergeSort(a, 0, number - 1);
		System.out.println(Arrays.toString(a));
		
	}
}



























