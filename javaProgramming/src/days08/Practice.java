package days08;

import java.util.Scanner;

public class Practice {

	public static boolean solution(String s) {
		boolean answer = true; 
		s = s.toLowerCase();
		
		int index = 0;
		int index2 = 0;
		
		char[] k = s.toCharArray();
		
		for(int i = 0; i < k.length; i++) {
			String v = k[i] +"";
			if(k.length > 50 || !v.matches("[a-z]")) {
				return !answer;
			}
			if(k[i] == 'p') {
				index += 1;
			} else if(k[i] == 'y') {
				index2 += 1;
			} else if(k[i] != 'p' && k[i] != 'y') {
				return answer;
			}
		}
			if(index == index2) {
				return answer;
			} else {
				return !answer;
			}


	
	}


	public static void main(String[] args) {

		Practice practice = new Practice();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean result = solution(s);
		System.out.println(result);
	}
}
