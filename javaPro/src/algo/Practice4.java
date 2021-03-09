package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice4 {
	public static String solution(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
        	for(int j = i; j < numbers.length; j++) {
        		if(numbers[i] % 10 <= numbers[j] % 10) {
        			int temp = numbers[i];
        			numbers[i] = numbers[j];
        			numbers[j] = temp;
        		}
        	}
        }
		
        System.out.println(Arrays.toString(numbers));
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
        	list.add(numbers[i]);
        	if(list.get(i) % 10 == 0) {
        		Collections.sort(list);
        		Collections.reverse(list);
        		numbers[i] = list.get(i);
        	}
        	
        }
        
        
        
        System.out.println(Arrays.toString(numbers));
        
        
        String[] num = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
        	num[i] = Integer.toString(numbers[i]);
        }
        
        String result = "";
        
        for(int i = 0; i < num.length; i++) {
        	result = result + num[i];
        }
        
        return result;
        
		
    }
	
	public static void main(String[] args) {
		int[] numbers = {0, 0, 1000, 0};
		String result = solution(numbers);
		System.out.println(result);
	}
}














