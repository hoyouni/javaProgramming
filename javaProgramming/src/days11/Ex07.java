package days11;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		// ����ȯ
		// String -> byte, int, long, float, double , byte �� ����ȯ
		// Integer.parseInt(String)
		//byte, int, long, float, double , byte -> String
		// 0 +""  ->    "0"
		
		// char -> int
		// int -> char       () cast ������
		
		// String -> char []
		String name = "kenik";
		char [] names = name.toCharArray();
		/*
		char [] names = new char[name.length()];
		for (int i = 0; i < names.length; i++) {
			names[i] = name.charAt(i);
		}
		*/
		System.out.println( Arrays.toString(names) );
		// char [] -> String  ( �ϱ� )
		String s = new String(names);  
		System.out.println(s);

	}

}
//









//