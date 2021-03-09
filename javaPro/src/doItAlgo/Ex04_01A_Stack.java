package doItAlgo;

import java.util.Scanner;
import java.util.Stack;

import doItAlgo.IntStack.EmptyIntStackException;
import doItAlgo.IntStack.OverflowIntStackException;

// int 형 스택 구현 
class IntStack {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체
	
	// 스택 비어있을 때 
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			
		}
	}
	
	// 스택이 넘쳤을 때
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			
		}
	}
	
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 스택에 x 를 push
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	// 스택에서 꼭대기의 데이터를 pop
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	
	// 스택에서 꼭대기에 있는 데이터를 보는 메소드
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0 ) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	// 스택에서 x를 찾아 인덱스를 반환 (없으면 -1)
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	// 스택의 용량을 확인
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		if(ptr <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		}
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}

public class Ex04_01A_Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64); // 최대 64개 push 가능한 스택
		
		while(true) {
			System.out.println("현재 데이터 수  : " + s.size() + " / " + s.capacity());
			System.out.println("---메뉴를 선택하시오.---");
			System.out.print("(1)push\n(2)pop\n(3)peek\n(4)dump\n(5)end");
			System.out.println();
			
			int menu = sc.nextInt();
			if(menu == 5) {
				System.exit(-1);
			}
			
			int data;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				data = sc.nextInt();
				try {
					s.push(data);
				} catch (OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					data = s.pop();
					System.out.println("pop한 데이터는 " + data + " 입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
			case 3:
				try {
					data = s.peek();
					System.out.println("peek한 데이터는 " + data + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
			case 4: 
					s.dump();
			default:
				break;
			}
			
		}
	}
}
































