package days11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 12. - 오전 7:47:14
 * @Subject 과목명 			: 개발환경 설정 및 JAVA 기초
 *                 능력단위       	: 프로그래밍 언어활용
 *                 능력단위요소 	: 기본 문법 활용하기
 *                 
 *                 제어문 + 배열 + 알고리즘
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money ;
		System.out.print("> 금액 입력 하세요? ");
		money = scanner.nextInt();
		int n , unit ;  // 장수
		// 50000
		// unit / 5  10000
		// unit /2   5000
		// unit / 5  1000
		// unit /2   500
		// unit / 5  100
		
		unit = 50000;
		boolean sw = true;
		while( unit >= 1) {
			n = money / unit;
			System.out.printf("%d원 = %d장\n", unit, n);		
			money %= unit;
			unit = sw? unit / 5 :unit /2;
			sw = !sw;
		}
		
		/*
		int [] units = {50000, 10000,5000,1000,500,100,50,10,5,1};
		
		for (int i = 0; i < units.length; i++) {
			unit = units[i];	
			n = money / unit;
			System.out.printf("%d원 = %d장\n", unit, n);
			money %= unit;
		}
		*/
		  
		
		/*
		unit = 50000;
		n = money / unit;
		System.out.printf("%d원 = %d장\n", unit, n);		
		money %= unit;
		
		unit = 10000;		
		n = money / unit;
		System.out.printf("%d원 = %d장\n", unit, n);
		money %= unit;
		
		unit = 5000;	
		n = money / unit;
		System.out.printf("%d원 = %d장\n", unit, n);
		money %= unit;
		
		unit = 1000;	
		n = money / unit;
		System.out.printf("%d원 = %d장\n", unit, n);
		money %= unit;
		
		unit = 500;	
		n = money / unit;
		System.out.printf("%d원 = %d장\n", unit, n);
		money %= unit;
		*/
		
		
		
		 
		 
		

	}

}
// 
// 지각 예정자 : 김호연(늦잠 10:45), 김예주( ) 







/*
// 4-1. 10진수 정수를 입력받아서 16진수로 출력하기.
		// 10진수 : 0,1,2,3,4,5,6,7,8,9
		// 16진수 :  0,1,2,3,4,5,6,7,8,9,A(10),B,C,D,E,F(15)
		
		int n = 31;		
		// 0x001F
		// [][][][F]
		char [] m = new char[4];  // ['_'][][]
		//Arrays.fill(m, ' ');
		
		int share, rest ;
		int idx = m.length - 1 ;
		String x = "0123456789ABCDEF";
		while( n != 0 ) {
			rest =  n % 16;  // 0~15  정수
			m[idx--] = x.charAt(rest);
			share = n / 16;
			n = share;
		}
	
		for (char c : m) {
			System.out.print(c);
		}
*/
//
/*
int n = 3;
for (int i = 1; i <=n ; i++) {
	for (int j = 1; j <=2*n-1 ; j++) {
		if ( i+j>=n+1 && j-i<=n-1) {
			System.out.print("*");
		}else {
			System.out.print("_");
		}
	}
	System.out.println();
}
*/

/*
char [] m = new char[4];
Arrays.fill(m, '0');
String x = "ABCDEF";

int n = 31;

int idx = m.length-1;
do {
	int share = n / 16;
	int rest =  n % 16;
	if( rest >= 10 )   m[idx]= x.charAt(  rest%10 );
	else m[idx]= (char) (rest+48);
	idx--;		
	n = share;
}while( n != 0 );

for (char c : m) {
	System.out.print(c);
}
*/