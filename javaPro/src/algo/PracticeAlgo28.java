package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PracticeAlgo28 {
	public static void main(String[] args) {
		//int[] kk = {54, 16, 7, 55, 20, 10, 25, 21, 59, 95, 58, 97, 44, 100, 48, 79, 53, 62, 84, 70}; // 3
		//int[] kk = {3, 9, 9, 7, 5, 19, 11, 29, 1, 6, 15, 1, 28, 11, 4, 18, 17}; // 6
		//int[] kk = {15, 19, 6, 15, 11, 5, 20, 8, 20, 8, 1, 13, 13, 9}; // 6
		//int[] kk = {24, 16, 14, 14, 13, 9, 7, 4, 1, 18, 34, 20, 20, 33, 15, 23, 12, 38, 34, 23, 19 ,18, 21, 14}; // 9
		int[] kk = {9, 32, 38, 16, 37, 33, 23, 10 ,4, 25, 34, 34, 12, 12, 15, 14, 39, 5, 2, 30, 20, 16, 9, 25, 1, 4, 8, 44, 22, 31};
		
		Stack<Integer> s = new Stack<Integer>();

		for(int i = 0; i < kk.length; i++) {
			s.push(kk[i]);
		}
		System.out.println(s);

		int cnt = 1;

		int first = s.pop();
		List<Integer> a = new ArrayList<Integer>();
		a.add(first);
		while(!s.isEmpty()) {
			if(s.peek() >= first) {
				first = s.pop();
				a.add(first);
			} 
			else if(s.peek() < first) {
				for(int i = 0; i < a.size(); i++) {
					if(Collections.max(a) <= s.peek()) {
						a.add(s.peek());
						first = s.pop();
						break;
					}
					if(s.peek() < a.get(i)) {
						a.set(i, s.peek());
						s.pop();
						break;
					}
				}
			}
		}
		System.out.println("result : " + a.size());
	}
}




















