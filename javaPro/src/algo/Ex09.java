package algo;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

// 깊이 우선 탐색(DFS)
// 이진 트리 순회 시 사용했던 IN,PRE,POSTORDER 이 속함
// Stack 을 이용하여 구현 
// 스택에 시작할 노드를 담고 데이터를 하나 추출하고 자식노드들을 추가 하면서  
// 추출한 데이터를 출력
// 재귀 호출을 사용하면 코드가 훨씬 간결해짐.
public class Ex09 {
	class Queue<T> {
		class Node<T> {
			private T data;
			private Node<T> next;
			
			public Node(T data) {
				this.data = data;
			}
		}
		
		private Node<T> first;
		private Node<T> last;
		
		public void add(T item) {
			Node<T> t = new Node<T>(item);
			
			if(last != null) {
				last.next = t;
			}
			last = t;
			if(first == null) {
				first = last;
			}
		}
		
		public T remove() {
			if(first == null) {
				throw new NoSuchElementException();
			}
			
			T data = first.data;
			first = first.next;
			
			if(first == null) {
				last = null;
			}
			return data;
		}
		
		public T peek() {
			if(first == null) {
				throw new NoSuchElementException();
			}
			return first.data;
		}
		
		public boolean isEmpty() {
			return first == null;
		}
	}
	
	class Graph {
		class Node {
			int data; 
			LinkedList<Node> adjacent;
			boolean marked;
			Node(int data) {
				this.data = data;
				this.marked = marked;
				adjacent = new LinkedList<Ex09.Graph.Node>();
			}
		}
		Node[] nodes;
		public Graph(int size) {
			nodes = new Node[size];
			for(int i = 0; i < size; i++) {
				nodes[i] = new Node(i);
			}
		}
		
		void addEdge(int i1, int i2) {
			Node n1 = nodes[i1];
			Node n2 = nodes[i2];
			
			if(!n1.adjacent.contains(n2)) {
				n1.adjacent.add(n2);
			}
			if(!n2.adjacent.contains(n1)) {
				n2.adjacent.add(n1);
			}
			
		}
		
		void dfs() {
			dfs(0);
		}
		
		void dfs(int index) {
			Node root = nodes[index];
			Stack<Node> stack = new Stack<Ex09.Graph.Node>();
			stack.push(root);
			root.marked = true;
			while(!stack.isEmpty()) {
				Node r = stack.pop();
				for(Node n : r.adjacent) {
					if(n.marked == false) {
						n.marked = true;
						stack.push(n);
					}
				}
				visit(r);
			}
		}
		
		void visit(Node n) {
			System.out.println(n.data + " ");
		}
		
		void bfs() {
			bfs(0);
		}
		
		void bfs(int index) {
			Node root = nodes[index];
			Queue<Node> queue = new Queue<Node>();
			root.marked = true;
			while(!queue.isEmpty()) {
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}































