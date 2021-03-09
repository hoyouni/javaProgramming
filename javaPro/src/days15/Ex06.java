package days15;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) throws IOException {

		StudentManager sm = new StudentManager();

		sm.insert(); // 학생 입력
		sm.makeRank(); // 등수 처리
		sm.output();// 학생 출력
		System.out.println("-------------------------------");
		sm.search();

	}
	
}

// 학생 관리 기능을 멤버로 가지는 클래스
class StudentManager{
	// fields
	Student [] students = new Student[30];
	int cnt = 0;

	// methods
	public void insert() throws IOException {
		char con ;
		
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
	}
	public void output() {
		for (int i = 0; i < cnt; i++) {
			students[i].dispInfo();
		}
	}	
	public void update() {

	}
	public void delete() {

	}
	public void search() {
		// 이름 검색
		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("> 검색할 학생명 입력 ? ");
		String searchName = scanner.next();
		
		for (int i = 0; i < cnt; i++) {
			// if( searchName == students[i].name) {
			// 문자열 비교 : equals() , equalsIgnoreCase()
			
			// indexOf()   lastIndexOf()
			// if( searchName.equals( students[i].name ) ) {
			if( students[i].name.indexOf( searchName ) != -1 ) {
				students[i].name =
						students[i].name.replaceAll(searchName, "["+searchName+"]");
				students[i].dispInfo();
			}
		}
	}
	public void makeRank() {
		for (int i = 0; i < cnt; i++) {
			students[i].rank = 1; 
			for (int j = 0; j < cnt; j++) {
				if( students[i].tot < students[j].tot ) students[i].rank++;
			}
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
// Student 학생클래스 : 한 학생의 정보( 이,국,영,수,총,평,등 ) 필드+ 메소드 구현된 클래스
// Student 관리클래스 : 입력/검색/수정/삭제/등수/출력....
//  [ StudentManager ]









//