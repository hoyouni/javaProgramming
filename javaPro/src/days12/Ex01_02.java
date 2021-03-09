package days12;

import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 13. - 오전 7:50:20
 * @Subject  로또게임  ( 2차원 으로 처리 예제 )  
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 로또 번호 
		// 1차원 배열 선언   
		// 게임횟수 : n
		// int [] lotto = new int[6 * n];
		// [0][][][][][] /  [][][][][][] / [][][][][][] / [][][][][][] / [][][][][][29] 
		
		// 2차원 배열 선언
		// int [][] lottos = new int[n][6]
		// [0,0][][][][][]
        // [][][][][][]
		// [][][][][][]
        // [][][][][][]
		// [][][][][][4,5]

		
		// 각 요소 기본값 = 0 으로 초기화...
		// fillLotto(lotto);
		// printLotto(lotto);
		
		//                               3       5000
		int [][] lottos ;
		System.out.print("> 게임횟수, 입금액 입력 ? ");
		int n, money;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		money = scanner.nextInt();
		// 
		
		int gameCost = 1000;    // 한 게임 비용
		int maxNumberOfgames =  money / gameCost  ; // 최대 게임횟수
		int change = 0;   // 거스름돈
		
		if( n > maxNumberOfgames ) {
			System.out.printf("> 최대 게임 횟수는 %d회 입니다.\n "
					, maxNumberOfgames);
			n = maxNumberOfgames;
		}else {
			change = money  - n * gameCost;
		}
		lottos = new int[n][6];
		
		// [ 출력 형식 ]
		//1게임 : [][][][][][]
		//2게임 : [][][][][][]
		//3게임 : [][][][][][]
		// 거스름돈 : 2000원
		fillLottos(lottos);
		printLottos(lottos);
		System.out.printf("거스름돈 : %d원\n", change);

	} // main 

	private static void printLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d 게임 : ", i+1);
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
			// 중복되면 true, 중복되지 않으면 false
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