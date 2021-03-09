package tossExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toss1 {
	public static boolean solution(String input) {
		if(input.charAt(input.length()-1) == '1') {
			return false;
		}
		for(int i = 1; i < input.length(); i++) {
			if(input.charAt(i - 1) == '1' && input.charAt(i) != '2') {
				return false;
			}
		}

		return true;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean result = solution(input);
		System.out.println(result);

	}
}

























