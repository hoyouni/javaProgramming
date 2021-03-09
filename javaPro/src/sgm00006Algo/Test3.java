package sgm00006Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {
	
	public static int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] check = new int[answers.length];
        int[] firsts = new int[answers.length];
        int[] seconds = new int[answers.length];
        int[] thirds = new int[answers.length];
        
        for(int i = 0; i < answers.length; i++) {
        	check[i] = answers[i % answers.length];
        	firsts[i] = first[i % first.length];
        	seconds[i] = second[i % second.length];
        	thirds[i] = third[i % third.length];
        }
        
    	int num1 = 0;
    	int num2 = 0;
    	int num3 = 0;
    	
    	
        for(int i = 0; i < check.length; i++) {
        	if(firsts[i] == check[i])
        		num1++;
        	if(seconds[i] == check[i])
        		num2++;
        	if(thirds[i] == check[i])
        		num3++;
        }
        
        
        
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(num1); // 100
        list.add(num2); // 19
        list.add(num3); // 10
        
        List<Integer> list2 = new ArrayList<Integer>();
        int maxNum = Collections.max(list); // 100
        
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i) == maxNum) {
        		list2.add(i + 1);
        	}
        }
        
        int[] result = new int[list2.size()];
        int index = 0;
        for (int i : list2) {
			result[index++] = i;
		}
        Arrays.sort(result);
		return result;
    }
	
	public static void main(String[] args) {
		int[] answers = {1, 3, 2, 4, 2};
		int[] result = solution(answers);
		System.out.println(Arrays.toString(result));
	}

}
