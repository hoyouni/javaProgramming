package study;

import java.time.LocalTime;

public class Test {
	public static String solution(String p, int n) {
		String answer = null;
		String[] pTime = p.split(" ");
		LocalTime time = LocalTime.parse(pTime[1]);
		LocalTime afterTime;

		if (pTime[0].equals("AM") && time.getHour() == 12) {
			time = time.minusHours(12);
		} else if (pTime[0].equals("PM") && time.getHour() == 12) {
		} else if (pTime[0].equals("AM")) {
		} else {
			time = time.plusHours(12);
		}

		afterTime = time.plusSeconds(n);
		answer = String.valueOf(afterTime);
		if(answer.length() < 6) {
			answer += ":00";
		}

		return answer;

	}

	public static void main(String[] args) {
		String p = "PM 11:59:59"; // 현재 시간
		int n = 1; // n초 뒤 시간 
		String result = solution(p, n);
		System.out.println(result);

	}
}































