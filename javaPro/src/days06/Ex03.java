package days06;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		
		String regex = "[0-9]{3}-[0-9]{3}";
		if(data.matches(regex)) {
			System.out.println("우편번호 형식 ");
		} else {
			System.out.println("우편 ㄴㄴ");
		}
	}
}
