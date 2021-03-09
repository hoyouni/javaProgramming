package days11;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Author k��n��k
 * @Source Ex02.java
 * @Date 2019. 8. 12. - ���� 10:28:12
 * @Subject  �迭�� ���� �ľ� - > Collection ���
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
			System.out.println("����");			
			break;
		case 3:
			System.out.println("����");			
			break;
		case 4:
			System.out.println("����");			
			break;
		case 5:	disp(m);	break;
		case 6: exit();  break;
		default:
			break;
		} 
		
	}

	private static void add(int[] m) throws IOException {
		char con;
		int idx = 0;// ä���ֱ� ���� �迭�� index(��ġ)
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("%d ��ҿ� �߰��� �� �Է� ? ", idx);
		    int num = scanner.nextInt();
		    m[idx++] = num;	
		    System.out.print("> ��� �Է��Ұų�? ");  // 'y', 'Y'
		    con = (char) System.in.read();
		    System.in.skip(System.in.available());
		} while ( con == 'y' || con == 'Y' );
		
	}

	private static void disp( int[] m ) throws IOException {
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

	private static int selectMenu() {
		Scanner scanner  = new Scanner(System.in);
		System.out.print("> �޴��� �����ϼ��� ? ");
		int n = scanner.nextInt();
		return n;
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