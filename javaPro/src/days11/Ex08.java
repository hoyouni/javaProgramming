package days11;

/**
 * @Author k��n��k
 * @Source Ex08.java
 * @Date 2019. 8. 12. - ���� 3:33:10
 * @Subject ������ �迭.... 
 */
public class Ex08 {

	public static void main(String[] args) {
		// 1���� �迭  : ��
		//int [] m = new int[8];
		// �迭ũ��
		// System.out.println(  m.length ); // 8
		// �迭 �ʱ�ȭ
		// int [] m = {1,2,3,4,5,6,7,8};
		
		
		// 2���� �迭 : 4��, 2��
		// int [][] m = new int[4][2];
		// 2���� �迭�� �ʱ�ȭ.
		int [][] m = {
				              {1,2},
				              {3,4},
				              {5,6},
				              {7,8} 
		                   };
		// 2���� �迭�� �迭 ũ��
		// ��ũ�� :  �迭��.length
		System.out.println( m.length * m[0].length );  // �迭�� ũ��.
		System.out.println( m.length );   //  ��ũ��
		// ��ũ��
		System.out.println( m[0].length  );// 0����  ��ũ��
		System.out.println( m[1].length  );// 1����  ��ũ��
		System.out.println( m[2].length  );// 2����  ��ũ��
		System.out.println( m[3].length  );// 3����  ��ũ��
		
		// 3���� �迭 : �� �� ��
		//int [][][] m = new int[2][2][2];
		

	}

}
//









//