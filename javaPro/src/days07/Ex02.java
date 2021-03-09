package days07;

public class Ex02 {
	public static void main(String[] args) {
	      String card = "7866-1738-9382-3898";
	      
	      String [] cards = card.split("-");
	      // ****   0  1  2  3     
	      int [] indexes = new int[2];
	      int index = 0;
	      while( indexes.length > index ) {
	         int indexNumber = (int)(Math.random()*4);
	         System.out.println("> 랜덤 발생 값 : " + indexNumber);
	         if( !Lotto.isDuplicateLottoCheck(indexes, indexNumber, index) ) {
	            cards[indexNumber] = "****";
	            indexes[index] =  indexNumber;
	            index++;            
	         }
	      }
	     /* public static boolean isDuplicateLottoCheck(int[] lotto, int lottoNumber, int index) {
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
*/
	      System.out.println(indexes[0] +" / " + indexes[1]);
	       
	      // 출력
	      //String result = String.join("-", cards);
	      //System.out.println(result);
	      
	      System.out.println(String.join("-", cards));
	     
	      // 7866-****-9382-****
	      // ****-****-9382-3898
	      // ****-1738-9382-****
	   }

	}
	//










