package algo;

import java.util.Arrays;

// ** 비트 연산 **
public class KakaoPrac {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] result = new String[n];
		
		for(int i = 0; i < n; i++) {
			String resultString = "";
			int arr = arr1[i] | arr2[i];
			int targetBit = 1;
			for(int j = 0; j < n; j++ ) {
				resultString =  ((arr & targetBit) > 0 ? "#" : " ") + resultString;
				targetBit = targetBit << 1;
			}
			result[i] = resultString;
			
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = solution(n, arr1, arr2);
		System.out.println(Arrays.toString(result));
	}
}































