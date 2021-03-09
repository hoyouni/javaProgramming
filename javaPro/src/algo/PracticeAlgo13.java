package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo13 {
	public static int solution(int []A, int []B) {
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();
		
		for(int i = 0; i < A.length; i++) {
			a1.add(A[i]);
			a2.add(B[A.length - 1 - i]);
		}
		
		Collections.sort(a1);
		Collections.sort(a2);
		Collections.reverse(a2);
		
		System.out.println(a1);
		System.out.println(a2);
		
		int result = 0;
		while(!a1.isEmpty()) {
			int first = a1.get(0);
			int second = a2.get(0);
			result += first * second;
			a1.remove(0);
			a2.remove(0);
		}
		
		
		return result;
    }
	
	public static void main(String[] args) {
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		int result = solution(A, B);
		System.out.println(result);
	}
}















