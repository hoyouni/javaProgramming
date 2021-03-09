package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex10.java
 * @Date 2019. 8. 12. - 오후 4:23:07
 * @Subject 배열 예제
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		// 1차원 배열...     -> 2차,3창 배열
		// 한 30명인 학생의 
		// 이름, 국어, 영어, 수학, 총점, 평균, 등수 
		// 1. 학생 정보를 입력...1번 이,국,영,수     총/평   
		//                           2번 이,국,영,수
		//                           3번 이,국,영,수
		//                            :
		// 2. 등수 처리.
		// 3. 학생 정보 출력..
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
		int cnt = 0; // 입력받은 학생수 카운팅... 변수
		
		
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
			kors[cnt] = kor;
			engs[cnt] = eng;
			mats[cnt] = mat;
			tots[cnt] = tot;
			avgs[cnt] = avg;
			
			cnt++;
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		
		//System.out.println(cnt);
		
		// 입력받은 모든 학생 출력
		// 1	홍길동	90	89 90 269 89.99 1
		// 2	홍길동	90	89 90 269 89.99 1
		// 3	홍길동	90	89 90 269 89.99 1 
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < cnt; j++) {
				if(tots[i] < tots[j]) {
					ranks[i] += 1;
				}
			
			}
		}
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%d : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f, 등수 : %d\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
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