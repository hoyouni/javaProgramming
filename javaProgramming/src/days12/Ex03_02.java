package days12;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 13. - 오전 11:23:28
 * @Subject    2차원 배열 -> 1차원 배열
 *                    [ 1차원 배열 -> 2차원 배열 ]
 *                    n행 m열 배열 -> x행 y열 배열 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 
		int [] m = { 1,2,3,4,5,6,7,8,9,10,11,12 };
		
		int [][] n = new int[2][6];		
		//  1차원 배열 -> 2차원 배열
		//   i
		//   0    	0,0
		//   1    	0,1
		//   2		0,2
		//   3		0,3
		//   4		1,0
		
		//   i      i/열갯수    i%열갯수
		int col = n[0].length;
		for (int i = 0; i < m.length; i++) {
			 n[ i/col ][ i%col ] = m[i];
		}
		
		// 출력
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("[%02d]", n[i][j]);
			}
			System.out.println();
		}
		

	}

}
//









//