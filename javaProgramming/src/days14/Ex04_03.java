package days14;

import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 16. - 오전 11:15:50
 * @Subject 
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// ┌ 1		// ─ 6		//  ┐ 2		// │ 5		// └ 3        //  ┘4
		// +  16		// ㅗ  21		// ㅜ  22		// ㅓ  23		// ㅏ  25		// ' '  0

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 행, 열 갯수 입력하세요 ? ");
		int row = scanner.nextInt();  // 4
		int col = scanner.nextInt();    // 3

		// TOP 
		System.out.printf("%c",1);
		for (int i = 0; i < col; i++) {
			System.out.printf("%c%c%c%c%c",6,6,6,6,22);
		}
		System.out.printf("\b%c",2);
		System.out.println();
		// MID 
		for (int i = 0; i < row; i++) {
			//│					│					│					│
			System.out.printf("%c",5);
			for (int j = 0; j< col; j++) {
				System.out.printf("%c%c%c%c%c",0,0,0,0,5);
			}
			System.out.println(); 
			//ㅏ	─	─	─	─		─	─	─	─		─	─	─	─	ㅓ
			if(i == row-1) break;
			System.out.printf("%c",25);
			for (int j = 0; j < col; j++) {
				System.out.printf("%c%c%c%c%c",6,6,6,6,16);
			}
			System.out.printf("\b%c",23);
			System.out.println();
		}

		// BOT
		System.out.printf("%c",3);
		for (int i = 0; i < col; i++) {
			System.out.printf("%c%c%c%c%c",6,6,6,6,21);
		}
		System.out.printf("\b%c",4);
		System.out.println();
	} // main

}// class









//