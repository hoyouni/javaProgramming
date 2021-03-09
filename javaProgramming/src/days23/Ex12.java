package days23;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @Author k≡n¡k
 * @Source Ex12.java
 * @Date 2019. 8. 29. - 오후 3:38:01
 * @Subject  HashSet -> 정렬해서 출력... 의도
 *                 정렬 + HashSet = [SortedSet]
 */
public class Ex12 {

	public static void main(String[] args) {
		// p 632
		Set<Integer> set = new HashSet<Integer>();

		//for (int i = 0; set.size() < 6; i++) {
		while( set.size()<6) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		List<Integer> list= new LinkedList<Integer>(set);		
		Collections.sort(list);
		// Collections.sort(set);
		
		
		System.out.println( list );

	}

}
//









//