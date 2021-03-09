package days23;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author k≡n¡k
 * @Source Ex05.java
 * @Date 2019. 8. 29. - 오전 10:45:10
 * @Subject p 612 
 */
public class Ex05 {

	public static void main(String[] args) {
		// PriorityQueue 
		// FIFO X
		// 저장한 순서에 관계없이 우선 순위( priority) 가 높은 것부터 꺼내진다. 
		/*
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		//  poll()
		while( !q.isEmpty() ) {
			System.out.println(q.poll());
		}
		*/
		Queue<String> q = new PriorityQueue<String>();
		q.offer("여원경");
		q.offer("이영재");
		q.offer("김호연");
		q.offer("정영진");
		q.offer("김지민");
		//  poll()
		while( !q.isEmpty() ) {
			System.out.println(q.poll());
		}
	}

}
//









//