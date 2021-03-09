package days23;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @Author k≡n¡k
 * @Source Ex06.java
 * @Date 2019. 8. 29. - 오전 11:01:37
 * @Subject  p 613 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// Deque(    Double - Ended Queue )
	    // offerFirst	[ 4][2][3][5][1]   pollLast
	    // pollFirst                              offerLast
		
		// p 614 Iterator , Enumeration       /   [ ListIterator  ]
		
		//       ------> 단방향 요소 접근
		//       <--      ListIterator
		// list  [A][B][C]		
 		ArrayList<Integer> list = new ArrayList<Integer>();
 		list.add( new Integer( 1 ));
 		list.add(2);
 		list.add(3);
 		list.add(4);
 		list.add(5);
 		// 
 		ListIterator<Integer> ir = list.listIterator();
 		while( ir.hasNext() ) {
 			System.out.println( ir.next()  ) ; 
 		}
 		//
 		System.out.println("===");
 		while( ir.hasPrevious() ) {
 			System.out.println(ir.previous());
 		}
 		
 		
 		// Integer i = new Integer(1);

	}

}
//









//