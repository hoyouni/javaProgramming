package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex04.java
 * @Date 2019. 8. 13. - ���� 12:12:13
 * @Subject �� 30��   ��,��,��,��   ��,��,��  ���. 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		//		final int N = 10;  // ���
		
		String [] names = new String[10];
		int [][] infos = new int[10][5]; // 0�� ���� / 1�� ���� / 2�� ���� / 3�� ���� / 4�� ���
		double [] avgs = new double[10];
		// 
		int cnt = 0; // �Է¹��� �л��� 
		char con = 'y';
		// ��� ��� 1�� ����
		//Arrays.fill(  infos[4]  ,	 1);  //
		for (int i = 0; i < infos.length; i++) {
			infos[i][4] = 1;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
 

		do {
			System.out.print("> �̸�, ����, ����, ���� �Է� ? ");
			name  = getName() ; //scanner.next();
			kor = getJumsu(); // scanner.nextInt();
			eng = getJumsu(); // scanner.nextInt();
			mat = getJumsu(); // scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot /  3;
			
			names[cnt] = name;
			infos[cnt][0] = kor;
			infos[cnt][1] = eng;
			infos[cnt][2] = mat;
			infos[cnt][3] = tot;
			avgs[cnt] = avg;
			
			cnt++;
			System.out.print("> �л� �Է� ��� ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		
		// ��� ó��
		for (int i = 0; i < cnt; i++) {  // ��� ó���� �л� ��ȣ
			rank = 1;
			for (int j =  0; j <cnt; j++) {  // 1~����л�
				// if( infos[i][3] < infos[j][3] && i != j) {
				if( infos[i][3] < infos[j][3] ) {
					rank++;
				}
			}
			infos[i][4] = rank;
		}
		
		
		
		// ���..
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.2f\t%d\n",
					names[i], infos[i][0], infos[i][1], infos[i][2], infos[i][3], avgs[i],  infos[i][4]
					);
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