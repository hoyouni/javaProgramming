package algo;

import java.util.PriorityQueue;

public class PracticeAlgo11 {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i = 0; i < scoville.length; i++) {
			q.add(scoville[i]);
		}
		System.out.println(q);
		
		int cnt = 0;
		
		while(q.peek() < K) {
			int first = q.poll();
			int newSco = first + (q.poll() * 2);
			if(newSco < K || newSco >= K) {
				cnt++;
				q.add(newSco);
			}
			else if(newSco < K && q.size() == 1) {
				return -1;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		int result = solution(scoville, K);
		System.out.println(result);
	}
}





























