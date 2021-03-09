package algoStudy.StringAndArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestPointstoOrigin_mySol {
	
	static Comparator<int[]> Comp = new Comparator<int[]>() {
		@Override
		public int compare(int[] a, int[] b) {
			return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]);
		}
	};
	
	public static int[][] solution(int[][] points, int k) {
		Queue<int[]> queue = new PriorityQueue<>(points.length, Comp);
		int[][] result = new int[k][2];
		
		int index = 0;
		for(int[] p : points) {
			queue.offer(p);
		}
		
		while(index < k) {
			result[index] = queue.poll();
			index++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[][] points = {
				{1, 3},
				{-2, -2}
		};
		int k = 1;
		int[][] result = solution(points, k);
		System.out.println(Arrays.deepToString(result));
	}
}




 



























