package days11;

public class Ex09 {

	public static void main(String[] args) {
		
		//int [][][] m = new int[4][2][3];
		// 3차원 배열의 초기화
		int [][][] m = { 
				                   {
				                	   {1,2,3},
				                	   {4,5,6}
				                   },
				                   {
				                	    {7,8,9},
				                	    {10,11,12}
				                   },
				                   {
				                	   {13,14,15},
				                	   {16,17,18}
				                	},
				                   {
				                		{19,20,21},
				                		{22,23,24}
				                	}
				               };
		// 
		for (int i = 0; i < m.length; i++) {                       // 면 갯수
			System.out.printf("[%d면]\n", i);
			for (int j = 0; j < m[i].length; j++) {               // 행 갯수
				for (int j2 = 0; j2 < m[i][j].length; j2++) {  // 열갯수
					System.out.printf("[%d]", m[i][j][j2]);
				}
				System.out.println();
			} 
			System.out.println();
		}
		
		/*
		System.out.println( m.length ); // 면 크기
		
		System.out.println( m[0].length ); // 0면 행크기
		System.out.println( m[1].length ); // 1면 행크기
		System.out.println( m[2].length ); // 2면 행크기
		System.out.println( m[3].length ); // 3면 행크기
		
		System.out.println( m[0][0].length ); // 0면0행의   열크기
		System.out.println( m[0][1].length ); // 0면0행의   열크기
		System.out.println( m[3][1].length ); // 0면0행의   열크기
		*/
		/*
		int [][] m = {
	              {1,2},
	              {3,4},
	              {5,6},
	              {7,8} 
             };
		// 2차원 배열 출력 ( 암기 )
		for (int i = 0; i < m.length; i++) {            // 행갯수
			for (int j = 0; j < m[i].length; j++) {        // 별(열)갯수
				System.out.printf("[%d]", m[i][j]);
			}
			System.out.println();
		}
		*/

	}

}
//









//