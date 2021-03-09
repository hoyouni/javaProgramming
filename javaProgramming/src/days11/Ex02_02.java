package days11;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex02.java
 * @Date 2019. 8. 12. - ���� 10:28:12
 * @Subject  �迭�� ���� �ľ� - > �÷���(Collection) ���
 *                  1) �迭 ũ��
 *                  2) insert, delete, + ����, ��Ұ��� ~ ó��...
 */
public class Ex02_02 {
	
 	static int [] m = {10,30,30,20} ;//new int[3];
	static int idx = 4;  // ä���ֱ� ���� �迭�� index(��ġ)
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
		// 1. ���° �ε����� ����� insert �Ұ��� �Է�
		//               1           50
		System.out.print("> Insert��  ��ġ�� �� �Է� ? "); // 2
		int insertIndex = scanner.nextInt();
		int insertValue = scanner.nextInt();
		// 2. �迭�� ũ�⸦ ���� 
		if( idx == m.length )  arraySizeIncrease();
		
		// 3. �ڵ�.
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
			System.out.print("> ������ �� �˻� ? "); // 2
			//                                                     3
			// ������ �� : 100
			// �����Ϸ�...
			int usValue = scanner.nextInt();
			// �˻�    indexOf()  , lastIndexOf()
			int fromIndex = 0, sIndex = -1 ;
			while( ( sIndex = indexOf(usValue, fromIndex) ) != -1) { // && �����߰�   fi<idx
				System.out.printf("%d / ", sIndex);
				fromIndex = sIndex + 1;
			}
			System.out.println();
			System.out.print("> �˻� ��� �� ������ �ε���, ������ �Է� ? "); // 1 100
			int u_index = scanner.nextInt();
			int u_value = scanner.nextInt();
			m[u_index]=u_value;
			
			System.out.print("> ��� �����Ұų�? ");
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
		// ������ �ε��� �Է� ? 2
		// ������ �� ?
		int d_idx ;
		System.out.print("> ������ �ε��� �Է� ? ");
		d_idx = scanner.nextInt();
		 
		for (int i = d_idx+1; i < idx; i++) {
			m[i-1] = m[i];
		}
		m[idx-1] = 0;
		idx--; 
	}

	private static void add() throws IOException {
		//  �迭ũ�� 3 : 0,1,2
		//  ���� : �迭ũ�⸦ �����ϸ� ���� X
		do {
			/*
			if( idx == 3) {
		    	System.out.println(" ���� �� á��... �� �̻� �߰� X");
		    	pause(); // �Ͻ� ����
		    	return;
		    }
		    */
			
			// �迭ũ�⸦ ����..
			if( idx == m.length )  arraySizeIncrease();
			
			System.out.printf("%d ��ҿ� �߰��� �� �Է� ? ", idx);
		    int num = scanner.nextInt();
		    
		    m[idx++] = num;	
		    System.out.print("> ��� �Է��Ұų�? ");  // 'y', 'Y'
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
		System.out.println(">�迭 ���<\n");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\t", i, m[i]);
		}
		System.out.println();
		pause();
	}

	private static void pause() throws IOException {
		System.out.print(">n����Ϸ��� ����ġ����.");
		System.in.read();
		System.in.skip(System.in.available());
	}

	private static void exit() {
		clearScreen();
		System.out.println("\n\n���α׷� ����!!!");
		System.exit(-1);
	}

	private static void clearScreen() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println();
		}
	}

	private static void selectMenu() {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("> �޴��� �����ϼ��� ? ");
		selectNumber = scanner.nextInt(); 
	}

	private static void dispMenu() {
		clearScreen();
		String [] menus = {"�߰�(add)","����(update)", "����(insert)"
				, "����(delete)","���(print)", "����(exit)" };
		System.out.println("> �޴� ���� <");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\n", i+1, menus[i]);
		}
		/*
		System.out.printf("%s\n", "�߰�(add)");
		System.out.printf("%s\n", "����(update)");
		System.out.printf("%s\n", "����(insert)");
		System.out.printf("%s\n", "����(delete)");
		System.out.printf("%s\n", "���(print)");
		*/		
	}

}
//

//�迭
		/* 1. �⺻�� - 8����     stack ����
		 *     ������ - �迭, Ŭ����(String), �������̽�
		 *                ���� ������ : new �����ڿ� ���ؼ� Heap(����)������ �Ҵ�.
		 *                stack �������� �ּ� ����
		 * 2. [������ �ڷ���]                        �޸𸮻� [������]���� ���̰� �� ��.
		 *    int kor ;      
		 * 3.   
		 * int m [] = new int[5];
		m[0] = 10;		
		m = null;          
		 * */ 







//