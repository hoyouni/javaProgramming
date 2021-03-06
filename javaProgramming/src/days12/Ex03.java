package days12;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 13. - 오전 11:23:28
 * @Subject    2차원 배열 -> 1차원 배열
 *                    1차원 배열 -> 2차원 배열
 *                    n행 m열 배열 -> x행 y열 배열 
 */
public class Ex03 {

	public static void main(String[] args) {
		// 2차원 배열 -> 1차원 배열
		int [][] m = {
									{1,2,3},
									{4,5,6},
									{7,8,9},
									{10,11,12}
							};
		int [] n = new int[m.length * m[0].length];
		// 2차원 -> 1차원
		/*
		0,0                  0
		0,1                  1
		0,2                  2

		1,0                 3
		1,1                 4
		
		i, j                  3*i+j  
		*/
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[ 3*i+j ]= m[i][j];
			}
		}
		
		
		// 출력
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		}
		System.out.println();

	}

}
//









//