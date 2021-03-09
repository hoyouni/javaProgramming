package kakaoIntern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static int countDuplicate(List<Integer> numbers) {
		int[] numSet = new int[1001];
		for(int i = 0; i < numbers.size(); i++) {
			numSet[numbers.get(i)]++;
		}
		
		int cnt = 0;
		for(int i = 0; i < numSet.length; i++) {
			if(numSet[i] > 1) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(3);
		numbers.add(2);
		
		int result = countDuplicate(numbers);
		System.out.println(result);
		
	}
}





































