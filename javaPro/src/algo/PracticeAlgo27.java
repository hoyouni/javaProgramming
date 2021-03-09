package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PracticeAlgo27 {
	public static void main(String[] args) {
		int[] kk = {3, 9, 9, 7, 5, 19, 11, 29, 1, 6, 15, 1, 28, 11, 4, 18, 17};
		List<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < kk.length; i++) {
			b.add(kk[i]);
		}
		int q = Collections.max(b);

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
				if(a.get(a.size() - 1) > s.peek()) {
					if(a.get(a.size() - 1) == q && Collections.max(s) == s.peek()) {
						cnt++;
						first = s.pop();
						a.add(first);
					} else {
					first = s.pop();
					}
				} else {
					cnt++;
					first = s.pop();
					a.add(first);
				}
			}
			else if(s.peek() < first) {
				first = s.pop();
			} 
		}
		System.out.println(cnt);
	}
}




















