package days06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int kor;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		String data = sc.next();
		String regex = "[0-9]{1,2}|100";
		if(data.matches(regex) ) {
			System.out.println("올바른 국어점수");
		} else {
			System.out.println("올바르지 않은 국어 점수");
		}
		
	}

}
