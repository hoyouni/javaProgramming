package days14;

import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 16. - 오전 11:15:50
 * @Subject 
 */
public class Ex04_08 {

	public static void main(String[] args) {
		// ┌ 1
		// ─ 6
		//  ┐ 2
		// │ 5
		// └ 3
        //  ┘4
		// +  16
		// ㅗ  21
		// ㅜ  22
		// ㅓ  23
		// ㅏ  25 
		// ' '  0
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 열 갯수 입력하세요 ? ");
		int col = scanner.nextInt();
		//
		int [][] rect = new int[3][5*col+1];
		for (int i = 0; i < rect.length; i++) {
			if(i==0) {   // TOP
				for (int j = 0; j < rect[i].length; j++) {					
					if( j%5==0) rect[0][j] = 22; 
					else rect[0][j] = 6;  
					if( j==0)  rect[0][0] = 1; 
					else if( j == rect[i].length-1)  rect[0][rect[i].length-1]=2;
				}
			}else if( i==rect.length-1) { // BOTTOM
				for (int j = 0; j < rect[i].length; j++) {					
					if( j%5==0) rect[rect.length-1][j] = 21; 
					else rect[rect.length-1][j] = 6;  
					if( j==0)  rect[rect.length-1][0] = 3; 
					else if( j == rect[i].length-1)  rect[rect.length-1][rect[i].length-1]=4;
				}
				
			}else{
				 for (int j = 0; j < rect[i].length; j++) {					
					if( j%5==0) rect[i][j] = 5; 
				}
			}
		}
		
		// 출력
		for (int i = 0; i < rect.length; i++) {
			for (int j = 0; j < rect[i].length; j++) {
				System.out.printf("%c", rect[i][j]);
			}
			System.out.println();
		}

	}

}
//









//