package doItAlgo;

import java.util.Scanner;

public class Prac02_11 {
	static int[][] mDays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
	};

	int year;
	int month;
	int day;

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

	public Prac02_11(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// n 일 뒤의 날짜를 반환
	public Prac02_11 after(int n) {
		int maxDay = mDays[isLeapYear(year)][month - 1];

		day = day + n;

		if(day > maxDay) {
			int cnt = 0;
			while(day > maxDay) {
				day = day - maxDay;
				cnt = cnt + 1;
			}
			month = month + cnt;
			if(month > 12) {
				year = year + 1;
				month = month - 12;
			}
		}

		Prac02_11 p1 = new Prac02_11(this.year, this.month, this.day);

		return p1;
	}

	// n 일 앞의 날짜를 반환 
	public Prac02_11 before(int n) {
		
		return null;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();

		Prac02_11 p = new Prac02_11(year, month, day);

		System.out.print("며칠 앞/뒤의 날짜를 구할까요? :");
		int n = sc.nextInt();

		Prac02_11 d1 = p.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.year, d1.month, d1.day);

		//Prac02_11 d2 = p.before(n);
		//System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.year, d2.month, d2.day);

	}
}


















