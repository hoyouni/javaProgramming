package days11;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 12. - 오전 10:28:12
 * @Subject  배열의 단점 파악 - > Collection 사용
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {		 
		int [] m = new int[3];
		
		while(true) {
			dispMenu();		
			int n = selectMenu();		
			processMenu(n, m);
		}

	}

	private static void processMenu(int n, int[] m) throws IOException {
		switch (n) {
		case 1: add(m);break;
		case 2:
			System.out.println("수정");			
			break;
		case 3:
			System.out.println("삽입");			
			break;
		case 4:
			System.out.println("삭제");			
			break;
		case 5:	disp(m);	break;
		case 6: exit();  break;
		default:
			break;
		} 
		
	}

	private static void add(int[] m) throws IOException {
		char con;
		int idx = 0;// 채워넣기 위한 배열의 index(위치)
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("%d 요소에 추가할 값 입력 ? ", idx);
		    int num = scanner.nextInt();
		    m[idx++] = num;	
		    System.out.print("> 계속 입력할거냐? ");  // 'y', 'Y'
		    con = (char) System.in.read();
		    System.in.skip(System.in.available());
		} while ( con == 'y' || con == 'Y' );
		
	}

	private static void disp( int[] m ) throws IOException {
		clearScreen();
		System.out.println(">배열 출력<\n");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\t", i, m[i]);
		}
		System.out.println();
		pause();
	}

	private static void pause() throws IOException {
		System.out.print(">n계속하려면 엔터치세요.");
		System.in.read();
		System.in.skip(System.in.available());
	}

	private static void exit() {
		clearScreen();
		System.out.println("\n\n프로그램 종료!!!");
		System.exit(-1);
	}

	private static void clearScreen() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println();
		}
	}

	private static int selectMenu() {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("> 메뉴를 선택하세요 ? ");
		int n = scanner.nextInt();
		return n;
	}

	private static void dispMenu() {
		clearScreen();
		String [] menus = {"추가(add)","수정(update)", "삽입(insert)"
				, "삭제(delete)","출력(print)", "종료(exit)" };
		System.out.println("> 메뉴 선택 <");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\n", i+1, menus[i]);
		}
		/*
		System.out.printf("%s\n", "추가(add)");
		System.out.printf("%s\n", "수정(update)");
		System.out.printf("%s\n", "삽입(insert)");
		System.out.printf("%s\n", "삭제(delete)");
		System.out.printf("%s\n", "출력(print)");
		*/		
	}

}
//

//배열
		/* 1. 기본형 - 8가지     stack 영역
		 *     참조형 - 배열, 클래스(String), 인터페이스
		 *                실제 기억공간 : new 연산자에 의해서 Heap(동적)영역에 할당.
		 *                stack 영역에서 주소 참조
		 * 2. [동일한 자료형]                        메모리상에 [연속적]으로 놓이게 한 것.
		 *    int kor ;      
		 * 3.   
		 * int m [] = new int[5];
		m[0] = 10;		
		m = null;          
		 * */ 







//