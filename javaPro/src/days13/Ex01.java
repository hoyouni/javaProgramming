package days13;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 14. - 오전 7:38:04
 * @Subject  정렬(Sort)과 검색(Search)
 *                  1. 정렬 방법
 *                    ㄱ. 선택법 : *[선택정렬], 힙정렬
 *                    ㄴ. 교환법 : *[버블정렬], 힙정렬
 *                    ㄷ. 삽입법 : [삽입정렬], 쉘정렬
 *                    ㄹ. 병합법 : [병합정렬]
 *                    ㅁ. 기타    : 기수정렬
 *                  2. 검색 방법
 *                    ㄱ. * 순차검색( sequence search)
 *                    ㄴ. 이진 검색( binary search )  
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int [] m = { 3, 5, 2, 4, 1 };
		//                  
		
		// Arrays 클래스 : 배열 사용하기 쉽도록 기능(함수)을 구현한 클래스
		// Arrays.sort(m);
		
		System.out.println( Arrays.toString(m) );  // [1, 2, 3, 4, 5]
		// [선택정렬]
		// 가장 작은 데이터를 찾아 가장 앞의 데이터와 교환해나가는 정렬 방식.
		selectionSort(m);
		
		System.out.println( Arrays.toString(m) );  // [1, 2, 3, 4, 5]
		 

	}

	private static void selectionSort(int[] m) {
		// 1회전 : 0-1 0-2 0-3 0-4      [1][][][][]
		// 2회전 : 1-2 1-3 1-4            [1][2][][][]
		// 3회전 : 2-3 2-4                  [1][2][3][][]
		// 4회전 : 3-4                        [1][2][3][4][5]
		
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

 









