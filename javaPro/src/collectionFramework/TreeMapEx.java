package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.sampled.ReverbType;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		for(int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				map.put(data[i], map.get(data[i]) + 1);
			} else {
				map.put(data[i], 1);
			}
		}
		
		Iterator<Entry<String, Integer>> ir = map.entrySet().iterator();
		
		System.out.println("기본 정렬");
		while(ir.hasNext()) {
			Entry<String, Integer> entry = ir.next();
			System.out.println(entry.getKey() + " : " + printBar('#', entry.getValue().intValue()) + entry.getValue());
		}
		
		System.out.println();
		
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Set> list = new ArrayList(set);
		
		Collections.sort(list, new ValueComparator());
		
		Iterator<Set> ir2 = list.iterator();
		
		System.out.println("값의 크기가 큰 순서로 정렬");
		
		while(ir2.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)ir2.next();
			System.out.println(entry.getKey() + " : " + printBar('#', entry.getValue().intValue()) + entry.getValue());
		}
	}

	private static String printBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
	
	static class ValueComparator implements Comparator { // 내림차순 정렬 
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry<String, Integer> e1 = (Map.Entry<String, Integer>)o1;
				Map.Entry<String, Integer> e2 = (Map.Entry<String, Integer>)o2;
				
				int v1 = e1.getValue().intValue();
				int v2 = e2.getValue().intValue();
				
				return v2 - v1; // 내림차순 정렬
			}
			return -1;
		}
	}
}
































