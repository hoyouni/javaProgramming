package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PracticeAlgo10 {
	public static int[] solution(int N, int[] stages) {
        // 1 ~ N 까지 스테이지 배열
		int[] allStage = new int[N];
        for(int i = 0; i < allStage.length; i++) {
        	allStage[i] = i + 1;
        }
        
        // 스테이지 도전자 배열
        Stack<Integer> list = new Stack<Integer>();
        for(int i = 0; i < stages.length; i++) {
        	list.add(stages[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        
        // 실패율 담을 배열
        List<Double> list2 = new ArrayList<Double>();
        
        while(!list.isEmpty()) {
        	double cnt = 0;
        	int first = list.peek();
        	
        	if(first > N) {
        		list2.add(0.0);
        		break;
        	}
        	for(int i = 0; i < list.size(); i++) {
        		if(first == list.get(i)) {
        			cnt++;
        		} else if(!list.contains(i + 1)) {
        			list2.add(0.0);
        			
        		}
        	}
        	double failPlayers = cnt / (double) list.size(); 
        	list2.add(failPlayers);
        	for(int i = 0; i < cnt; i++) {
        		list.pop();
        	}
        	
        }
        System.out.println(list2);
		return null;
    }
	
	public static void main(String[] args) {
		int N = 4; // 5 스테이지 까지 있음.
		int[] stages = {4,4,4,4,4}; // 도전중인 스테이지
		int[] result = solution(N, stages);
		System.out.println(Arrays.toString(result));
	}
}
































