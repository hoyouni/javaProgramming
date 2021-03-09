package dataStructure;

// LinkedList 객체 생성
/*
 * Collection interface -> List interface -> ArrayList, Vector, LinkedList
 * ArrayList 와 LinkedList 의 사용방법은 거의 같지만 구현 방법이 다르다.
 * LinkedList 구성 요소 : Data field, Link field, node vertex, head, size, tail
 */
class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		} 
		
		public String toString() {
			return String.valueOf(this.data);
		}
	} // toString
	
		public void addFirst(Object input) { // input = 30
			Node newNode = new Node(input); // data = 30, next = null
			newNode.next = head;
			head = newNode;
			size++;
			if(head.next == null) {
				tail = head;
			} 
		} // addFirst
		
		public void addLast(Object input) {
			Node newNode = new Node(input);
			
			if(size == 0) {
				addFirst(input);
			} else {
				tail.next = newNode;
				tail = newNode;
				size++;
			}
		} //addLast
		
		 Node node(int index) {
			Node x = head;
			for(int i = 0 ; i < index; i++) {
				x = x.next;
			}
			return x;
		} //node
		 
		 public void add(int k, Object input) {
			 if(k == 0) {
				 addFirst(input);
			 } else {
				 Node temp1 = node(k-1);
				 Node temp2 = temp1.next;
				 Node newNode = new Node(input);
				 temp1.next = newNode;
				 newNode.next = temp2;
				 size++;
				 
				 if(newNode.next == null) {
					 tail = newNode;
				 }
			 }
		 } //add
		
		 public String toString() {
			 if(head == null) {
				 return "[]";
			 }
			 Node temp = head;
			 String str = "[";
			 
			 while(temp.next != null) {
				 str += temp.data + ", ";
				 temp = temp.next;
			 }
			 
			 str += temp.data;
			 
			 return str + "]";
		 } // toString
		 
} // LinkedList

public class Ex05 {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		
		// 첫 부분에 데이터 추가
		//numbers.addFirst(30);
		//numbers.addFirst(20);
		//numbers.addFirst(10);
		
		// 끝 부분에 데이터 추가 
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		//numbers.addFirst(5);
		//numbers.add(1, 15);
		// 특정 위치 노드 찾기
		//System.out.println(numbers.node(2));
		
		// 특정 위치에 노드 추가 
		//numbers.add(1, 15);
		
		// 노드 출력
		System.out.println(numbers);
	}
}

































