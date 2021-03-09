package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo4 {
	public static int[] solution(int N, int[] stages) {
		// list 에 stages 배열 담을 것
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < stages.length; i++) {
			list.add(stages[i]);
		}

		// stages 배열 정렬
		Collections.sort(list);
		System.out.println(list);

		// 게임 참여자 수 
		int people = list.size();

		int step = 1;

		// 각 스테이지 실패율 담기 위한 변수
		int fail = 0;

		// 실패율 담을 배열
		List<Double> list2 = new ArrayList<>();

		while(step <= N) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) <= step) {
					fail++;
				}
			}

			list2.add((double)fail / people);
			
			for(int i = 0; i < fail; i++) {
				list.remove(i);
			}
			
			people = people - fail;
			fail = 0;
			step++;
		}

		System.out.println(list2);


		return null;
	}

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] result = solution(N, stages);
		System.out.println(Arrays.toString(result));
	}

}















