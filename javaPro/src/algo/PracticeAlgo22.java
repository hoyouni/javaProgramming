package algo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PracticeAlgo22 {
	static Set<Integer> list = new TreeSet<Integer>();
	public static String solution(int[] numbers) {
		perm(numbers, 0);
		
		int max = 0;
		Iterator<Integer> ir = list.iterator();
		while(ir.hasNext()) {
			max = ir.next();
		}
		StringBuffer sb = new StringBuffer();
		sb.append(max);
		
		return sb.toString();
	}

	public static void perm(int[] numbers, int point) {
		if (point == numbers.length) { 
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < numbers.length; i++) { 
				sb.append(numbers[i]);
			}
			list.add(Integer.parseInt(sb.toString()));
			return ; 
		} 
		
		for (int i = point; i < numbers.length; i++) { 
			swap(numbers, i, point); 
			perm(numbers, point + 1); 
			swap(numbers, i, point); 
		}
	}

	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void main(String[] args) {
		int[] numbers = {5, 546};
		String result = solution(numbers);
		System.out.println(result);
	}
}




















