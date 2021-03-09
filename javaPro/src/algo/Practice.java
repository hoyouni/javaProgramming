package algo;

import java.util.ArrayList;
import java.util.Arrays;


public class Practice {
	public static int[] solution(int[] answers) {
		// 1 3 2 4 2
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int a1 = 0, b1 = 0, c1 = 0, i = 0;
		
		for(i = 0; i < answers.length; i++) {
			if(answers[i] == a[i % 5]) {
				a1++;
			}
			if(answers[i] == b[i % 8]) {
				b1++;
			}
			if(answers[i] == c[i % 10]) {
				c1++;
			}
		}
		
		int[] score = {a1, b1, c1};
		int[] rank = {1,1,1};
		
		for(int k = 0; k < score.length; k++) {
			for(int j = 0; j < score.length; j++) {
				if(score[k] > score[j]) {
					rank[j]++;
				}
			}
		}
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int q = 0; q < rank.length; q++) {
			if(rank[q] == 1) {
				array.add(q + 1);
			}
		}
		
		int[] result = new int[array.size()];
		for(int z = 0; z < result.length; z++) {
			result[z] = array.get(z).intValue();
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] result = solution(answers);
		System.out.println(Arrays.toString(result));
	}
}









