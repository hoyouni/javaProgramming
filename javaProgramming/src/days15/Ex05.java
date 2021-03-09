package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex05.java
 * @Date 2019. 8. 19. - 오후 12:07:46
 * @Subject p 242 
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		// 변수   int kor;
		// 배열  int [] kors;  + 동일한 자료형
		// 구조체( struct )    int / short/ String/ boolean + 다른 자료형
		// 클래스 :  구조체 + 함수(기능)
		// String [] names , int [] kors......., double [] avgs
		// String [] names , int [][] infos, double [] avgs
		// 3차원 : 3반 30명 성적관리..
		
		// 클래스 배열 선언 
		Student [] students = new Student[30];

		Scanner scanner = new Scanner(System.in);		
		char con ;
		int cnt = 0; 
		
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
			
			students[cnt] = new Student();
			
			students[cnt].name = name;
			students[cnt].kor = kor;
			students[cnt].eng = eng;
			students[cnt].mat = mat;
			students[cnt].tot = tot;
			students[cnt].avg = avg;
			
			cnt++;
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );
		
		// 출력 Ex05.java
		for (int i = 0; i < cnt; i++) {
			students[i].dispInfo();
		}

	} // main
	
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

}  // class


// 클래스 선언 - 한 학생의 성적 저장,관리하는 기능들이 구현된 클래스
class Student{
	// fields
	String name;
	int kor, eng, mat;
	int tot;
	double avg;
	int rank;
	
	// method
	// 한 학생의 정보 출력 메소드 선언 : dispInfo()
	public void dispInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.2f\t%d\n",
				name
				, kor,eng, mat 
				, tot
				, avg
				, rank
				);
	}
}








//