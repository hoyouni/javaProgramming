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
public class Ex05_02 {

	public static void main(String[] args) throws IOException {		
		// 클래스 배열 선언 
		Student [] students = new Student[30];

		Scanner scanner = new Scanner(System.in);		
		char con ;
		int cnt = 0;
		
		Student s = null;	
				
		do {
			
			s = new Student();
			
			//Student s = new Student();
			
			System.out.print("> 이름, 국어, 영어, 수학 입력 ? ");
				s.name  = getName() ; //scanner.next();
				s.kor = getJumsu(); // scanner.nextInt();
				s.eng = getJumsu(); // scanner.nextInt();
				s.mat = getJumsu(); // scanner.nextInt();
				
				s.tot = s.kor + s.eng + s.mat;
				s.avg = (double)s.tot /  3;
			
			// 클래스 복사 
			students[cnt] = s;
			
			cnt++;
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con)  == 'Y' );

		// 출력 Ex05_02.java
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

//The type Student is already defined
// 클래스 선언 - 한 학생의 성적 저장,관리하는 기능들이 구현된 클래스








//