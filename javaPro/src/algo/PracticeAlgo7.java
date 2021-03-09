package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo7 {
	public static int solution(int[] scoville, int K) {
		List<Integer> list = new ArrayList<Integer>();
		
		// 1) list 에 scoville 배열 담아두기
		for(int i = 0; i < scoville.length; i++) {
			list.add(scoville[i]);
		}
		Collections.sort(list);
		System.out.println(list); // 1 2 3 9 10 12
		
		int cnt = 0;

		while(list.get(0) <= K ) {
			int newSco = list.get(0) + (list.get(1) * 2);
			if(newSco < K || newSco >= K) {
				cnt++;
				list.remove(0);
				list.set(0, newSco);
				Collections.sort(list);
			}
			
			else if(newSco < K && list.size() == 1) {
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





























