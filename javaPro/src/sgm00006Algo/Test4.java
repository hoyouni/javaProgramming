package sgm00006Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test4 {
	public static int[] solution(int[] array, int[][] commands) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < commands.length; i++) {
        	List<Integer> list2 = new ArrayList<Integer>();
        	List<Integer> list3 = new ArrayList<Integer>();
          	for(int j = 0; j < commands[i].length; j++) {
          		list2.add(commands[i][j]);
        	}
          	
          	if(list2.get(0) - 1 >= list2.get(list2.size() - 2) - 1) {
          		int index = 0;
          		while(index <= (list2.get(0) - 1) - (list2.get(list2.size() - 2) - 1)) {
          			list3.add(array[list2.get(index) - 1]);
          			index++;
          		}
          	} else {
          		for(int k = list2.get(0) - 1; k < list2.get(list2.size() - 2); k++) {
          			list3.add(array[k]);
          		}
          	}
          	
          	Collections.sort(list3);
          	
          	int indexNum = commands[i][2];
          	int result = list3.get(indexNum - 1);
          	list.add(result);
        }
        
        int[] result = new int[list.size()];
        int index = 0;
        for (int i : list) {
			result[index++] = i;
		}
        
		return result;
    }
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = 	{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = solution(array, commands);
		System.out.println(Arrays.toString(result));
	}

}
















