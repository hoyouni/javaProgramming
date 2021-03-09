package programmers;

import java.util.Arrays;

// Lv2 124 나라의 숫자
public class Programmers_Lv2_124Number {
	static String[] numbers = {"4", "1", "2"};

	public static String solution(int n) {
		String answer = "";
		int num = n;

		while(num > 0){
			int remainder = num % 3;
			num /= 3;

			if(remainder == 0) 
				num--;

			answer = numbers[remainder] + answer;
		}

		return answer;
	}
	public static void main(String[] args) {
		int n = 10;
		String result = solution(n);
		System.out.println(result);
	}
}





















