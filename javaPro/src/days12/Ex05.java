package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex05.java
 * @Date 2019. 8. 13. - 오후 2:11:28
 * @Subject  
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		// 한 반에 30명 학생 * 3반
		// 3반 학생의 이름, 국,영,수,총,평,등,전등 처리할 ....
		//String [] names = new String[3*30];
		
		// 행 : 반
		// 열 : 번 학생
		String [][] names = new String[3][30]; 
		double [][] avgs = new double[3][30];
		int [][][] infos = new int[3][30][6];
		
		// int cnt1 = 0, cnt2=0,   cnt3=0; // 입력받은 학생수
		//      cnts[0]    cnts[1]   cnts[2]
		int [] cnts = new int[3];
		char con = 'y';
		// 모든 학생들 반등수=1, 전체등수=1 설정..
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
			System.out.print("> 학생 반 입력하세요 ? ");
			classNum = scanner.nextInt();  // 2
			System.out.printf("%d반 %d번 이름,국,영,수 입력하세요? "
					, classNum, cnts[classNum-1]+1);
			name  = getName() ; //scanner.next();
			kor = getJumsu(); // scanner.nextInt();
			eng = getJumsu(); // scanner.nextInt();
			mat = getJumsu(); // scanner.nextInt();			
			tot = kor + eng + mat;
			avg = (double)tot /  3;
			// 각각의 배열 넣기.
			names[classNum-1][cnts[classNum-1]] = name;
			infos[classNum-1][cnts[classNum-1]][0] = kor;
			infos[classNum-1][cnts[classNum-1]][1] = eng;
			infos[classNum-1][cnts[classNum-1]][2] = mat;
			infos[classNum-1][cnts[classNum-1]][3] = tot;
			avgs[classNum-1][cnts[classNum-1]] = avg;
			
			cnts[classNum-1]++; // 학생수 증가...
			
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		//  등수 처리( 반 , 전체 등수 )
		for (int i = 0; i < cnts.length; i++) {   // 3반
			for (int j = 0; j < cnts[i]; j++) {
				rank = 1; 
				wrank=1;
				//
				for (int i2 = 0; i2 < cnts.length; i2++) {   // 3반
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
			System.out.printf("[%d반 학생수 : %d명]\n", i+1, cnts[i] );
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