package days14;

import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 16. - 오전 11:15:50
 * @Subject 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// ┌ 1		// ─ 6		//  ┐ 2		// │ 5		// └ 3        //  ┘4
		// +  16		// ㅗ  21		// ㅜ  22		// ㅓ  23		// ㅏ  25		// ' '  0
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 열 갯수 입력하세요 ? ");
		int col = scanner.nextInt();  // 3
		// TOP
		// ┌ ────ㅜ *열갯수 ㅜX  ┐
		// 1                                                    2
		System.out.printf("%c",1);
		for (int i = 0; i < col; i++) {
			System.out.printf("%c%c%c%c%c",6,6,6,6,22);
		}
		System.out.printf("\b%c",2);
		System.out.println();
		// MID
		System.out.printf("%c",5);
		for (int i = 0; i < col; i++) {
			System.out.printf("%c%c%c%c%c",0,0,0,0,5);
		}
		System.out.println();
		// BOT
		System.out.printf("%c",3);
		for (int i = 0; i < col; i++) {
			System.out.printf("%c%c%c%c%c",6,6,6,6,21);
		}
		System.out.printf("\b%c",4);
		System.out.println();
		 

	   /*
       System.out.printf("%c%c%c%c%c%c\n"
			, (char)1, (char)6,(char)6,(char)6,(char)6,(char)2);
		System.out.printf("%c%c%c%c%c%c\n"
				, (char)5, (char)0,(char)0,(char)0,(char)0,(char)5);
		System.out.printf("%c%c%c%c%c%c\n"
				, (char)3, (char)6,(char)6,(char)6,(char)6,(char)4);
      */
		 
	} // main

}// class









//