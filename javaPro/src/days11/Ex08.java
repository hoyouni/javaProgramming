package days11;

/**
 * @Author k≡n¡k
 * @Source Ex08.java
 * @Date 2019. 8. 12. - 오후 3:33:10
 * @Subject 다차원 배열.... 
 */
public class Ex08 {

	public static void main(String[] args) {
		// 1차원 배열  : 열
		//int [] m = new int[8];
		// 배열크기
		// System.out.println(  m.length ); // 8
		// 배열 초기화
		// int [] m = {1,2,3,4,5,6,7,8};
		
		
		// 2차원 배열 : 4행, 2열
		// int [][] m = new int[4][2];
		// 2차원 배열의 초기화.
		int [][] m = {
				              {1,2},
				              {3,4},
				              {5,6},
				              {7,8} 
		                   };
		// 2차원 배열의 배열 크기
		// 행크기 :  배열명.length
		System.out.println( m.length * m[0].length );  // 배열의 크기.
		System.out.println( m.length );   //  행크기
		// 열크기
		System.out.println( m[0].length  );// 0행의  열크기
		System.out.println( m[1].length  );// 1행의  열크기
		System.out.println( m[2].length  );// 2행의  열크기
		System.out.println( m[3].length  );// 3행의  열크기
		
		// 3차원 배열 : 면 행 열
		//int [][][] m = new int[2][2][2];
		

	}

}
//









//