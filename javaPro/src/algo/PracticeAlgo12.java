package algo;

import java.util.Stack;

public class PracticeAlgo12 {
	public static int solution(String arrangement) {
        Stack<String> st = new Stack<String>();
        for(int i = 0; i < arrangement.length(); i++) {
        	st.push(arrangement.substring(i, i + 1));
        }
        System.out.println(st);
        
        Stack<String> st2 = new Stack<String>();
        
        for(int i = 0; i < st.size(); i++) {
        	String first = st.get(i);
        	String second = st.get(i + 1);
        	if((first + second).equals("()")) {
        		st.remove(st.indexOf(first));
        		st.remove(st.indexOf(second));
        	}
        }
        System.out.println(st);
        
        /* 레이저 갯수 
        while(!st.isEmpty()) {
        	String first = st.pop();
        	String second = st.pop();
        	if((second + first).equals("()")) {
        		st2.push(second);
        		st2.push(first);
        	}
        	else {
        		st.push(second);
        		
        	}
        }
        System.out.println(st2);
        */
        
		return -1;
    }
	
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		int result = solution(arrangement);
		System.out.println(result);
	}
}
