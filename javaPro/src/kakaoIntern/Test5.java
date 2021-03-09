package kakaoIntern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
	public static List<String> closestStraightCity(List<String> c, List<Integer> x, List<Integer> y, List<String> q) {
		List<String> result = new ArrayList<String>();
		
		int[][] dist = new int[c.size()][2];
		for(int i = 0; i < dist.length; i++) {
			dist[i][0] = x.get(i);
			dist[i][1] = y.get(i);
		}
		System.out.println(Arrays.deepToString(dist));
		
		/*
		 * (0,0) (0,1)   23 1
		 * (1,0) (1,1)   23 10
		 * (2,0) (2,1)   23 20
		 * 
		 */
		for(int i = 0; i < dist.length; i++) {
			int first = dist[i][0];
			int second = dist[i][1];
			
			for(int j = 0; j < dist.length; j++) {
				int third = dist[j][0];
				int fourth = dist[j][1];
				int min = 999999;
				
				if(first == third && second == fourth) {
					continue;
				}
				
				if(first != second && second != fourth) {
					result.add("NULL");
				}
				
				if(first == third) {
					int comp = Math.abs(second - fourth);
					min = Math.min(comp, min);
				}
				
				if(second == fourth) {
					int comp = Math.abs(first - third);
					min = Math.min(comp, min);
				}
			}
			
			
			
		}
		
		
		return null;
	}

	public static void main(String[] args) {
		List<String> c = new ArrayList<String>(); 
		c.add("fastcity");
		c.add("bigbanana");
		c.add("xyz");
		
		List<Integer> x = new ArrayList<Integer>();
		x.add(23);
		x.add(23);
		x.add(23);

		List<Integer> y = new ArrayList<Integer>();
		y.add(1);
		y.add(10);
		y.add(20);
		
		List<String> q = new ArrayList<String>();
		q.add("fastcity");
		q.add("bigbanana");
		q.add("xyz");
		
		List<String> result = closestStraightCity(c, x, y, q);
		System.out.println(result);
	}
}


































