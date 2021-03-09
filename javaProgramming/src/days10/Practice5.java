package days10;

import java.util.Random;

public class Practice5 {
	public static void main(String[] args) {
		int[] array = new int[20];
		fillArray(array);
		printArray(array);
		printMin(array);
		printMax(array);
	}

	public static void printMax(int[] array) {
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		} System.out.printf("max : %d", max);
		
	}

	public static void printMin(int[] array) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
			
		}System.out.printf("min : %d", min);
		System.out.println();
		
	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("[%d]\t", array[i]);
			if(i % 10 == 9) 
				System.out.println();
		}
		
	}

	public static void fillArray(int[] array) {
		Random rm = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rm.nextInt(100) + 1;
			
		}
		
		
	}
}
