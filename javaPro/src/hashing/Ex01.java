package hashing;

import java.util.Arrays;

public class Ex01 {
	 public static int[] solution(int n, int[] stages) {
		 	Arrays.sort(stages); //{1,2,2,2,3,3,4,6}
		 	int players = stages.length; // 총 도전자 수 
		 	double[] failStage = new double[n]; // 실패율 스테이지 배열
		 	double score = 0;
		 	int cnt = 0;
		 	
		 	for(int i = 0; i < n; i++) {
		 		for(int j = 0; j < stages.length; j++) {
		 			if(stages[j] == i + 1) {
		 				cnt++;
		 			}
		 		}
		 		score = (double)cnt / players;
	 			failStage[i] = score;
	 			score = 0;
	 			players = players - cnt;
	 			cnt = 0;
		 	}
		 	
		 	System.out.println(Arrays.toString(failStage));
		 	
		 	int[] rank = new int[n];
		 	Arrays.fill(rank, 1);
		 	
		 	double max = 0;
		 	
		 	
		 	
		 	System.out.println(Arrays.toString(rank));
	        return null;
	    }
	
	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		int[] result = solution(n, stages);
		System.out.println(Arrays.toString(result));
	}
}





















