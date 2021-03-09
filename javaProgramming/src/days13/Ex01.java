package days13;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author k��n��k
 * @Source Ex01.java
 * @Date 2019. 8. 14. - ���� 7:38:04
 * @Subject  ����(Sort)�� �˻�(Search)
 *                  1. ���� ���
 *                    ��. ���ù� : *[��������], ������
 *                    ��. ��ȯ�� : *[��������], ������
 *                    ��. ���Թ� : [��������], ������
 *                    ��. ���չ� : [��������]
 *                    ��. ��Ÿ    : �������
 *                  2. �˻� ���
 *                    ��. * �����˻�( sequence search)
 *                    ��. ���� �˻�( binary search )  
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int [] m = { 3, 5, 2, 4, 1 };
		//                  
		
		// Arrays Ŭ���� : �迭 ����ϱ� ������ ���(�Լ�)�� ������ Ŭ����
		// Arrays.sort(m);
		
		System.out.println( Arrays.toString(m) );  // [1, 2, 3, 4, 5]
		// [��������]
		// ���� ���� �����͸� ã�� ���� ���� �����Ϳ� ��ȯ�س����� ���� ���.
		selectionSort(m);
		
		System.out.println( Arrays.toString(m) );  // [1, 2, 3, 4, 5]
		 

	}

	private static void selectionSort(int[] m) {
		// 1ȸ�� : 0-1 0-2 0-3 0-4      [1][][][][]
		// 2ȸ�� : 1-2 1-3 1-4            [1][2][][][]
		// 3ȸ�� : 2-3 2-4                  [1][2][3][][]
		// 4ȸ�� : 3-4                        [1][2][3][4][5]
		
		// i=0  j=0,1,2,3   1 2 3 4 
		// i=1  j=0,1,2      2 3 4
		// i=2  j=0,1         3 4 
		// i=3  j=0            4
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j <=4; j++) {
				System.out.printf("%d-%d   ", i, j );		
				if( m[i] > m[j]) { 
					System.out.print(" *** ");
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println( Arrays.toString(m) );
			}
			//System.out.println();
		}
		
		
	}

}
// 

 









