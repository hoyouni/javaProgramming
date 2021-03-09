package days24;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 30. - 오전 10:27:18
 * @Subject p 644 HashMap과 HashTable
 *                          String  불변
 *                          StringBuffer  동기화 처리 O
 *                          StringBuilder 동기화 처리 X
 *                          
 *                          Array
 *                          ArrayList      동기화 처리 X
 *                          Vector          동기화 처리 O
 *                          
 *  HashMap     동기화 처리 X    새로나온 것이라서 [권장.]  해싱기법(hashing) 많은 양 성능 뛰어나다. 
 *                     key,value null 허용한다. 
 *   
 *  HashTable    동기화 처리 O
 *                          
 *                          Map 계열의 특징 : ( key + value ) == entry 엔트리
 *                                                   중복X    중복O
 *                                                   유일
 *                          
 *                          
 *                          
 *                          StringBuffer/Vector/HashTable 동기화 처리 O  
 */
public class Ex04 {

	public static void main(String[] args) {
		// <K,V>   Key, Value   
		// <E>      Element
		// <T>      Type
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "정의호");
		hm.put(null, null);
		hm.put(2, "김예주");
		if( !hm.containsKey(2) ) {
		    hm.put(2, "김호연");
		}
		
		System.out.println( hm.size() ); // 엔트리 크기		
		System.out.println( hm.get(2) ); // 덮어쓰기
		
		// 3.  모든 key-value 출력.
		Set<Entry<Integer, String>> eset= hm.entrySet();
		Iterator<Entry<Integer, String>> ir3 = eset.iterator();
		while (ir3.hasNext()) {
			Entry<Integer, String> entry =  ir3.next();
			System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
		}
		
		
		
		/*
		// 1. 모든 key 출력
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> ir =  keys.iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			System.out.printf("%d-%s\n", key, hm.get(key));
		}
		// 2. 48모든 value 출력
		Collection<String> c = hm.values();
		Iterator<String> ir2 = c.iterator();
		while (ir2.hasNext()) {
			String value =  ir2.next();
			System.out.println(value);
		}
        */
	}

}
//









//