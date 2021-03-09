package doItAlgo;

import java.util.Arrays;

// p 117
public class Prac03_03 {
	public static void main(String[] args) {
		int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
		int key = 9;
		
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				cnt++;
			}
		}
		
		int[] idx = new int[cnt];
		
		int result = searchIdx(a, key, idx);
		
		System.out.println(result);
	}

	private static int searchIdx(int[] a, int key, int[] idx) {
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				idx[cnt] = i;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(idx));
		return cnt;
	}
}





















