package doItAlgo;

import java.util.Scanner;

// 브루트-포스 기본 
public class Ex08_01_BruteForce {
	public static int bfMatch(String str, String patt) {
		int p1 = 0;
		int p2 = 0;
		
		while(p1 != str.length() && p2 != patt.length()) {
			if(str.charAt(p1) == patt.charAt(p2)) {
				p1++;
				p2++;
			}
			else {
				p1 = p1 - p2 + 1;
				p2 = 0;
			}
		}
		
		if(p2 == patt.length()) {
			return p1 - p2;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		String str = "ababcdefgha";
		String patt = "abc";

		int idx = bfMatch(str, patt);
		
		int len = 0;
		
		if(idx == -1) {
			System.out.println("찾는 문자열이 없습니다.");
		} else {
			len = 0;
			for(int i = 0; i < idx; i++) {
				len += str.substring(i, i + 1).getBytes().length;
			}
			len += patt.length();
		}
		
		System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
		System.out.println("텍스트 : " + str);
		System.out.printf(String.format("패턴 : %%%ds\n", len), patt);
		
	}
}




































