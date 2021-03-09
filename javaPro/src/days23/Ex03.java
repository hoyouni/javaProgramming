package days23;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 29. - 오전 10:06:51
 * @Subject Queue 구조
 *                 FIFO
 *                 offer
 *                 poll   
 */
public class Ex03 {

	public static void main(String[] args) {
		// Ctrl + Shift + O : import 구문 추가. 
		// 큐 구현된 클래스 : LinkedList
		// FIFO
		Queue q = new LinkedList<String>();
		q.offer("김재우");
		q.offer("이영재");
		q.offer("이경섭");
		q.offer("박상만");
		// q.size() != 0
		while ( !q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		

	}

}
//









//