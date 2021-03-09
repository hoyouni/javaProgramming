package days23;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author k≡n¡k
 * @Source Ex09.java
 * @Date 2019. 8. 29. - 오후 12:04:35
 * @Subject    Set 인터페이스 구현한 대표적인 컬렉션 클래스 : HashSet
 *                    1. 순서 X
 *                    2. 중복 X
 */
public class Ex09 {

	public static void main(String[] args) {
		// 0.7F   float  loadFactor		
		HashSet<String> set = new HashSet<String>(10, 0.75F);
		System.out.println( set.add("영재") );
		System.out.println( set.add("경섭") );
		System.out.println( set.add("상만") );
		System.out.println( set.add("재우") );
		
		System.out.println( set.add("재우") );
		set.add(null);
		set.add(null);
		// 1. 순서 X
		// 2. 중복 X
		// 3. null O   1번만.
		Iterator<String> ir = set.iterator();
		
		while (ir.hasNext()) {
			String name =  ir.next();
			System.out.println(name);
		}
		
		/*
		set.clear();
		set.contains(o);
		set.isEmpty();
		set.remove(o);
		set.removeAll(c);
		set.size();
		set.toArray();
		*/

	}

}
//









//