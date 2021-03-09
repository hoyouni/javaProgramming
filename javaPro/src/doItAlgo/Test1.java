package doItAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {
	public static int solution(String s) {
		Set<String> s1 = new HashSet<String>();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j < s.length() + 1; j++) {
				s1.add(s.substring(i, j));
			}
		}
		System.out.println("s1 : " + s1);
		Iterator<String> ir = s1.iterator();

		Set<String> str2 = new HashSet<String>();
		while(ir.hasNext()) {
			String str = ir.next();
			String[] str1 = new String[str.length()];
			//str2 = new ArrayList<String>();
			for(int i = 0; i < str.length(); i++) {
				str1[i] = str.substring(i, i + 1);
			}
			System.out.println("str1 : " + Arrays.toString(str1));
			for(int i = 0; i < str1.length - 1; i++) {
				for(int j = i + 1; j < str1.length; j++) {
					if(str1[i].equals(str1[j])) {
						str2.add(str);
						//System.out.println("str2 : " + str2);
					}
				}
			}

		}
		
		List<String> str3 = new ArrayList<String>();
		Iterator<String> ir2 = str2.iterator();
		while(ir2.hasNext()) {
			str3.add(ir2.next());
		}
		
		int count = 0;
		while(!str3.isEmpty()) {
			if(s1.contains(str3.get(count))) {
				System.out.println(str3.get(count));
				s1.remove(str3.get(count));
				str3.remove(str3.get(count));
			}
		}
		
		return s1.size();
	}

	public static void main(String[] args) {
		String s = "abac";
		int result = solution(s);
		System.out.println(result);
	}
}



































