package algo;

import java.util.Arrays;

public class PracticeAlgo15 {
	public static int solution(String name) {
		// 초기 설정
		char[] first = new char[name.length()];
		for(int i = 0; i < first.length; i++) {
			first[i] = 'A';
		}
		System.out.println(Arrays.toString(first));
		
		// 완성 단어
		char[] complete = name.toCharArray();
		System.out.println(Arrays.toString(complete));
		
		// 움직임을 카운트할 변수 
		int cnt1 = 0;
		int cnt2 = 0;
		int gameCount1 = 0;
		int gameCount2 = 0;
		
		// 순방향 
		for(int i = 0; i < first.length; i++) {
			if(i > 0) {
				cnt1++;
			}
			if(complete[i] == 'A') {
				cnt1++;
				continue;
			} 
			else if(complete[i] != 'A') {
				int start = (int)complete[i];
				int game1 = start;
				int game2 = start;
				while(game1 != (int)first[i]) {
					game1++;
					if(game1 > 90) {
						game1 = 65;
						gameCount1++;
						break;
					}
					gameCount1++;
				}
				while(game2 != (int)first[i]) {
					game2--;
					gameCount2++;
				}
				if(gameCount1 > gameCount2) {
					//System.out.println(" > gameCount1 : " + gameCount1 + " gameCount2 : " + gameCount2);
					cnt1 += gameCount2;
					gameCount1 = 0;
					gameCount2 = 0;
				} else {
					//System.out.println(" < gameCount1 : " + gameCount1 + " gameCount2 : " + gameCount2);
					cnt1 += gameCount1;
					gameCount1 = 0;
					gameCount2 = 0;
				}
			}
		}
		System.out.println("cnt1 : " + cnt1);
		
		//역방향
		int index = 0;
		if(index < 0) {
			index = first.length - 1;
		}
		for(int i = index; i >= 0; i--) {
			if(i < first.length - 1) {
				cnt2++;
			}
			if(complete[i] == 'A') {
				cnt2++;
				continue;
			} 
			else if(complete[i] != 'A') {
				int start = (int)complete[i];
				int game1 = start;
				int game2 = start;
				while(game1 != (int)first[i]) {
					game1++;
					if(game1 > 90) {
						game1 = 65;
						gameCount1++;
						break;
					}
					gameCount1++;
				}
				while(game2 != (int)first[i]) {
					game2--;
					gameCount2++;
				}
				if(gameCount1 > gameCount2) {
					//System.out.println(" > gameCount1 : " + gameCount1 + " gameCount2 : " + gameCount2);
					cnt2 += gameCount2;
					gameCount1 = 0;
					gameCount2 = 0;
				} else {
					//System.out.println(" < gameCount1 : " + gameCount1 + " gameCount2 : " + gameCount2);
					cnt2 += gameCount1;
					gameCount1 = 0;
					gameCount2 = 0;
				}
			}
		}
		
		System.out.println("cnt2 : " + cnt2);
		
		
		return -1;
	}

	public static void main(String[] args) {
		String name = "JAN";
		int result = solution(name);
		System.out.println(result);
	}
}


































