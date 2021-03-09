package days10;
//마름모 찍기
public class Practice1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int  j = 1; j <= 5; j++) {
				if( i + j >= 4 && j - i <= 2  && i-j < 3 && i + j  < 9) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			}System.out.println();
		}
	}
}
/*
 *    __ __ 13 __ __
 *    __ 22 23 24 __
 *    31 32 33 34 35
 *    __ 42 43 44 45
 *    __ __ 53 54 55
 */
