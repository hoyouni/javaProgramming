package algo;

import java.util.Arrays;

// 정렬 알고리즘 : 버블 정렬
// 옆에 있는 수와 비교해서 더 작은 값을 앞으로 보내는 알고리즘
// 모든 정렬 알고리즘 중에서 가장 비효율적인 알고리즘 
// 시간 복잡도 : O(N^2) 선택정렬과 시간 복잡도는 동일하지만
// 계속해서 자리 바꾸는 연산을 하기 때문에 실제 수행시간은 선택정렬보다 느림
// 따라서 가장 비효율적인 알고리즘 
public class Ex02 {
	public static void main(String[] args) {
		int[] n = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		int temp = 0;
		
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n.length-1 - i; j++) {
				if(n[j] > n[j+1]) {
					temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}
}
































