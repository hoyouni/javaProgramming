package collectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap 예제2
public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet(); // key, value 의 한 쌍
		Iterator ir = set.iterator();
		
		while(ir.hasNext()) {
			Map.Entry<Object, Object> e = (Map.Entry<Object, Object>)ir.next();
			System.out.println("이름 : " + e.getKey() + " , 점수 : " + e.getValue());
		}
		
		set = map.keySet(); // key 값 모음 
		System.out.println("참가자 명단 : " + set);
		
		Collection value = map.values(); // map 의 value 들 모음
		ir = value.iterator();
		
		int total = 0;
		
		while(ir.hasNext()) {
			Integer i = (Integer) ir.next();
			total += i.intValue();
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total / set.size());
		System.out.println("최고 점수 : " + Collections.max(value));
		System.out.println("최고 점수 : " + Collections.min(value));
	}
}























