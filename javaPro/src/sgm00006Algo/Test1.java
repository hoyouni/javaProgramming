package sgm00006Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(!list.contains(numbers[i] + numbers[j])) {
					list.add(numbers[i] + numbers[j]);
				}
			}
		}
		
		Collections.sort(list);
		int[] result = new int[list.size()];
		int index = 0;
		for (int i : list) {
			result[index++] = i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = {0, 2, 5, 7};
		int[] result = solution(numbers);
		System.out.println(Arrays.toString(result));
	}

}
