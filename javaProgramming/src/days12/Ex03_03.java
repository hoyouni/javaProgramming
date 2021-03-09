package days12;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 13. - 오전 11:23:28
 * @Subject    4행 3열 배열 -> 2행 6열 배열 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// (내일 테스트 1번 문제)
		// 2차원 배열 -> 2차원 배열  변환( 정보처리 기사 )
		// 4행3열      -> 2행 6열
		int [][] m = {
									{1,2,3},
									{4,5,6},
									{7,8,9},
									{10,11,12}
							};
		int [][] n = new int[3][5];
		//
		int mCol = m[0].length;
		int nCol = n[0].length;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// 2차원  -> 1차원 -> 2 차원
				// 0 0          0
				// 0 1           1
				// 0 2           2
				// 1 0           3
				//                 :
				// 3 2           11
				// i  j         temp
				int temp = mCol*i+j;  // 2->1
				n[temp/nCol][temp%nCol] = m[i][j];  // 1->2
			}
		}
		
		
		// 출력
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("[%02d]", n[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		 
		

	}

}
//









//