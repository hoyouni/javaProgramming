package algo;

import java.util.Arrays;

// 정렬 알고리즘 : 퀵 정렬
// 선택, 버블, 삽입 정렬의 시간 복잡도는 O(N^2)임을 알고있다.
// 이러한 복잡도를 가지는 알고리즘은 데이터의 갯수가 10만개만 넘어가도
// 일반적인 상황에서 사용하기 매우 어려운 알고리즘이다.
// 더욱 빠른 알고리즘의 필요성이 있는데 이를 해결해주는 것이 퀵 정렬.
// 대표적인 '분할 정복' 알고리즘으로 시간 복잡도가 O(NlogN)
// 선택, 버블, 삽입 정렬에 비해 확실히 빠름.
// 특정 값을 기준으로 큰 수와 작은 수를 나눠서 정렬하는 알고리즘
// 기준 값(피벗) 이 설정되어짐.
// 최악의 시간 복잡도는 O(N^2) 일 경우가 있음. - 이미 정렬이 되어있는 경우
public class Ex04 {
	
	public void quickSort(int[] data, int start, int end) {
		if(start >= end) { // 원소가 1개인 경우
			return;
		}
		
		int key = start; // 키는 첫 번째 원소 
		int i = start + 1;
		int j = end;
		int temp = 0;
		
		while(i <= j) { // 엇갈릴 때 까지 반복
			while(i <= end && data[i] <= data[key]) { // 키 값 보다 큰 값을 만날때 까지
				i++;
			}
			while(data[j] >= data[key] && j > start) { // 키 값보다 작은 값을 만날대 까지
				j--;
			}
			if(i > j) { // 엇갈린 상태
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
		
	}
	
	public static void main(String[] args) {
		Ex04 ex = new Ex04();
		int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int number = 10;
		ex.quickSort(data, 0, number - 1);
		//Arrays.sort(data, 0, number);
		System.out.println(Arrays.toString(data));
		
	}
}































