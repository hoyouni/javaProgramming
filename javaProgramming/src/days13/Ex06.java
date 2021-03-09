package days13;

import java.util.Arrays;

/**
 * @Author k≡n¡k
 * @Source Ex06.java
 * @Date 2019. 8. 14. - 오후 2:43:53
 * @Subject  배열 + 제어문 
 */
public class Ex06 {

	public static void main(String[] args) {
		int [][] m = new int[5][5];
		// fillM01(m);
		// fillM02(m);
		// fillM03(m); // 지그재그
		// fillM04(m); // 좌측 90도 회전
		// fillM05(m);
		magicSquare(m);
		//dispM(m);
	}

	private static void magicSquare(int[][] m) {
		int row=0, col=m.length/2;

		for (int i = 1; i <=25 ; i++) {
			m[row][col] = i;

			if( i % 5 == 0) {
				row++;
			}else {
				row--; col++; 
				if( row == -1 ) 
					row=m.length-1;
				if( col == m.length)
					col=0;
			}
		}
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("[%d]", m[i][j]);
			} System.out.println();
		}


	}

	private static void fillM05(int[][] m) {
		/*
		        [00][00][00][00][01]
				[00][00][00][03][02]
				[00][00][06][05][04]
				[00][10][09][08][07]
				[15][14][13][12][11]

		for (int i = 0, k=1; i < m.length; i++) {
			for (int j = 4 ; j >= 4-i; j--) {
				m[i][j]= k++;
			}
		}
		 */
		/*
		        [00][00][00][00][01]             4
				[00][00][00][02][03]        3   4
				[00][00][04][05][06]    2  3   4
				[00][07][08][09][10]
				[11][12][13][14][15]
		for (int i = 0, k=1; i < m.length; i++) {
			for (int j = 4-i ; j < m.length; j++) {
				m[i][j]= k++;
			}
		}
		 */
		/*
		        [01][00][00][00][00]
				[02][03][00][00][00]
				[04][05][06][00][00]
				[07][08][09][10][00]
				[11][12][13][14][15]
		 for (int i = 0, k=1; i < m.length; i++) {
			for (int j = 0; j < i+1; j++) {
				m[i][j]= k++;
			}
		}
		 */
	}

	private static void fillM04(int[][] m) { 
		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) { 
				m [4-j][i] =   5*i+j+1 ;
			} 
		}

		/*
		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) { 
				m[i][j] =   5-i  + (j*5);
			} 
		}
		 */

	}

	private static void fillM03(int[][] m) {
		/*
		1	 2	  3	  4	  5
		10 8	  8	  7	  6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		 */

		// 방은 그래도이고 값을 계산해서 할당.
		/*
		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) { 
				m[i][j] =  ( i%2==0)  ? 5*i+j+1 : (i+1)*5 - j  ;
			} 
		}
		 */
		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {  
				m[i][ i%2 == 0? j: 4-j] =   5*i+j+1  ;
			} 
		}
	} 

	private static void fillM02(int[][] m) {
		/*
		25	24	23	22	21
		20	19	18	17	16
		15	14	13	12	11
		10	9	8	7	6
		5	4	3	2	1
		 */
		/*
		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =  26 -  (5*i+j+1);
			} 
		}
		 */

		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] =  5*i+j+1 ;
			} 
		}
	}

	private static void fillM01(int[][] m) {
		// i=0   j=01234
		// i=1   j=01234
		// i=2   j=01234
		// i=3   j=01234
		// i=4   j=01234
		/*
		for (int i = 0, k = 1; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = k++;
			} 
		}
		 */
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =  5*i+j+1 ;
			} 
		}
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
		}

	}

}
//









//