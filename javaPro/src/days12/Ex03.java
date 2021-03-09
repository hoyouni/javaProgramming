package days12;

/**
 * @Author k��n��k
 * @Source Ex03.java
 * @Date 2019. 8. 13. - ���� 11:23:28
 * @Subject    2���� �迭 -> 1���� �迭
 *                    1���� �迭 -> 2���� �迭
 *                    n�� m�� �迭 -> x�� y�� �迭 
 */
public class Ex03 {

	public static void main(String[] args) {
		// 2���� �迭 -> 1���� �迭
		int [][] m = {
									{1,2,3},
									{4,5,6},
									{7,8,9},
									{10,11,12}
							};
		int [] n = new int[m.length * m[0].length];
		// 2���� -> 1����
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
		
		
		// ���
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		}
		System.out.println();

	}

}
//









//