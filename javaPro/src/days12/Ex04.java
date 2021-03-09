package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 13. - 오후 12:12:13
 * @Subject 한 30명   이,국,영,수   총,평,등  출력. 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		//		final int N = 10;  // 상수
		
		String [] names = new String[10];
		int [][] infos = new int[10][5]; // 0열 국어 / 1열 영어 / 2열 수학 / 3열 총점 / 4열 등수
		double [] avgs = new double[10];
		// 
		int cnt = 0; // 입력받은 학생수 
		char con = 'y';
		// 등수 모두 1등 설정
		//Arrays.fill(  infos[4]  ,	 1);  //
		for (int i = 0; i < infos.length; i++) {
			infos[i][4] = 1;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
 

		do {
			System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
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
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		
		// 등수 처리
		for (int i = 0; i < cnt; i++) {  // 등수 처리할 학생 번호
			rank = 1;
			for (int j =  0; j <cnt; j++) {  // 1~모든학생
				// if( infos[i][3] < infos[j][3] && i != j) {
				if( infos[i][3] < infos[j][3] ) {
					rank++;
				}
			}
			infos[i][4] = rank;
		}
		
		
		
		// 출력..
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