package days14;

import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex05.java
 * @Date 2019. 8. 16. - 오후 2:10:32
 * @Subject 사다리게임. 
 */
public class Ex05 {

	public static void main(String[] args) {
		int n ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 사다리 인원수 ? ");
		n = scanner.nextInt();
		//
		int [][] ladder = new int[15][n];
		// int [] ladderStyles = {'ㅏ', 'ㅓ', 'ㅣ'};
		int [] ladderStyles = { 25, 23, 5 };
		//                              
		/*
		for (int i = 0; i < ladderStyles.length; i++) {
			System.out.printf("%d\t %c\n", ladderStyles[i],ladderStyles[i]);
		}
		 */

		// ㄱ. 1 열일 경우 엔         ㅣ   ㅏ
		// ㄴ. 마지막열 일 경우엔     l   ㅣ     ㅓ    ㅣ
		//                   앞 열 ㅏ   ㅓ         
		// ㄷ. 그 외              ㅣ   ㅏ    ㅓ
		//                   앞 열     ㅏ   ㅓ
		//                   앞 열     ㅣ   ㅣ  ㅏ
		//                   앞 열     ㅓ    ㅣ   ㅏ

		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				// 첫 번째 행 또는 마지막 행    |
				if( i==0 || i ==ladder.length-1) {
					ladder[i][j]= 5;
					continue;
				}

				if( j==0 ) {  // 첫 번째 열
					//                              0, 1                                   ㅏ    ㅣ
					ladder[i][j] = (int)(Math.random()*2) == 0 ? 25 : 5;
				}else {
					int prev = ladder[i][j-1];  // 그 배열의 앞 열의 모양 ?  ㅣ   ㅏ   ㅓ

					if( j== ladder[i].length-1) {   // 마지막 열
						//                               ㅏ      ㅓ     ㅣ
						ladder[i][j] = prev == 25 ? 23 : 5 ;
					}else {                                // 그 외.....
						if( prev == 25) {  // ㅏ
							ladder[i][j] = 23; // ㅓ
						}else {
							ladder[i][j] = (int)(Math.random()*2) == 0 ? 25 : 5;
						}
					}
				}

			}
		}

		// 사다리 그리는 for 문
		int gab = (104-n)/n;
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				int ladderStyle = ladder[i][j]; 
				System.out.printf("%c", ladderStyle );
				// gab  처리
				for (int g=0; g<gab ; g++ )
				{
					System.out.printf("%c", ladderStyle == 25 ? 6 :0);
				}
			}
			System.out.println();
		} 

	}
}



//