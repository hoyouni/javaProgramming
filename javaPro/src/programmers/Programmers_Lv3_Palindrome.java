package programmers;

import java.util.Arrays;

// Lv 3 가장 긴 팰린드롬
public class Programmers_Lv3_Palindrome {
	public static int solution(String s) {
		char[] chr = s.toCharArray();
		System.out.println(Arrays.toString(chr));

		for (int len = s.length(); len > 1; len--) {
			for (int start = 0; start + len <= s.length(); start++) {
				boolean chk = true;
				for (int i = 0; i < len/2; i++) {
					if (chr[start + i] != chr[start + len  - i - 1]) {
						chk = false;
						break;
					}
				}

				if (chk) return len;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		String s = "dkwqabcdcbawp";
		int result = solution(s);
		System.out.println(result);
	}
}















