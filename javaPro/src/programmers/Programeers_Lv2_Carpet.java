package programmers;

import java.util.Arrays;

// Lv2 카펫
public class Programeers_Lv2_Carpet {
	public static int[] solution(int brown, int red) {
		int[] answer = new int[2];

		int num = brown + red;
		int b = 0;
		for(int i = 1; i <= num; i++){
			if(num % i == 0 ){
				b = (brown+4)/2 - i;
				if(brown + red == i*b){
					answer[0] = i;
					answer[1] = b;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int brown = 18;
		int yellow = 6;
		int[] result = solution(brown, yellow);
		System.out.println(Arrays.toString(result));
	}
}





























