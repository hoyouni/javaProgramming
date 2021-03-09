package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// Map : key 와 value 로 이루어진 집합
// key 값은 중복될 수 없고 value 값은 중복될 수 있다.
public class Ex04 {
	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		// put() 은 Map 인터페이스에서만 사용 할 수 있음.
		h1.put("one", 1);
		h1.put("two", 2);
		h1.put("three", 3);
		
		System.out.println(h1.get("one"));
		System.out.println(h1.get("two"));
		System.out.println(h1.get("three"));
		
		iteratorUsingForEach(h1);
		iteratorUsingIterator(h1);
		
		
	}

	private static void iteratorUsingIterator(HashMap<String, Integer> h1) {
		Set<Entry<String, Integer>> entries = h1.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void iteratorUsingForEach(HashMap<String, Integer> h1) {
		Set<Entry<String, Integer>> entries = h1.entrySet();
		Iterator<Entry<String, Integer>> ir = entries.iterator();
		while(ir.hasNext()) {
			Entry<String, Integer> entry = ir.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}






























