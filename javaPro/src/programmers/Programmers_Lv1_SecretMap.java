package programmers;

import java.util.Arrays;

public class Programmers_Lv1_SecretMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] arr = new int[n][n];
        int[][] arr_two = new int[n][n];
        
        for(int i = 0; i < arr.length; i++) {
        	String num = Integer.toBinaryString(arr1[i]); 
        	String num2 = Integer.toBinaryString(arr2[i]); 
        	int numLen = num.length();
        	int numLen2 = num2.length();
        	
        	for(int j = arr.length - 1; j >= arr.length - num.length(); j--) {
        		arr[i][j] = Integer.parseInt(num.substring(numLen - 1, numLen));
        		numLen--;
        	}
        	
        	for(int k = arr.length - 1; k >= arr.length - num2.length(); k--) {
        		arr_two[i][k] = Integer.parseInt(num2.substring(numLen2 - 1, numLen2));
        		numLen2--;
        	}
        }
        
        String[] result = new String[n];
        for(int i = 0; i < result.length; i++) {
        	result[i] = "";
        }
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		if(arr[i][j] == 1 || arr_two[i][j] == 1) {
        			result[i] += "#";
        		} else {
        			result[i] += " ";
        		}
        	}
        }
        
        
		return result;
    }
	
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] result = solution(n, arr1, arr2);
		System.out.println(Arrays.toString(result));
	}
}































