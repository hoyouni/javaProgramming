package days12;

import java.util.Arrays;

/**
 * @Author k≡n¡k
 * @Source Ex07.java
 * @Date 2019. 8. 13. - 오후 4:14:15
 * @Subject 정렬( Sort ) 순서 대로 나열하는 것
 *                 오름차순( asc ) 기본
 *                 내림차순( desc )
 *                       숫자, 한글, 알파벳 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 
		int [] m = { 3, 5, 2, 4, 1};
		System.out.println( Arrays.toString(m) );
		// 버블 정렬 + 오름차순( asc )
		 bubbleSort(m);
		//선택 정렬
		//selectionSort(m);
		System.out.println( Arrays.toString(m) );
		// 삽입 정렬
		
		// 병합 정렬
	}

	private static void bubbleSort(int[] m) {
		 // 0-1 1-2 2-3 3-4   ****      x -  x+1
		 // 0-1 1-2 2-3         ***
		 // 0-1 1-2               **
		 // 0-1                     * 
		for (int i = 0; i < 4; i++) {
			//System.out.printf("%d 회전 : " , i+1);
			for (int j = 0; j < 4-i; j++) {
				//System.out.printf("%d-%d   ", j , j+1 );
				if( m[j] > m[j+1]) {
					//System.out.print(" *** ");
					int temp = m[j];
					m[j]  = m[j+1];
					m[j+1] = temp;
				}
				//System.out.println( Arrays.toString(m) );
			}
			//System.out.println( Arrays.toString(m) );
			//System.out.println();
		}
		
		
	}

}
//









//