package days07;

import java.util.Arrays;

/*
 * �迭�� ������ ���� �ְ� 
 * ���������� ã�� �˰����� �����ض�
 * 
 */

import java.util.Scanner;

public class Ex03 {
	 public static void main(String[] args) {
		  
		 int len = 10;
		
		
		 int[] num = new int[len];
		 int lastIndex = 0;
		 
		 fillArray(num);
		 printArray(num);
		 int searchNum = searchNum();
		 int[] resultNum = indexof(num, searchNum, lastIndex);
		 resultIndex(resultNum);  
		 
		 }
	 
	 
	 
	public static void resultIndex(int[] resultNum) {
		for(int i  = 0; i < resultNum.length; i++) {
				Arrays.sort(resultNum);
				if(resultNum[i] != 0)
				System.out.print(resultNum[i] + " ");
			}
		
	}

	public static int[] indexof(int[] num, int searchNum, int lastIndex) {
		lastIndex = num.length-1;
		int index = 0;
		int result[] = new int[num.length];
		for(int i = lastIndex; i >= 0; i--) {
			if(num[i] == searchNum) {
				result[index] = i;
				index++;
			}
		} 
		
		
		
		return result;
	}

	public static int searchNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� ������ �Է� �ϼ��� : ");
		int n = sc.nextInt();
		return n;
	}

	public static void printArray(int[] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.printf("[%02d]", num[i]);
		} System.out.println();
		
	}

	public static void fillArray(int[] num) {
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 50) + 1;
		}
		
	}
		 
		
}










