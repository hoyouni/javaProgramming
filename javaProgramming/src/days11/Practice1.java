package days11;

import java.io.IOException;
import java.util.Scanner;

public class Practice1 {
	static int[] m = {10, 20, 30, 40};
	static int index = 4;
	static Scanner sc = new Scanner(System.in);
	static char continueValue;
	static int selectNumber;
	
	public static void main(String[] args) throws IOException {
			while(true) {
			displayMenu();
			selectMenu();
			processMenu();
			}
	}

	public static void processMenu() throws IOException {
		switch (selectNumber) {
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			insert();
			break;
		case 4:
			delete();
			break;
		case 5:
			disp();
			break;
		case 6:
			exit();
			break;

		default:
			break;
		}
		
	}

	public static void delete() {
		System.out.print("������ �ε��� �Է� : ");
		int deleteIndex = sc.nextInt();
		for(int i = deleteIndex + 1; i < index; i++) {
			m[i - 1] = m[i];
		}
		m[index-1]  = 0;
		index--;
		
	}

	public static void insert() {
		System.out.print("������ �ε����� �� �Է� : ");
		int insertIndex = sc.nextInt();
		int insertValue = sc.nextInt();
		
		if(index == m.length) {
			arraySizeIncrease();
		}
		
		for(int i = index - 1; i >= insertIndex; i--) {
			m[i+1] = m[i];
		}
		m[insertIndex] = insertValue;
		index++;
		
	}

	public static void update() throws IOException {
		do {
		System.out.print("������ �� �Է� : ");
		int updateSearchValue = sc.nextInt();
		int fromIndex = 0, searchIndex = -1;
		while((searchIndex = indexOf(updateSearchValue, fromIndex)) != -1) {
			System.out.printf("%d / ", searchIndex);
			fromIndex = searchIndex + 1;
		}
		System.out.print("�˻� ��� �� ������ �ε����� �� �Է� : ");
		int updateIndex = sc.nextInt();
		int updateValue = sc.nextInt();
		
		m[updateIndex] = updateValue;
		
		System.out.print("��� �Ͻðڽ��ϱ�?");
		continueValue = (char)System.in.read();
		System.in.skip(System.in.available());
		} while(Character.toUpperCase(continueValue) == 'Y');
	}

	public static int indexOf(int updateSearchValue, int fromIndex) {
		for(int i = fromIndex; i < index; i++) {
			if(updateSearchValue == m[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void add() throws IOException {
		do {
			if(index == m.length) {
				arraySizeIncrease();
			}
			System.out.printf("%d ��ҿ� �߰��� �� �Է� : ", index);
			int num = sc.nextInt();
			m[index++] = num;
			System.out.print("��� �Է��Ͻðڽ��ϱ�? ");
			continueValue = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(continueValue) == 'Y');
		
	}

	public static void arraySizeIncrease() {
		int[] temp = new int[m.length + 3];
		
		for(int i = 0; i < m.length; i++) {
			temp[i] = m[i];
		}
		m = temp;
		
	}

	public static void disp() throws IOException {
		clearScreen();
		System.out.println("�迭 ��� ");
		for(int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] : %d\t", i, m[i]);
			
		} System.out.println();
		pause();
		
	}

	public static void pause() throws IOException {
		System.out.print("��� �Ͻ÷��� ���͸� �����ÿ�.");
		System.in.read();
		System.in.skip(System.in.available());
		
	}

	public static void exit() {
		clearScreen();
		System.out.println("���α׷� ����!!");
		System.exit(-1);
		
	}

	public static void clearScreen() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
		
	}

	public static void selectMenu() {
		System.out.print("�޴��� �����Ͻÿ� : ");
		selectNumber = sc.nextInt();
		
	}

	public static void displayMenu() {
		String[] menu = {"�߰�", "����", "����", "����", "���", "����"};
		for(int i = 0; i < menu.length; i++) {
			System.out.printf("%d . %s\n", i+1, menu[i]);
		}
		
	}
}
