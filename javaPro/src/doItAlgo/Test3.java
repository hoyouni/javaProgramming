package doItAlgo;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static int solution(int N, int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					list.remove(list.indexOf(array[i]));
					break;
				}
			}
		}

		
		return list.size();
	}
	public static void main(String[] args) {
		int N = 5;
		int[] array = {2,3,9,4,5};
		int result = solution(N, array);
		System.out.println(result);
	}
}



































