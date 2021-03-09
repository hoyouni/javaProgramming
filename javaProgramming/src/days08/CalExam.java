package days08;

import java.util.Scanner;

//년도와 월을 입력 받아서 그 달의 달력을 출력하는 예제
//1. 해당 년도 의 월 별 마지막 일(날짜)
//2. 해당 년도의 월 별 첫번째 일 (날짜)
public class CalExam {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도와 월을 입력하시오 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int lastDay = lastDayOfMonth(year, month); //해당 년도의 월 별 마지막 날짜 담은 변수
		int firstDay = firstDayOfMonth(year, month); //해당 년도의 월 별 첫번째 날짜 담은 변수 
		makeCalender(lastDay, firstDay);
		
	}
	
	public static void makeCalender(int lastDay, int firstDay) {
		System.out.println("=================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
