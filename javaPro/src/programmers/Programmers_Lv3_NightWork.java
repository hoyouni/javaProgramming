package programmers;

import java.util.Arrays;

public class Programmers_Lv3_NightWork {
	public long solution(int n, int[] works) {
		long result = 0;

		if(n == 0) {
			for(int i = 0; i < works.length; i++) {
				works[i] = (int)Math.pow(works[i], 2);
				result = result + works[i];
			}
		}

		Arrays.sort(works);

		int cnt = 0;
		while(cnt < n) { 
			for(int i = works.length - 1; i >= 0; i--) {
				
				if(works[i] == 0) {
					cnt++;
					continue;
				}
				
				if(cnt >= n) 
					break;
				
				works[i] = works[i] - 1;
				cnt++;
				
				
			}
		}

		for(int work : works) {
			work = (int)Math.pow(work, 2);
			result += work;
		}
		

		return result;
	}

	public static void main(String[] args) {
		int[] works = {4, 3, 3};
		int n = 4;	// 12
		//int[] works = {2, 1, 2};
		//int n = 1;	// 6
		//int[] works = {1, 1};
		//int n = 3;	// 0
		Programmers_Lv3_NightWork a = new Programmers_Lv3_NightWork();
		System.out.println(a.solution(n, works));
	}
}


































