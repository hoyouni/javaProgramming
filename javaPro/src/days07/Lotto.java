package days07;

public class Lotto {

		public static void main(String[] args) {
		      
		      // �迭 ����...
		      int [] lotto = new int[6];
		      // �ζǹ�ȣ �����ϰ� �߻����Ѽ� ä���ִ� �Լ�
		      fillLotto(lotto);      
		      // �ζǹ�ȣ ����ϴ� �Լ� 
		      printLotto(lotto);       
		   }
		   
		   private static void fillLotto(int[] lotto) {
		      int index = 0;
		      int lottoNumber ;
		      while(  lotto.length  >  index ) { 
		         lottoNumber = (int)(Math.random()  * 45) +1;
		         System.out.println(lottoNumber);          
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
// Math Ŭ����
// System.out.println( Math.PI );  // 3.141592653589793      
// 0.0 <= double  java.lang.Math.random()   < 1.0
// ������ ������ �߻���Ű�� �Լ� : Math.random()
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

// [�ζ� 645]
// �����ϰ� 1~45������ ������ 6�� ���...
// 0.0 * 45 <= double  Math.random()  * 45 < 1.0 * 45
// (int)0.0 <=   double  (int)(Math.random()  * 45)   < (int)45.0
// 0 + 1 <= int  (int)(Math.random()  * 45) +1  < 45+1
// 1 <=  int  < 46
// 1 <=        <= 45


// 1 <=   int ���� <=45      
// �ζ� ��ȣ�� �ߺ� ��ȣ X : �ߺ�üũ �ؼ� ...
// i = 1         *34*
// i = 2         [34]

// �ζ� ��ȣ ������ ���� �߻��� �� ���� -- > ����
// �����ϱ� ���� ����   �ζǹ�ȣ1  ~ 6   
//int lotto1 = 34;
//int lotto2 = 23;
//int lotto6;









