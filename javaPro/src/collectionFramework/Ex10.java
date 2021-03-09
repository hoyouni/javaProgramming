package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Stack, Queue
// Stack : 마지막에 저장한 데이터를 가장 먼저 꺼내게 되는 LIFO 구조
//            순차적으로 데이터를 추가하고 삭제하므로 ArrayList가 적합
//            수식계산, 수식괄호검사, 웹브라우저의 앞, 뒤로
// Queue : 처음에 저장한 데이터를 가장 먼저 꺼내게 되는 FIFO 구조 
//              데이터를 꺼낼 때 항상 첫 번째 저장된 데이터를 삭제하므로 LinkedList 가 적합
//              최근 사용문서, 인쇄작업 대기목록, 버퍼 
public class Ex10 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("Stack");
		while(!st.isEmpty()) {
			System.out.print(st.pop() + ", ");
		}
		
		System.out.println("\nQueue");
		while(!q.isEmpty()) {
			System.out.print(q.poll() + ", ");
		}
		
	}
}

































