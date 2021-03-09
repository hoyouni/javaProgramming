package days08;

import java.util.Scanner;

//�⵵�� ���� �Է� �޾Ƽ� �� ���� �޷��� ����ϴ� ����
//1. �ش� �⵵ �� �� �� ������ ��(��¥)
//2. �ش� �⵵�� �� �� ù��° �� (��¥)
public class CalExam {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� ���� �Է��Ͻÿ� : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int lastDay = lastDayOfMonth(year, month); //�ش� �⵵�� �� �� ������ ��¥ ���� ����
		int firstDay = firstDayOfMonth(year, month); //�ش� �⵵�� �� �� ù��° ��¥ ���� ���� 
		makeCalender(lastDay, firstDay);
		
	}
	
	public static void makeCalender(int lastDay, int firstDay) {
		System.out.println("=================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i = 0; i < firstDay; i++) {
			System.out.print("\t");
		} 
		for(int day = 1; day <= lastDay; day++) {
			System.out.printf("%d\t", day);
			if((day + firstDay) % 7 == 0) {
				System.out.println();
			}
		}System.out.println();
		System.out.println("=================");
		
	}

	public static int firstDayOfMonth(int year, int month) {
		int firstSection = 365 * year -1;
		int monthLastDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int secondSection = 0;
		for(int i = 0; i < month -1; i++) {
			secondSection = secondSection + monthLastDay[i];
			if(year % 2 == 0 && year % 100 != 0 || year % 400 == 0 && month >= 3) {
				return secondSection + 1;
			}
		}
		int thirdSection = (firstSection + secondSection) % 7;
		
		return thirdSection;
	}

	public static int lastDayOfMonth(int year, int month) {
		int monthLastDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(year % 2 == 0 && year % 100 != 0 || year % 400 == 0) {
			return monthLastDay[1] + 1;
		}
		
		return monthLastDay[month -1];
	}
}
