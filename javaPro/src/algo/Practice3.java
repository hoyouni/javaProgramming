package algo;

import java.util.Arrays;

public class Practice3 {
	public static String solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i; j < numbers.length; j++) {
        		if(numbers[i] % 10 < numbers[j] % 10) {
        			int temp = numbers[i];
        			numbers[i] = numbers[j];
        			numbers[j] = temp;
        		}
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
		int[] numbers = {6, 10, 2};
		String result = solution(numbers);
		System.out.println(result);
	}
}














