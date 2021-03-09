package ebay;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static int solution(int N, int[][] simulation_data) {
		// N은 창구 수, p_num은 사람 수 
		int p_num = simulation_data.length;
		
		// 창구 (사용중이면 1, 빈 공간이면 0)
		int[] room = new int[N];
		
		// 타이머 
		int time = 0;
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		int N = 2;
		int[][] simulation_data = {
				{0, 3},
				{2, 5},
				{4, 2},
				{5, 3}
		};
		int result = solution(N, simulation_data);
		System.out.println(result);
	}
}







































