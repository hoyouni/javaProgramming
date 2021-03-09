package days11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex01.java
 * @Date 2019. 8. 12. - ���� 7:47:14
 * @Subject ����� 			: ����ȯ�� ���� �� JAVA ����
 *                 �ɷ´���       	: ���α׷��� ���Ȱ��
 *                 �ɷ´������ 	: �⺻ ���� Ȱ���ϱ�
 *                 
 *                 ��� + �迭 + �˰���
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money ;
		System.out.print("> �ݾ� �Է� �ϼ���? ");
		money = scanner.nextInt();
		int n , unit ;  // ���
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
			System.out.printf("%d�� = %d��\n", unit, n);		
			money %= unit;
			unit = sw? unit / 5 :unit /2;
			sw = !sw;
		}
		
		/*
		int [] units = {50000, 10000,5000,1000,500,100,50,10,5,1};
		
		for (int i = 0; i < units.length; i++) {
			unit = units[i];	
			n = money / unit;
			System.out.printf("%d�� = %d��\n", unit, n);
			money %= unit;
		}
		*/
		  
		
		/*
		unit = 50000;
		n = money / unit;
		System.out.printf("%d�� = %d��\n", unit, n);		
		money %= unit;
		
		unit = 10000;		
		n = money / unit;
		System.out.printf("%d�� = %d��\n", unit, n);
		money %= unit;
		
		unit = 5000;	
		n = money / unit;
		System.out.printf("%d�� = %d��\n", unit, n);
		money %= unit;
		
		unit = 1000;	
		n = money / unit;
		System.out.printf("%d�� = %d��\n", unit, n);
		money %= unit;
		
		unit = 500;	
		n = money / unit;
		System.out.printf("%d�� = %d��\n", unit, n);
		money %= unit;
		*/
		
		
		
		 
		 
		

	}

}
// 
// ���� ������ : ��ȣ��(���� 10:45), �迹��( ) 







/*
// 4-1. 10���� ������ �Է¹޾Ƽ� 16������ ����ϱ�.
		// 10���� : 0,1,2,3,4,5,6,7,8,9
		// 16���� :  0,1,2,3,4,5,6,7,8,9,A(10),B,C,D,E,F(15)
		
		int n = 31;		
		// 0x001F
		// [][][][F]
		char [] m = new char[4];  // ['_'][][]
		//Arrays.fill(m, ' ');
		
		int share, rest ;
		int idx = m.length - 1 ;
		String x = "0123456789ABCDEF";
		while( n != 0 ) {
			rest =  n % 16;  // 0~15  ����
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