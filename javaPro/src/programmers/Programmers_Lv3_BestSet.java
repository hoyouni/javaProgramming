package programmers;

import java.util.Arrays;

// Lv3 최고의 집합 
public class Programmers_Lv3_BestSet {
	static int[] result;
	public static int[] solution(int n, int s) {
        if(n != 1 && s == 1) {
        	result = new int[1];
        	result[0] = -1;
        	return result;
        }
        
        int[][] best = new int[s / n][n];
        
        int[] num = null;
        for(int i = 1; i <= s / n; i++) {
        	num = new int[n];
        	int cnt = 0;
        	int first = i;
        	while(cnt < n) {
       		num[cnt] = first;
       		first = s - i;
        	cnt++;
        	}
        	System.out.println(Arrays.toString(num));
        	System.out.println("---");
        	for(int j = 0; j < n; j++) {
        		best[i - 1][j] = num[j];
        	}
        }
        System.out.println(Arrays.deepToString(best));
        
        int max = 1;
        for(int i = 0; i < best.length; i++) {
        	for(int j = 0; j < best[i].length; j++) {
        		
        	}
        	System.out.println();
        }
        
        return null;
    }
	public static void main(String[] args) {
		int n = 2;
		int s = 9;
		int[] result = solution(n, s);
		System.out.println(Arrays.toString(result));
	}
}
















