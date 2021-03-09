package days11;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author k≡n¡k
 * @Source Ex02.java
 * @Date 2019. 8. 12. - 오전 10:28:12
 * @Subject  배열의 단점 파악 - > 컬렉션(Collection) 사용
 *                  1) 배열 크기
 *                  2) insert, delete, + 증가, 요소값을 ~ 처리...
 */
public class Ex02_02 {
	
 	static int [] m = {10,30,30,20} ;//new int[3];
	static int idx = 4;  // 채워넣기 위한 배열의 index(위치)
	static Scanner scanner = new Scanner(System.in);
	static char con;
	static int selectNumber ;
	
	public static void main(String[] args) throws IOException {		 
	
		while(true) {
			dispMenu();		
			selectMenu();		
			processMenu();
		}

	}


	private static void processMenu() throws IOException {
		
		switch (selectNumber) {
		case 1: add();		break;
		case 2: update();	break;
		case 3: insert(); break;
		case 4: delete();	break;
		case 5:	disp();		break;
		case 6: exit();  		break;
		default:
			break;
		} 
		
	}

	private static void insert() { 
		// 1. 몇번째 인덱스에 어떤값을 insert 할건지 입력
		//               1           50
		System.out.print("> Insert할  위치와 값 입력 ? "); // 2
		int insertIndex = scanner.nextInt();
		int insertValue = scanner.nextInt();
		// 2. 배열의 크기를 증가 
		if( idx == m.length )  arraySizeIncrease();
		
		// 3. 코딩.
		for (int i = idx-1; i >= insertIndex; i--) {
			m[i+1] = m[i];
		}
		m[insertIndex] = insertValue;
		idx++;
	}

	//                                4
	// [1][50][2][4][2][5][100][0][0]
	//       1       3
	private static void update() throws IOException {
		do {
			System.out.print("> 수정할 값 검색 ? "); // 2
			//                                                     3
			// 수정할 값 : 100
			// 수정완료...
			int usValue = scanner.nextInt();
			// 검색    indexOf()  , lastIndexOf()
			int fromIndex = 0, sIndex = -1 ;
			while( ( sIndex = indexOf(usValue, fromIndex) ) != -1) { // && 조건추가   fi<idx
				System.out.printf("%d / ", sIndex);
				fromIndex = sIndex + 1;
			}
			System.out.println();
			System.out.print("> 검색 결과 중 수정할 인덱스, 수정값 입력 ? "); // 1 100
			int u_index = scanner.nextInt();
			int u_value = scanner.nextInt();
			m[u_index]=u_value;
			
			System.out.print("> 계속 수정할거냐? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (  Character.toUpperCase(con) =='Y' );
		
		
	}
	
	public static int indexOf(int usValue, int fromIndex) {
		// This method must return a result of type int
		for (int i = fromIndex; i < idx; i++) {
			if( usValue == m[i]) return i;
		}
		return -1;
	}

	private static void delete() {
		// 삭제할 인덱스 입력 ? 2
		// 삭제할 값 ?
		int d_idx ;
		System.out.print("> 삭제할 인덱스 입력 ? ");
		d_idx = scanner.nextInt();
		 
		for (int i = d_idx+1; i < idx; i++) {
			m[i-1] = m[i];
		}
		m[idx-1] = 0;
		idx--; 
	}

	private static void add() throws IOException {
		//  배열크기 3 : 0,1,2
		//  단점 : 배열크기를 설정하면 변경 X
		do {
			/*
			if( idx == 3) {
		    	System.out.println(" 방이 다 찼다... 더 이상 추가 X");
		    	pause(); // 일시 정지
		    	return;
		    }
		    */
			
			// 배열크기를 증가..
			if( idx == m.length )  arraySizeIncrease();
			
			System.out.printf("%d 요소에 추가할 값 입력 ? ", idx);
		    int num = scanner.nextInt();
		    
		    m[idx++] = num;	
		    System.out.print("> 계속 입력할거냐? ");  // 'y', 'Y'
		    con = (char) System.in.read();
		    System.in.skip(System.in.available());
		} while ( con == 'y' || con == 'Y' );
		
	}

	private static void arraySizeIncrease() {
		 int [] temp = new int[m.length + 3];
		 for (int i = 0; i < m.length; i++) {
			temp[i] = m[i];
		 }		 
		 m = temp;
	}

	private static void disp( ) throws IOException {
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

	private static void selectMenu() {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("> 메뉴를 선택하세요 ? ");
		selectNumber = scanner.nextInt(); 
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