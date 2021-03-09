package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// Lv3 이중 우선순위 큐
public class Programmers_Lv3_Queue {
	static int[] no = {0,0};
	
	public static int[] solution(String[] operations) {
        Queue<Integer> q = new LinkedList<Integer>();
		
        int num = 0;
        for(int i = 0; i < operations.length; i++) {
        	if(operations[i].contains("I")) {
        		String[] s = operations[i].split(" ");
        		num = Integer.parseInt(s[1]);
        		q.offer(num);
        	}
        	else if(operations[i].equals("D 1")) {
        		if(!q.isEmpty()) {
        		q.remove(Collections.max(q));
        		}
        	}
        	else if(operations[i].equals("D -1")) {
        		if(!q.isEmpty()) {
        			q.remove(Collections.min(q));
        		}
        	}
        }
        
		if(q.isEmpty()) {
			return no;
		} else {
			no[0] = Collections.max(q);
			no[1] = Collections.min(q);
			return no;
		}
        
		//return null;
    }
	
	public static void main(String[] args) {
		String[] operations = {"I 7", "I 5", "I -5", "D -1"};
		int[] result = solution(operations);
		System.out.println(Arrays.toString(result));
	}
}


























