package days23;

import java.util.Stack;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 29. - 오전 10:23:18
 * @Subject p 610 예제 11-10
 */
public class Ex04 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("~~~");
			System.exit(-1);
		}
		
		//  LIFO
		Stack<String> st = new Stack<String>();
		String expression = args[0]; //   ((2+3)*1
		System.out.println("expression : " + expression);
		
		for (int i = 0; i < expression.length(); i++) {
			   char ch = expression.charAt(i);
			   if(ch=='(') 
				   st.push(ch+"");
			   else if ( ch == ')' ) 
				   st.pop();
			   
		}
		
		if( st.empty() )
			System.out.println(" 괄호 일치한다.");
		else 
			System.out.println(" 괄호가 일치하지 않는다.");

	}

}
//









//