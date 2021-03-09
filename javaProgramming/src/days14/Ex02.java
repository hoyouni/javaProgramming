package days14;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 16. - 오전 10:22:14
 * @Subject  
 */
public class Ex02 {

	public static void main(String[] args) {
		// 골뱅이.
		/*
		열 증가			5	번
		                     n--
		행 증가			4	번
		
		열 감소			4	번
		행 감소			3	번
		열 증가			3	번
		행 증가			2	번
		열 감소			2	번
		행 감소			1	번
		열 증가			1	번
        */
		
		int n = 5;
		int row = 0, col=0;
		boolean sw = true;
		while( true ) {
			 
			System.out.printf("열 %s - %d\n", sw?"증가":"감소",  n);
			n--;
			if( n < 1) break;
			System.out.printf("행 %s - %d\n",sw?"증가":"감소",n);
			
			sw = !sw;
		}
		 
	}

}
//









//