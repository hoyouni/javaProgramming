package days22;

import java.util.LinkedList;

/**
 * @Author k≡n¡k
 * @Source Ex06.java
 * @Date 2019. 8. 28. - 오후 2:52:02
 * @Subject p 596 LinkedList  컬렉션 클래스 
 *                
 */
public class Ex06 {

	public static void main(String[] args) {
		
		/*		
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(new Student(1, "정영진"));
		list.add(new Student(2, "이영재"));		
		list.add(new Student(3, "여원경") );
		*/
		
		Node node1 = new Node(100);
		Node node2 = new Node(200);
		node1.next = node2;
		Node node3 = new Node(300);
		node2.next = node3;
		Node node4 = new Node(400);
		node3.next = node4;
		
		Node node = node1;
		while( node != null ) {
			System.out.println(node.value);
			node = node.next;
		}

	}

}
// 노드(Node)
class Node{	
	int value;	
	Node(int value){
		this.value = value;
	}	
	// 다음 노드를 참조할 수 있는 필드
	Node next = null;
	Node prev = null;
}







// 영재, 경섭, 상만 ( 내일 휴가 )
//