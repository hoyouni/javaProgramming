package doItAlgo;

import java.util.Comparator;
import java.util.Scanner;

class LinkedList<E> {
	// 노드 클래스 
	static class Node<E> {
		// 노드 클래스 필드 
		private E data;
		private Node<E> next;

		// Node 클래스 생성자 
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	} // Node

	// LinkedList 클래스 필드 
	private Node<E> head;
	private Node<E> crnt;

	// LinkedList 클래스 생성자
	public LinkedList() {
		head = crnt = null;
	}

	// 노드 검색 
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; // 현재 스캔중인 노드

		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) { // 검색 성공 
				crnt = ptr;
				return ptr.data;
			}
			ptr = head.next; // 다음 노드 선택
		}
		return null; // 검색 실패
	}

	// 머리에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
	}

	// 꼬리에 노드 삽입
	public void addLast(E obj) {
		if(head == null) {
			addFirst(obj);
		}
		else {
			Node<E> ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}

	// 머리 노드 삭제 
	public void removeFirst() {
		if(head != null) {
			head = crnt = head.next;
		}
	}

	// 꼬리 노드 삭제
	public void removeLast() {
		if(head != null) {

			// 노드가 1개인 경우 
			if(head.next == null) {
				removeFirst();
			}

			// 노드가 2개 이상일 경우 
			else {
				Node<E> ptr = head; // 스캔중인 노드
				Node<E> pre = head; // 스캔중인 노드의 앞 노드 

				while(ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null; // 원래는 pre.next == ptr 인데 pre가 꼬리노드가 되기 위해서 ptr의 값을 null로 만듦
				crnt = pre;
			}
		}
	}
	
	// 노드 p 삭제 
	public void remove(Node p) {
		if(head != null) {
			if(head == p) {
				removeFirst();
			}
			else {
				Node<E> ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) {
						return;
					}
				}
				ptr.next = p.next;
				crnt = ptr;
				
			}
		}
	}
	
	// 선택 노드 삭제 
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	// 모든 노드 삭제
	public void clear() {
		while(head != null) {
			removeFirst();
		}
		crnt = null;
	}
	
	// 선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if(crnt == null || crnt.next == null) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	// 선택 노드를 출력
	public void printCurrentNode() {
		if(crnt == null) {
			System.out.println("선택된 노드가 없습니다.");
		} else {
			System.out.println(crnt.data);
		}
	}
	
	// 모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}

} // LinkedList Class

public class Ex09_01A_LinkedList {
	static Scanner sc = new Scanner(System.in);
	
	// 회원 번호로 순서를 매기는 comparator
	private static class NoOrderComparator implements Comparator<Data> {
		@Override
		public int compare(Data d1, Data d2) {
			return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
		}
	}
	
	
	// 이름으로 순서를 매기는 comparator
	private static class NameOrderComparator implements Comparator<Data> {
		@Override
		public int compare(Data d1, Data d2) {
			return d1.name.compareTo(d2.name);
		}
	}
	
	
	enum Menu {
		
		ADD_FIRST("머리에 노드를 삽입"),
		ADD_LAST("꼬리에 노드를 삽입"),
		RMV_FIRST("머리 노드를 삭제"),
		RMV_LAST("꼬리 노드를 삭제"),
		RMV_CRNT("선택 노드를 삭제"),
		CLEAR("모든 노드를 삭제"),
		SEARCH_NO("번호로 검색"),
		SEARCH_NAME("이름으로 검색"),
		NEXT("선택 노드를 하나 뒤쪽으로 이동"),
		PRINT_CRNT("선택 노드를 출력"),
		DUMP("모든 노드를 출력"),
		TERMINATE("종료");
		
		private final String message;
		
		static Menu MenuAt(int idx) {
			for(Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}
		
		Menu(String string) {
			message = string;
		}
		
		String getMessage() {
			return message;
		}
	} // Menu
	
	static Menu SelectMenu() {
		int key;
		do {
			for(Menu m : Menu.values()) {
				System.out.printf("(%d) %s   ", m.ordinal() + 1, m.getMessage());
				if((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal()) {
					System.out.println();
				}
			}
			System.out.print(" : ");
			key = sc.nextInt() - 1;
		} while(key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}
	
	static class Data {
		static final int NO = 1;
		static final int NAME = 2;
		
		private Integer no;
		private String name;
		
		public String toString() {
			return "(" + no + ") " + name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide + "할 데이터를 입력하세요.");
			
			if((sw & NO) == NO) {
				System.out.print("번호 : ");
				no = sc.nextInt();
			}
			if((sw & NAME) == NAME) {
				System.out.print("이름 : ");
				name = sc.next();
			}
		}
		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
		public static final Comparator<Data> NAME_ORDER = new NoOrderComparator();
	}
	
	public static void main(String[] args) {
		Menu menu;
		Data data;
		Data ptr;
		Data temp = new Data();
		
		LinkedList<Data> list = new LinkedList<>();
		
		do {
			switch(menu = SelectMenu()) {
			case ADD_FIRST:
				data = new Data();
				data.scanData("머리에 삽입", Data.NO | Data.NAME);
				list.addFirst(data);
				break;
			case ADD_LAST:
				data = new Data();
				data.scanData("꼬리에 삽입", Data.NO | Data.NAME);
				list.addLast(data);
				break;
			case RMV_FIRST:
				list.removeFirst();
				break;
			case RMV_LAST :
				list.removeLast();
				break;
			case RMV_CRNT:
				list.removeCurrentNode();
				break;
			case SEARCH_NO:
				temp.scanData("검색", Data.NO);
				ptr = list.search(temp, Data.NO_ORDER);
				if(ptr == null) {
					System.out.println("그 번호의 데이터가 없습니다.");
				} else {
					System.out.println("검색 성공 : " + ptr);
				}
				break;
			case SEARCH_NAME:
				temp.scanData("검색", Data.NAME);
				ptr = list.search(temp, Data.NAME_ORDER);
				if(ptr == null) {
					System.out.println("그 이름의 데이터가 없습니다.");
				} else {
					System.out.println("검색 성공 : " + ptr);
				}
				break;
			case NEXT:
				list.next();
				break;
			case PRINT_CRNT:
				list.printCurrentNode();
				break;
			case DUMP:
				list.dump();
				break;
			case CLEAR:
				list.clear();
				break;
			default:
				break;
			}
		} while(menu != Menu.TERMINATE);
		
	}
}


























