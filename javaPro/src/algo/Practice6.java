package algo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Practice6 {
	public static int solution(int n, int[] lost, int[] reserve) {
		List<Integer> all = new LinkedList<Integer>();
		List<Integer> lost2 = new LinkedList<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		for(int i = 0; i < n; i++) {
			all.add(i + 1);
		} // 전체 학생 담겨 있는 리스트
		System.out.println("all 전체 학생 : " + all);

		for(int i = 0; i < lost.length; i++) {
			lost2.add(lost[i]);
		}
		System.out.println("lost2 도난 당한 학생 : " + lost2);

		System.out.println("reserve 여벌이 있는 학생 : " + Arrays.toString(reserve));

		for(int i = 0; i < lost.length; i++) {
			if(all.contains(lost[i])) {
				all.remove(all.indexOf(lost[i]));
			}
		} // 전체 학생 중 도난 당하지 않은 학생 담겨 있는 리스트 
		System.out.println("all 전체 학생 중 도난 당하지 않은 학생 : " + all);
		
		
		for(int i = 0; i < reserve.length; i++) {
			if(lost2.contains(reserve[i])) { // 1) 도난 당한 학생 중 여벌이 있는 학생이 있을 경우
				System.out.print("도난 당한 학생 중 여벌이 있는 학생 : " + lost2.get(i) + "\n");
				all.add(reserve[i]);
				//System.out.println("도난 당한 학생 중 여벌이 있는 학생 : " + all);
			}
			// 2) 도난 당한 학생 중 여벌이 없는 학생 
			else if(!lost2.contains(reserve[i])) {
				// 여벌이 있는 학생에게 옷을 빌려야함
				if(reserve[i] > 1 && reserve[i] < n) { // 여벌이 있는 학생이 0 부터 n 까지일 경우
					if(reserve.length < lost.length) {
						all.add(reserve[i] - 1);
					} 
					else {
						all.add(reserve[i] - 1);
						all.add(reserve[i]);
						all.add(reserve[i] + 1);
					}
				}
				else if(reserve[i] == n) { // 여벌이 있는 학생이 n과 같을 경우 
					all.add(reserve[i] - 1);
				}
			}
		}

		for(int i = 0; i < all.size(); i++) {
			set.add(all.get(i));
		}

		System.out.println("set 수업을 들을 수 있는 학생 : " + set);

		return set.size();
	}

	public static void main(String[] args) {
		int n = 5; // 전체 학생 수 
		int[] lost = {1,3,5}; // 체육복을 도난 당한 학생들 번호
		int[] reserve = {1}; // 여벌의 체육복 가져온 학생
		int result = solution(n, lost, reserve);
		System.out.println(result); // 체육수업 들을 수 있는 학생 값 5
	}
}







































