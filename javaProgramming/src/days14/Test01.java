package days14;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 16. - 오전 7:38:57
 * @Subject  
 */
public class Test01 {

	public static void main(String[] args) {
		/*
		1	10	 11 20 21
		2	9	 12 19 22
		3	8	 13 18 23
		4	7	 14 17 24
		5	6	 15 16 25
        */
		/*
		int [][] m = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if( i%2 == 0 ) m[j][i] = 5*i+j+1;
				else                m[4-j][i] = 5*i+j+1;
			} 
		}
		*/
		
		int [][] m = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) { 
				if( i%2 == 0 ) m[i][j] = i+1 + (5*j);
				else                m[i][j] =(10*j)-j;
			} 
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%02d]",m[i][j] ); 
			} 
			System.out.println();
		}
	}  // main

} // class
//







/*
public static void main(String[] args) { 
	int n = 5;
	int row = 0 , col = 0;
	int sign = 1;  // 증가
	
	while( true ) {
		System.out.printf("열%s - %d\n", sign==1?"증가":"감소", n);
		n--;
		if ( n == 0) break;			
		System.out.printf("행%s - %d\n", sign==1?"증가":"감소", n);
		sign = sign*-1;
	}

}  // main
*/

//
/*
public static void main(String[] args) {
	// 열증가 5
	// 행증가 4
	// 열감소 4
	// 행감소 3
	// 열증가 3
	// 행증가 2
	// 열감소 2
	// 행감소 1
	// 열감소 1
	 
	// [0,0][0,1][0,2][0,3][0,4]
	// [1,4][2,4][3,4][4,4]
	// [4,3][4,2][4,1][4,0]
	// [3,0][2,0][1,0]
	// [1,1][1,2][1,3]
	// [2,3][3,3]
	// [3,2][3,1]
	// [2,1]
	// [2,2]
					
	int n = 5;
	int row = 0 , col = 0;
	int sign = 1;  // 증가
	
	while( true ) {
		// System.out.printf("%d\n", n);
		for (int i = 0; i < n; i++) {				
			System.out.printf("[%d,%d]", row,col);
			col += sign;
		}
		col -= sign;
		System.out.println();
		n--;
		if ( n == 0) break;
		// System.out.printf("%d\n", n);
		for (int i = 0; i < n; i++) {				
			row+=sign;
			System.out.printf("[%d,%d]", row,col);
		}
		col -= sign;
		System.out.println();
		sign = sign*-1;
	}

}
*/
