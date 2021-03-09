package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex05.java
 * @Date 2019. 8. 13. - ���� 2:11:28
 * @Subject  
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		// �� �ݿ� 30�� �л� * 3��
		// 3�� �л��� �̸�, ��,��,��,��,��,��,���� ó���� ....
		//String [] names = new String[3*30];
		
		// �� : ��
		// �� : �� �л�
		String [][] names = new String[3][30]; 
		double [][] avgs = new double[3][30];
		int [][][] infos = new int[3][30][6];
		
		// int cnt1 = 0, cnt2=0,   cnt3=0; // �Է¹��� �л���
		//      cnts[0]    cnts[1]   cnts[2]
		int [] cnts = new int[3];
		char con = 'y';
		// ��� �л��� �ݵ��=1, ��ü���=1 ����..
		for (int i = 0; i < infos.length; i++) {
			for (int j = 0; j < infos[i].length; j++) {
				infos[i][j][5] = infos[i][j][4] = 1;
			}			
		}
		Scanner scanner = new Scanner(System.in);
		int classNum;
		
		String name;
		int kor, eng, mat, tot, rank , wrank;
		double avg;
		
		do {
			System.out.print("> �л� �� �Է��ϼ��� ? ");
			classNum = scanner.nextInt();  // 2
			System.out.printf("%d�� %d�� �̸�,��,��,�� �Է��ϼ���? "
					, classNum, cnts[classNum-1]+1);
			name  = getName() ; //scanner.next();
			kor = getJumsu(); // scanner.nextInt();
			eng = getJumsu(); // scanner.nextInt();
			mat = getJumsu(); // scanner.nextInt();			
			tot = kor + eng + mat;
			avg = (double)tot /  3;
			// ������ �迭 �ֱ�.
			names[classNum-1][cnts[classNum-1]] = name;
			infos[classNum-1][cnts[classNum-1]][0] = kor;
			infos[classNum-1][cnts[classNum-1]][1] = eng;
			infos[classNum-1][cnts[classNum-1]][2] = mat;
			infos[classNum-1][cnts[classNum-1]][3] = tot;
			avgs[classNum-1][cnts[classNum-1]] = avg;
			
			cnts[classNum-1]++; // �л��� ����...
			
			System.out.print("> �л� �Է� ��� ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		//  ��� ó��( �� , ��ü ��� )
		for (int i = 0; i < cnts.length; i++) {   // 3��
			for (int j = 0; j < cnts[i]; j++) {
				rank = 1; 
				wrank=1;
				//
				for (int i2 = 0; i2 < cnts.length; i2++) {   // 3��
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if( infos[i][j][3] < infos[i2][j2][3] ) {
							if( i == i2 )							
								rank++;
							wrank++;
						}						
					}
				} // 
				infos[i][j][4] = rank;
				infos[i][j][5] = wrank; 
			}
		}
		
		//
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d�� �л��� : %d��]\n", i+1, cnts[i] );
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.2f\t%d\t%d\n",
						names[i][j]
					  , infos[i][j][0], infos[i][j][1], infos[i][j][2]
					  , infos[i][j][3], avgs[i][j]
					  ,  infos[i][j][4]
					   ,  infos[i][j][5]
						);
			}
		}
		
		

	} // main
	
	private static String getName() {
		char [] names = new char[5]; 
		for (int i = 0; i < names.length; i++) {
			int n =  (int)(Math.random()*26)+65;
			names[i] = (char)n;
		} 
		return new String(names);
	}

	public static int getJumsu() {
		Random rnd = new Random();
		int jumsu = rnd.nextInt(101);
		return jumsu;
	}
	

}
//









//