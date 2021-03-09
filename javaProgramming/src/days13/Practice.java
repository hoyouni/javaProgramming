package days13;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		int[] m = {3,2,1,4,5};
		
		for(int i = 1; i < m.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(m[j] > m[i]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(m));
	}
}
