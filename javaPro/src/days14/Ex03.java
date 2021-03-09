package days14;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 16. - 오전 10:43:49
 * @Subject 대각선
 */
public class Ex03 {

	public static void main(String[] args) {
		//
		int [][] m = new int[5][5];
		int row =0, col=0;
		int k = 1;
		for (int i = 0; i < m.length*2 - 1; i++) {
			
			if( i < m.length ) {  row=0;  col=i; }
			else                   {  row=i-4;  col=4; }
			while( true) {
				m[row][col]= k++;
				row++;  col--;
				if( row == 5 || col == -1) break;
			} 
		}
		//
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
		}

	}

}
//









//