package algo;

import java.util.Arrays;

// 정렬 알고리즘 : 삽입 정렬
// 시간 복잡도 : O(N^2)
// 각 숫자를 적절한 위치에 삽입하는 알고리즘 : 필요할 때만 위치 변경
// 선택정렬, 버블정렬에 비해 빠르다.
// 정렬이 되어있다고 가정하기 때문에 연산 횟수가 적게 일어난다.
// 거의 정렬된 상태라면 삽입 정렬이 다른 어떤 알고리즘보다도 효율적이다.
public class Ex03 {
	public static void main(String[] args) {
		int[] n = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < n.length - 1; i++) {
			j = i;
			while(n[j] > n[j+1]) {
				temp = n[j];
				n[j] = n[j+1];
				n[j+1] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(n));
	}
}




























