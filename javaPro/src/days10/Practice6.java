package days10;

import java.util.Random;
import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		int[] array = new int[20];
		fillArray(array);
		printArray(array);

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 하시오 : ");
		int num = sc.nextInt();

		printApproximate(array, num);
	}

	public static void printApproximate(int[] array, int num) {
		int []  approximateValues = { array[0], -1 };

		int minGap =  Math.abs( array[0] - num );
		int gap;

		for (int i = 1; i < array.length; i++) {
			gap = Math.abs( array[i]- num );
			if( gap < minGap ) {
				minGap = gap;
				approximateValues[0] = array[i];
			}else if( gap == minGap && approximateValues[0] != array[i]) {
				approximateValues[1] = array[i];
			}
		}

		//System.out.println("> 근사치1 : " + 근사치1 );
		//System.out.println("> 근사치2 : " + 근사치2 );
		for (int i = 0; i < approximateValues.length; i++) {
			System.out.printf("> 근사치 %d : %d\n ", i+1, approximateValues[i] );
		}

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
