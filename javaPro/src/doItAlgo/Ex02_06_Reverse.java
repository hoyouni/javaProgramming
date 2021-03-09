package doItAlgo;

import java.util.Arrays;
		
// 역순 정렬
public class Ex02_06_Reverse {
	public static void swap(int[] num, int first, int second) {
		int temp = num[first];
		num[first] = num[second];
		num[second] = temp; 
	}
		
	public static void main(String[] args) {
		int[] num = {22, 57, 11, 32, 91, 68, 70};
		
		System.out.println("num : " + Arrays.toString(num));
		
		for(int i = 0; i < num.length / 2; i++) {
			swap(num, i, num.length -1 - i);
			System.out.println("num["+i+"] 와 num["+(num.length - 1- i)+"] 를 교환합니다.");
			System.out.println(Arrays.toString(num));
		}
			
		System.out.println("reverse num : " + Arrays.toString(num));
		
	}
}































