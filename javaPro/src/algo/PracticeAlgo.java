package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo {
	public static int solution(int []A, int []B) {
       int sum = 0;
	
       Arrays.sort(A);
       Arrays.sort(B);
       List<Integer> b = new ArrayList<Integer>();
       for(int i = 0; i < B.length; i++) {
    	   b.add(B[i]);
       }
       
       Collections.reverse(b);
       
       int[] C = new int[b.size()];
       for(int i = 0; i < b.size(); i++) {
    	   C[i] = b.get(i);
       }
       
       for(int i = 0; i < A.length; i++) {
    	   sum += A[i] * C[i];
       }
       
		return sum;
    }
	
	public static void main(String[] args) {
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		int result = solution(A, B);
		System.out.println(result);
		}
	}












