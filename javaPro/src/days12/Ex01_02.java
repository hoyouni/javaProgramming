package days12;

import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex01.java
 * @Date 2019. 8. 13. - ���� 7:50:20
 * @Subject  �ζǰ���  ( 2���� ���� ó�� ���� )  
 */
public class Ex01_02 {

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
		System.out.print("> ����Ƚ��, �Աݾ� �Է� ? ");
		int n, money;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		money = scanner.nextInt();
		// 
		
		int gameCost = 1000;    // �� ���� ���
		int maxNumberOfgames =  money / gameCost  ; // �ִ� ����Ƚ��
		int change = 0;   // �Ž�����
		
		if( n > maxNumberOfgames ) {
			System.out.printf("> �ִ� ���� Ƚ���� %dȸ �Դϴ�.\n "
					, maxNumberOfgames);
			n = maxNumberOfgames;
		}else {
			change = money  - n * gameCost;
		}
		lottos = new int[n][6];
		
		// [ ��� ���� ]
		//1���� : [][][][][][]
		//2���� : [][][][][][]
		//3���� : [][][][][][]
		// �Ž����� : 2000��
		fillLottos(lottos);
		printLottos(lottos);
		System.out.printf("�Ž����� : %d��\n", change);

	} // main 

	private static void printLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d ���� : ", i+1);
			printLotto(lottos[i]);
		}
		
	}

	private static void fillLottos(int[][] lottos) {
		 for (int i = 0; i < lottos.length; i++) {
			 fillLotto( lottos[i] );
		}
	}

	private static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber ;
		while(  lotto.length  >  index ) { 
			lottoNumber = (int)(Math.random()  * 45) +1;
			//System.out.println(lottoNumber);			 
			// �ߺ��Ǹ� true, �ߺ����� ������ false
			if( !isDuplicateLottoCheck( lotto, lottoNumber, index) ) {
			  lotto[index] = lottoNumber;
			  index++;
			}
		} 
	}
   
	public static boolean isDuplicateLottoCheck(int[] lotto, int lottoNumber, int index) {
		boolean flag = false;	
		out:
			for (int i = 0; i < index; i++) {
				if( lotto[i] == lottoNumber) {
					flag = true;
					break out;
				}
			}		
		return flag;
	}
	
	private static void printLotto(int[] lotto) {
		 for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]", lotto[i]);
		}
		 System.out.println();
	}

}// class 









//