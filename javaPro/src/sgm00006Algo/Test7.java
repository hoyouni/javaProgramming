package sgm00006Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test7 {
	public static int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<Integer, Double>();
		
		Arrays.sort(stages);
        
        int index = 1;
        int ind = 0;
        while(index <= N) {
        	int cnt = 0;
        	int cnt2 = 0;
        	for(int i = ind; i < stages.length; i++) {
        		if(index == stages[i])
        			cnt++;
        		if(index <= stages[i])
        			cnt2++;
        	}
        	
        	double failed = 0.0;
        	if(cnt2 == 0) {
        		failed = 0.0;
        	} else {
        		failed = (double)cnt / (double)cnt2;
        	}
        	map.put(index, failed);
        	ind = cnt;
        	index++;
        }
        
        
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        
        Collections.sort(keySetList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        
        int[] result = new int[N];
        int count = 0;
        for(Integer key : keySetList) {
        	result[count++] = key;
            
        }
        
		return result;
    }
	

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {1,1,1,1,1};
		int[] result = solution(N, stages);
		System.out.println(Arrays.toString(result));
	}
}
