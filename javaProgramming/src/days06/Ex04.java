package days06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int kor;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		String data = sc.next();
		String regex = "[0-9]{1,2}|100";
		if(data.matches(regex) ) {
			System.out.println("�ùٸ� ��������");
		} else {
			System.out.println("�ùٸ��� ���� ���� ����");
		}
		
	}

}
