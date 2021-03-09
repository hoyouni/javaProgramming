package sgm00006Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test6 {
	public static int[] solution(int []arr) {
		List<Integer> list = new ArrayList<Integer>();
		
		int check = arr[0];
		int sum = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == check) 
				sum++;
		}
		
		if(arr.length == sum) {
			int[] result = new int[1];
			result[0] = arr[0];
			return result;
		}
		
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i - 1] == arr[i])
        		continue;
        	else 
        		list.add(arr[i - 1]);
        }
        if(list.get(list.size() - 1) != arr[arr.length - 1])
        	list.add(arr[arr.length - 1]);
        
        int[] result = new int[list.size()];
        int index = 0;
        for (int i : list) {
			result[index++] = i;
		}
        
		return result;
    }
	public static void main(String[] args) {
		int[] arr = {1, 1, 1};
		int[] result = solution(arr);
		System.out.println(Arrays.toString(result));
	}

}
