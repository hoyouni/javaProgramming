package doItAlgo;

import java.util.Scanner;

// 한 해의 경과 일 수를 계산하는 프로그램
public class Ex02_13 {
	static int[][] mDays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
	};

	// 윤년인지 평년인지 계산하는 메소드 , 평년이면 0 윤년이면 1 리턴
	public static int isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	}

	public static int dayOfYear(int year, int month, int day) {
		int result = day;

		for(int i = 0; i < month - 1; i++) {
			result += mDays[isLeapYear(year)][i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년 월 일을 차례로 입력하시오  ");
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();

		System.out.println("입력하신 해의 경과 일 수는 : " + dayOfYear(year, month, day) + "일 입니다.");

	}
}


















