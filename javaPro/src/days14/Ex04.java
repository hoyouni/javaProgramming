package days14;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 16. - 오전 11:15:50
 * @Subject 
 */
public class Ex04 {

	public static void main(String[] args) {
		// ┌ 1 ─ 6 ── ┐ 2
		// │ 5     │
		// └ 3 ─── ┘4
		// +  16
		// ㅗ  21
		// ㅓ  23
		// ㅏ  25 
		// ' '  0
		
		int [][] rect = {
				               {1,6,6,6,6,2},
				               {5,0,0,0,0,5},
				               {3,6,6,6,6,4}
				             };
		// new int[3][5];
		
		System.out.printf("%c%c%c%c%c%c\n"
				, (char)1, (char)6,(char)6,(char)6,(char)6,(char)1);
		System.out.printf("%c%c%c%c%c%c\n"
				, (char)5, (char)0,(char)0,(char)0,(char)0,(char)5);
		System.out.printf("%c%c%c%c%c%c\n"
				, (char)3, (char)6,(char)6,(char)6,(char)6,(char)3);
		/*
		for (int i = 15; i <= 31; i++) {
			System.out.printf("%d\t[%c]\n", i, (char)i);
		}
		System.out.println();
		*/

	}

}
//









//