package boostCamp;

import java.util.Stack;

public class Test {
	public static boolean solution(String[] name_list) {
		Stack<String> s = new Stack<String>();
		for(int i = 0; i < name_list.length; i++) {
			s.push(name_list[i]);
		}
		
		boolean flag = true;
		int cnt = 0;
		while(flag) {
			String first = s.get(cnt);
			for(int i = 0; i < s.size(); i++) {
				if(i == cnt)
					continue;
				if(s.get(i).contains(first)) {
					return flag;
				}
			}
			cnt++;
			if(cnt == s.size()) 
				return !flag;
		} // while
		
		return !flag;
	}
	
	public static void main(String[] args) {
		//String[] name_list = {"봄", "봄", "봄"};
		String[] name_list = {"여울", "봄봄", "봄"};
		//String[] name_list = {"가을", "우주", "너굴"};
		//String[] name_list = {"너굴", "너울", "여울", "서울"};
		boolean result = solution(name_list);
		System.out.println(result);
	}
}





































