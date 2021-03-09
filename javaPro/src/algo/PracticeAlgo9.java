package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PracticeAlgo9 {
	 public static String solution(String number, int k) {
			if(number.substring(0, 1).equals("0")) {
				return "0";
			}

			List<Integer> list = new LinkedList<Integer>();
			for(int i = 0; i < number.length(); i++) {
				list.add(Integer.parseInt(number.substring(i, i+1)));
			}
			System.out.println(list);

			List<Integer> list2 = new ArrayList<Integer>();
			List<Integer> list3 = new ArrayList<Integer>();
			List<Integer> list4 = new ArrayList<Integer>(list);
			
			while(list.size() != number.length() - k) {
				for(int i = 0; i < k; i++) {
					list2.add(list.get(i));
				}
				for(int i = k; i < list.size(); i++) {
					list3.add(list.get(i));
				}
				
				int min1 = Collections.min(list2);
				list.remove(list.indexOf(min1));
				int min2 = Collections.min(list3);
				list4.remove(list4.indexOf(min2));
				list2.clear();
				list3.clear();
				
			}
			System.out.println(list);
			System.out.println(list4);
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i));
			}
			
			String str = sb.toString();
			
			return str;
		}

	public static void main(String[] args) {
		String number = "8765432";
		int k = 4;
		String result = solution(number, k);
		System.out.println(result);
	}
}










