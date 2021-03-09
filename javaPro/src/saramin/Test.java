package saramin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		System.out.println("------");
		
		String str = sc.next();
		
		String[] strBook = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			strBook[i] = str.substring(i, i + 1);
		}

		System.out.println("------");
		
		int cnt = 0;
		
		List<String> result = new ArrayList<String>();
		
		while(cnt < Q) {
			
			int L = sc.nextInt();
			int R = sc.nextInt();
			
			Stack<String> s = new Stack<String>();
			for(int i = L - 1; i < R; i++) {
				s.push(strBook[i]);
			}
			
			System.out.println(s);
			Collections.sort(s);
			
			Map<String, Integer> m = new TreeMap<String, Integer>();
			
			int num = 0;
			
			while(!s.isEmpty()) {
				String first = s.pop();
				for(int i = 0; i < s.size(); i++) {
					if(first.equals(s.get(i))) {
						num++;
						s.remove(s.indexOf(s.get(i)));
					}
				}
				m.put(first, num);
				//num = 0;
			}
			
			System.out.println(m);
			
			Set<Entry<String, Integer>> set = m.entrySet();
			Iterator<Entry<String, Integer>> ir = set.iterator();
			
			while(ir.hasNext()) {
				String good = ir.next().getKey();
				result.add(good);
				break;
			}
			System.out.println(result);
			s.clear();
			m.clear();
			cnt++;
		}
		System.out.println("------");
		
		
		
	}
}
































