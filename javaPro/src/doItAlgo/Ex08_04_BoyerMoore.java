package doItAlgo;

import java.util.Scanner;

// Boyer-Moore 검색 방식(Brute-Force나 KMP 보다 쉽고 효율적)
/*
    String s1 = "ababcdefgha"; 
	String s2 = "abc"; 
 */
public class Ex08_04_BoyerMoore {
	public static int bmMatch(String str, String pattern) {
		int pt; // s1 커서
		int pp; // s2 커서 
		int strLen = str.length(); // str 길이 : 11
		int patternLen = pattern.length(); // pattern 길이  : 3

		int[] skip = new int[Character.MAX_VALUE + 1]; // 건너뛰기 표 

		for(pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patternLen; 
		}


		for(pt = 0; pt < patternLen - 1; pt++) {
			skip[pattern.charAt(pt)] = patternLen - pt - 1;
		}

		while(pt < strLen) {
			pp = patternLen - 1;

			while(str.charAt(pt) == pattern.charAt(pp)) {
				if(pp == 0) {  
					return pt; // 검색 성공
				}
				pp--;
				pt--;
			}
			pt += (skip[str.charAt(pt)] > patternLen - pp) ? skip[str.charAt(pt)] : patternLen - pp;
		}

		return -1;

	}

	public static void main(String[] args) {
		String s1 = "ababcdefgha";
		String s2 = "abc";

		int idx = bmMatch(s1, s2);
		if(idx == -1) {
			System.out.println("찾는 문자열이 없습니다.");
		}
		else {
			System.out.println(idx + 1 + " 번째 문자부터 일치합니다.");
		}
	}
}





































