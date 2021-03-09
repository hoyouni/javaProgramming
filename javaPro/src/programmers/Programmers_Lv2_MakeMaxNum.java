package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

// Lv2 큰 수 만들기 
public class Programmers_Lv2_MakeMaxNum {
	public static String solution(String number, int k) {
		Set<String> set = new TreeSet<>();
		String[] numArr = number.split("");
		Queue<String> q = new LinkedList<>();
		for(String s : numArr) {
			q.add(s);
		}
		
		StringBuffer sb = new StringBuffer();
		
		boolean flag = true;
		String firstNum = number;
		int arrSize = number.length();
		while(flag) {
			int cnt = 0;
			String first = q.poll();
			cnt++;
			int size = q.size();
			while(cnt < k) {
				String second = q.poll();
				first = first + second;
				set.add(first);
				cnt++;
			}
			
		}
		
		String result = sb.toString();
		
		return result;
	}
	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		String result = solution(number, k);
		System.out.println(result);
	}
}





































