package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_Lv2_Progresses {
	public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		for(int i = 0; i < progresses.length; i++) {
			while(progresses[i] < 100) {
			progresses[i] = progresses[i] + speeds[i];
			cnt++;
			}
			list.add(cnt);
			cnt = 0;
		}
        
        List<Integer> result = new ArrayList<Integer>();
        
        int cnt2 = 0;
        int idx = 0;
        for(int i = idx; i < list.size() - 1; i++) {
        	for(int j = idx + 1; j < list.size(); j++) {
        		if(list.get(i) >= list.get(j)) {
        			cnt2++;
        		} else {
        			idx = j;
        			break;
        		}
        	}
        	result.add(cnt2);
        	if(cnt2 == list.size() - 1)
        		break;
        	else
        		cnt2 = 0;
        }
        
        int[] answer = new int[result.size()];
        int good = 0;
        for(int ans : result) {
        	answer[good] = ans + 1;
        	good++;
        }
        
		return answer;
    }
	
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] result = solution(progresses, speeds);
		System.out.println(Arrays.toString(result));
	}
}






























