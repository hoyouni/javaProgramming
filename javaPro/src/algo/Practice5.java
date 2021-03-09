package algo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


// 프로그래머스 lev2 프린터문제
public class Practice5 {
	public static int solution(int[] priorities, int location) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0; i < priorities.length; i++) {
			q.add(priorities[i]);
		}
		
		System.out.println(q);
		
		for(int i = 0; i < q.size(); i++) {
			int curNum = q.peek();
			int maxNum = Collections.max(q);
			if(curNum < maxNum) {
				q.add(q.poll());
				
			} 
		}
		
		System.out.println(q);
		
		return 0;
	}

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int result = solution(priorities, location);
		System.out.println(result);
	}
}
















