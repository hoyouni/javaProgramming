package days13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex02.java
 * @Date 2019. 8. 14. - ���� 10:49:47
 * @Subject [�����˻�( Binary Search )]
 *                 ����(�ʼ�����)�� ������ ������ �̺�ȭ�ϸ鼭 Ž���ϴ� ���
 */
public class Ex02 {

	public static void main(String[] args) {
		//   1~1000 ������ ä���־���. 
		//   �����˻�����   � ���� �˻� ? 1     100
		int [] m = new int[10];
		fillM(m); 
		//Arrays.sort(m);		
		System.out.println( Arrays.toString(m) );

		Scanner scanner = new Scanner(System.in);
		System.out.print("> ã�� ���� �Է� ? ");
		int n =  scanner.nextInt();

		int idx = binarySearch(m, n);
		//int idx = Arrays.binarySearch(m, n);

		if( idx == -1 ) 
			System.out.println("ã�� ���� ����.");
		else               
			System.out.printf("ã�� ������ %d ��ġ�� �ִ�. ", idx);

	}

	private static int binarySearch(int[] m, int n) {
		int bottom = 0, mid , top = m.length-1;
		int cnt = 0;
		while(bottom <= top ) {
			cnt++;
			mid =  (bottom+top)/2;			
			if( m[mid] == n ) {				
				System.out.println(cnt +" Ƚ������ ã�Ҵ�.");
				return mid;
			}
			else if( m[mid] >  n  )  
				top = mid-1;
			else                              
				bottom = mid+1;
		}	 
		System.out.println(cnt +" Ƚ������ ã�Ҵ�.");
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