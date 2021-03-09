package algo;

import java.util.LinkedList;
import java.util.Queue;

// 큐(Queue)
// FIFO : 가장 먼저 들어온 데이터가 가장 먼저 나가는 구조 
public class Ex07 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(7); // 7
		q.add(5); // 5 7 
		q.add(4); // 4 5 7
		q.poll(); // 4 5
		q.add(6); // 6 4 5
		q.poll(); // 6 4
		
		
		System.out.println(q);
	}
}



























