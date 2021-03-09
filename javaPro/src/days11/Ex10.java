package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex10.java
 * @Date 2019. 8. 12. - ���� 4:23:07
 * @Subject �迭 ����
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		// 1���� �迭...     -> 2��,3â �迭
		// �� 30���� �л��� 
		// �̸�, ����, ����, ����, ����, ���, ��� 
		// 1. �л� ������ �Է�...1�� ��,��,��,��     ��/��   
		//                           2�� ��,��,��,��
		//                           3�� ��,��,��,��
		//                            :
		// 2. ��� ó��.
		// 3. �л� ���� ���..
		String [] names = new String[30];
		int [] kors = new int[30];
		int [] engs = new int[30];
		int [] mats = new int[30];
		int [] tots = new int[30];
		double [] avgs = new double[30];
		int [] ranks = new int[30];
		Arrays.fill(ranks,	 1);  // 
		
		Scanner scanner = new Scanner(System.in);
		
		char con ;
		int cnt = 0; // �Է¹��� �л��� ī����... ����
		
		
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
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			
			cnt++;
			System.out.print("> �л� �Է� ��� ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		
		//System.out.println(cnt);
		
		// �Է¹��� ��� �л� ���
		// 1	ȫ�浿	90	89 90 269 89.99 1
		// 2	ȫ�浿	90	89 90 269 89.99 1
		// 3	ȫ�浿	90	89 90 269 89.99 1 
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < cnt; j++) {
				if(tots[i] < tots[j]) {
					ranks[i] += 1;
				}
			
			}
		}
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%d : %s, ���� : %d, ���� : %d, ���� : %d, ���� : %d, ��� : %.2f, ��� : %d\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
	

	}
	
	private static String getName() {
		char [] names = new char[5];
		// 65~90
		// 0~ 25     +65
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