package days06;


/**
 * ��¥ 2019. 8. 5.
 * ���ϸ� Ex02.java
 * �׽�Ʈ ���� Ǯ�� (Ȧ¦ ��)
 */
public class Ex02 {
   public static void main(String[] args) {
      
      int sum = 0;
      boolean sw = true;
      for(int i = 1; i <= 10; i++, sw = !sw) {
         sum = sum + (sw ? i : -i);
         System.out.printf(sw ? "%d" : "%+d+", i);
      } System.out.printf("\b=%d", sum);
      
      
      /*
      // 1-2+3-4+5-6+7-8+9-10=-5
            // Ȧ�� : Ȧ-       sum += 1
            // ¦�� : ¦+      sum -= 2
            int sum = 0 ;
            boolean sw = true;
            for (int i = 1; i <=10 ; i++) {
               if(!sw) {
                  sum -= i;
                  System.out.printf("%d+", i);
                  //sw = !sw;
               }else {
                  sum += i;
                  System.out.printf("%d-", i);
                  //sw = !sw;
               }
               sw = !sw;
            }
               /*
               if(i%2==0) {
                  sum -= i;
                  System.out.printf("%d+", i);
               }else {
                  sum += i;
                  System.out.printf("%d-", i);
               }
               */
               
               //if( i%2 != 0)  i = i*-1;      // i = i*-1     i*=-1     -i  ���<->����   
               //sum += i;
            
            //System.out.printf("\b=%d\n", sum);
            
      /*
       * 1-2+3...���
       * int sum = 0;
       * for(int i = 1; i <= 10; i++) { 
       * if(i % 2 == 1) { 
       * sum = sum + i;
       * System.out.printf("%d", i); 
       * } else {
       *  i = i * -1; 
       *  sum = sum + i;
       * System.out.printf(i == -10 ? "%+d" : "%+d+", i);
       *  i = i * -1; 
       *     } 
       * }
       * System.out.printf("=%d", sum);
       */
   }
}