package days12;

import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 13. - 오전 7:50:20
 * @Subject  로또게임  ( 2차원 으로 처리 예제 )  
 */
public class Ex01 {

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
		System.out.print("> 게임횟수 ? ");
		int n, money;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		money = scanner.nextInt();		
		lottos = new int[n][6];
		// 
		fillLottos(lottos);
		printLottos(lottos); 
		// [ 출력 형식 ]
		//1게임 : [][][][][][]
		//2게임 : [][][][][][]
		//3게임 : [][][][][][]
		// 거스름돈 : 2000원
		

	}
	
	private static void fillLottos(int[][] lottos) {
		
		for (int i = 0; i < lottos.length; i++) {  // 게임횟수
			
			int index = 0;
			int lottoNumber ;
			
			while(  lottos[i].length  >  index ) {    //  열갯수 6
				lottoNumber = (int)(Math.random()  * 45) +1;
				// System.out.println(lottoNumber);			 
				// 중복되면 true, 중복되지 않으면 false
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
			 System.out.printf("%d 게임 : ", i+1 );
			 for (int j = 0; j < lottos[i].length; j++) {
				 System.out.printf("[%02d]", lottos[i][j]);
			}
			 System.out.println();
		}
	}

}
// 









//