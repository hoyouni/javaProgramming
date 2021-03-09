package doItAlgo;

import java.util.Scanner;

public class Ex04_01A_Stack2 {
	static class StackS {
		private int max; // 스택 용량
		private int ptr; // 스택 포인터
		private int[] stk; // 스택 본체

		public StackS() {
			ptr = 0;
			max = 10;
			try {
				stk = new int[max];
			} catch (OutOfMemoryError e) {
				max = 0;
			}
		}

		public int push(int x) {
			if(ptr >= max) {
				System.out.println("overflow");
			}
			return stk[ptr++] = x;
		}

		public int pop() {
			if(ptr <= 0) {
				System.out.println("underflow");
			}
			return stk[--ptr];
		}

		public int size() {
			return ptr;
		}

		// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
		public void dump() {
			if(ptr <= 0) {
				System.out.println("underflow");
			}
			else {
				for(int i = 0; i < ptr; i++) {
					System.out.print(stk[i] + " ");
				}
				//System.out.print(" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackS s = new StackS(); // 최대 10개 push 가능한 스택

		int cnt = sc.nextInt(); // 데이터 입력 횟수

		boolean flag = true;
		while(flag) {
			int menu = sc.nextInt();

			int data;
			switch (menu) {
			case 0:
				data = sc.nextInt();
				try {
					s.push(data);
					int result = s.size();
					if(result == cnt) {
						s.dump();
						System.exit(-1);
					}
				} catch (Exception e) {
					flag = false;
				}
				break;
			case 1:
				try {
					data = s.pop();
				} catch (Exception e) {
					//flag = false;
					if(menu == 2) {
						System.exit(-1);
					}
					menu = 1;
					
				}
				break;
			default:
				s.dump();
				System.exit(-1);
				break;
			}

		}
	}
}
































