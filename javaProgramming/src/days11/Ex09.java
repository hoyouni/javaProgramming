package days11;

public class Ex09 {

	public static void main(String[] args) {
		
		//int [][][] m = new int[4][2][3];
		// 3���� �迭�� �ʱ�ȭ
		int [][][] m = { 
				                   {
				                	   {1,2,3},
				                	   {4,5,6}
				                   },
				                   {
				                	    {7,8,9},
				                	    {10,11,12}
				                   },
				                   {
				                	   {13,14,15},
				                	   {16,17,18}
				                	},
				                   {
				                		{19,20,21},
				                		{22,23,24}
				                	}
				               };
		// 
		for (int i = 0; i < m.length; i++) {                       // �� ����
			System.out.printf("[%d��]\n", i);
			for (int j = 0; j < m[i].length; j++) {               // �� ����
				for (int j2 = 0; j2 < m[i][j].length; j2++) {  // ������
					System.out.printf("[%d]", m[i][j][j2]);
				}
				System.out.println();
			} 
			System.out.println();
		}
		
		/*
		System.out.println( m.length ); // �� ũ��
		
		System.out.println( m[0].length ); // 0�� ��ũ��
		System.out.println( m[1].length ); // 1�� ��ũ��
		System.out.println( m[2].length ); // 2�� ��ũ��
		System.out.println( m[3].length ); // 3�� ��ũ��
		
		System.out.println( m[0][0].length ); // 0��0����   ��ũ��
		System.out.println( m[0][1].length ); // 0��0����   ��ũ��
		System.out.println( m[3][1].length ); // 0��0����   ��ũ��
		*/
		/*
		int [][] m = {
	              {1,2},
	              {3,4},
	              {5,6},
	              {7,8} 
             };
		// 2���� �迭 ��� ( �ϱ� )
		for (int i = 0; i < m.length; i++) {            // �హ��
			for (int j = 0; j < m[i].length; j++) {        // ��(��)����
				System.out.printf("[%d]", m[i][j]);
			}
			System.out.println();
		}
		*/

	}

}
//









//