package algo;

import java.util.Stack;

// 스택(Stack)
// FILO : 가장 먼저 들어온 데이터가 가장 나중에 추출
public class Ex06 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(7); // 7
		s.push(5); // 5 7
		s.push(4); // 4 5 7
		s.pop(); // 5 7
		s.push(6); // 6 5 7
		s.pop(); // 5 7
		
		System.out.println(s);
	}
}





























