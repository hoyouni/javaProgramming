package days14;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 16. - 오전 8:50:12
 * @Subject 제어문+배열+알고리즘,
 *                 클래스( p 230 ), 
 *                 가변인자(varagrs) 와 오버로딩( p 287 )
 */
public class Ex01 {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		
		
		
		/*
		1	10	 11 20 21
		2	9	 12 19 22
		3	8	 13 18 23
		4	7	 14 17 24
		5	6	 15 16 25 
		
		00 01 02 03 04
		10
		
		00 01
		10
		20
		30
		40
		 * */ 
		int [][] m = new int[5][5];
	    /*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if( j%2==0)				m[i][j] = j*5+i+1 ; 
				else                          m[i][j] = ( j+1)*5 - i;
			}
		}
	    */
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[j][i] = i % 2 == 0?   5*i+j+1 :( i+1)*5 -j  ;
			}
		}
		*/
		
		 
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i % 2 == 0 ) m[j][i] =    5*i+j+1 ;
				else                 m[4-j][i] =    5*i+j+1 ;
			}
		}
	 
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",  m[i][j] );
			}
			System.out.println();
		}
		

	}

}
// 이영재( 늦잠 )
// 정영진( 예비군 훈련 예정1 : 8.26~ 8.29 )









//