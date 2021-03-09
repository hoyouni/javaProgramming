package programmers;

import java.util.Arrays;

// 프로그래머스 lv3 예산
public class Programmers_Lv3_Budgets {
	public static int solution(int[] budgets, int M) {
		int result = 0;
		
        Arrays.sort(budgets);
		
        System.out.println(Arrays.toString(budgets));
		
        int sum = 0;
        
        for(int i = 0; i < budgets.length; i++) {
        	sum = sum + budgets[i];
        }
        
        if(sum <= M)
        	return budgets[budgets.length - 1];
        else {
        	int avg = sum / budgets.length; // 130
        	int idx = 0;
        	for(int i = 0; i < budgets.length; i++) {
        		if(budgets[i] < avg) 
        			idx = i;
        	}
        	boolean flag = true;
        	
        	int pivot = budgets[idx]; // 120 기준
        	
        	while(flag) {
        		
        		for(int i = idx + 1; i < budgets.length; i++) {
        			budgets[i] = pivot++;
        		}
        		
        		int sum2 = 0;
        		
        		for(int i = 0; i < idx; i++) 
        			sum2 += budgets[i];
        		
        		for(int i = idx; i < budgets.length; i++) {
        			sum2 = sum2 + budgets[i];
        		}
        		
        		if(sum2 <= M) {
        			sum2 = 0;
        		}
        		
        		if(sum2 > M) {
        			result = budgets[budgets.length - 1] - 2;
        			flag = false;
        		}
        		
        	}
        }
        
		return result;
    }
	public static void main(String[] args) {
		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		int result = solution(budgets, M);
		System.out.println(result);
	}
}





































