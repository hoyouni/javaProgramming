package days12;

import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex01.java
 * @Date 2019. 8. 13. - ���� 7:50:20
 * @Subject  �ζǰ���  ( 2���� ���� ó�� ���� )  
 */
public class Ex01 {

	public static void main(String[] args) {
		// �ζ� ��ȣ 
		// 1���� �迭 ����   
		// ����Ƚ�� : n
		// int [] lotto = new int[6 * n];
		// [0][][][][][] /  [][][][][][] / [][][][][][] / [][][][][][] / [][][][][][29] 
		
		// 2���� �迭 ����
		// int [][] lottos = new int[n][6]
		// [0,0][][][][][]
        // [][][][][][]
		// [][][][][][]
        // [][][][][][]
		// [][][][][][4,5]

		
		// �� ��� �⺻�� = 0 ���� �ʱ�ȭ...
		// fillLotto(lotto);
		// printLotto(lotto);
		
		//                               3       5000
		int [][] lottos ;
		System.out.print("> ����Ƚ�� ? ");
		int n, money;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		money = scanner.nextInt();		
		lottos = new int[n][6];
		// 
		fillLottos(lottos);
		printLottos(lottos); 
		// [ ��� ���� ]
		//1���� : [][][][][][]
		//2���� : [][][][][][]
		//3���� : [][][][][][]
		// �Ž����� : 2000��
		

	}
	
	private static void fillLottos(int[][] lottos) {
		
		for (int i = 0; i < lottos.length; i++) {  // ����Ƚ��
			
			int index = 0;
			int lottoNumber ;
			
			while(  lottos[i].length  >  index ) {    //  ������ 6
				lottoNumber = (int)(Math.random()  * 45) +1;
				// System.out.println(lottoNumber);			 
				// �ߺ��Ǹ� true, �ߺ����� ������ false
				if( !isDuplicateLottoCheck( lottos, lottoNumber, index, i ) ) {
				  lottos[i][index] = lottoNumber;
				  index++;
				}
			} 
			
		}
		
		
	}
   
	public static boolean isDuplicateLottoCheck(
			int[][] lottos, int lottoNumber, int index , int line) {
		boolean flag = false;	
		out:
			for (int i = 0; i < index; i++) {
				if( lottos[line][i] == lottoNumber) {
					flag = true;
					break out;
				}
			}		
		return flag;
	}
	
	private static void printLottos(int[][] lottos) {
		
		 for (int i = 0; i < lottos.length; i++) {
			 System.out.printf("%d ���� : ", i+1 );
			 for (int j = 0; j < lottos[i].length; j++) {
				 System.out.printf("[%02d]", lottos[i][j]);
			}
			 System.out.println();
		}
	}

}
// 









//