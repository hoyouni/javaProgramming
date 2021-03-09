package programmers;

import java.util.Arrays;

// Lv2 H-index
public class Programmers_Lv2_H_index {
	public static int solution(int[] citations) {
		int answer = 0;
		int h = 0;
		int k = 0;
		Arrays.sort(citations);
		System.out.println(Arrays.toString(citations));
		
		for (int i = 0; i < citations.length; i++) {
			h = citations[i]; 
			k =  citations.length - i; 
			if (k <= h) {
				answer = k;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] citations = {3, 3, 3, 3, 4};
		int result = solution(citations);
		System.out.println(result);
	}
}






























