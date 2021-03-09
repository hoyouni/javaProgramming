package days07;

public class Lotto {

		public static void main(String[] args) {
		      
		      // 배열 선언...
		      int [] lotto = new int[6];
		      // 로또번호 랜덤하게 발생시켜서 채워넣는 함수
		      fillLotto(lotto);      
		      // 로또번호 출력하는 함수 
		      printLotto(lotto);       
		   }
		   
		   private static void fillLotto(int[] lotto) {
		      int index = 0;
		      int lottoNumber ;
		      while(  lotto.length  >  index ) { 
		         lottoNumber = (int)(Math.random()  * 45) +1;
		         System.out.println(lottoNumber);          
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

		}
/* 
		   private static void fillLotto(int[] lotto) {
		      int index = 0;
		      int lottoNumber ;
		      boolean flag = false;      
		      while(  lotto.length  >  index ) {
		         flag = false;
		         lottoNumber = (int)(Math.random()  * 45) +1;
		         System.out.println(lottoNumber);
		         //
		         out:
		         for (int i = 0; i < index; i++) {
		            if( lotto[i] == lottoNumber) {
		               flag = true;
		               break out;
		            }
		         }
		                  
		         //
		         if( !flag ) {
		           lotto[index] = lottoNumber;
		           index++;
		         }
		      } 
		   }
 */
		//
// Math 클래스
// System.out.println( Math.PI );  // 3.141592653589793      
// 0.0 <= double  java.lang.Math.random()   < 1.0
// 임의의 난수를 발생시키는 함수 : Math.random()
// int number;
/*
		      for (int i = 0 , number ; i < 10000; i++) {
		         number =  (int)(Math.random()  * 45) +1;
		         if( 1 > number || number > 45 ) {
		            System.out.println("XXX");
		         }
		      }
		      System.out.println("END");
 */

// [로또 645]
// 랜덤하게 1~45까지의 정수를 6개 출력...
// 0.0 * 45 <= double  Math.random()  * 45 < 1.0 * 45
// (int)0.0 <=   double  (int)(Math.random()  * 45)   < (int)45.0
// 0 + 1 <= int  (int)(Math.random()  * 45) +1  < 45+1
// 1 <=  int  < 46
// 1 <=        <= 45


// 1 <=   int 정수 <=45      
// 로또 번호는 중복 번호 X : 중복체크 해서 ...
// i = 1         *34*
// i = 2         [34]

// 로또 번호 랜덤한 숫자 발생할 때 마다 -- > 저장
// 저장하기 변수 선언   로또번호1  ~ 6   
//int lotto1 = 34;
//int lotto2 = 23;
//int lotto6;









