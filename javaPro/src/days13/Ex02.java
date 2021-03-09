package days13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 14. - 오전 10:49:47
 * @Subject [이진검색( Binary Search )]
 *                 정렬(필수조건)된 데이터 집합을 이분화하면서 탐색하는 방법
 */
public class Ex02 {

	public static void main(String[] args) {
		//   1~1000 정수를 채워넣었다. 
		//   순차검색으로   어떤 정수 검색 ? 1     100
		int [] m = new int[10];
		fillM(m); 
		//Arrays.sort(m);		
		System.out.println( Arrays.toString(m) );

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 찾을 정수 입력 ? ");
		int n =  scanner.nextInt();

		int idx = binarySearch(m, n);
		//int idx = Arrays.binarySearch(m, n);

		if( idx == -1 ) 
			System.out.println("찾는 정수 없다.");
		else               
			System.out.printf("찾는 정수는 %d 위치에 있다. ", idx);

	}

	private static int binarySearch(int[] m, int n) {
		int bottom = 0, mid , top = m.length-1;
		int cnt = 0;
		while(bottom <= top ) {
			cnt++;
			mid =  (bottom+top)/2;			
			if( m[mid] == n ) {				
				System.out.println(cnt +" 횟수에서 찾았다.");
				return mid;
			}
			else if( m[mid] >  n  )  
				top = mid-1;
			else                              
				bottom = mid+1;
		}	 
		System.out.println(cnt +" 횟수에서 찾았다.");
		return -1;
	}

	private static void fillM(int[] m) {
		//long seed = System.nanoTime();
		long seed = System.currentTimeMillis();  // 
		Random rnd = new Random( seed );
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(101);
		}
	}


}
//









//