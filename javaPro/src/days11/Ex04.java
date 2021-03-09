package days11;

public class Ex04 {

	public static void main(String[] args) {
		
		char ch = 'x';
		
		char result =  toUpperCase(ch);
		System.out.println(result);
		
		
		System.out.println( Character.toUpperCase('c')  );
		System.out.println( Character.toLowerCase('A')  );
	}

	private static char toUpperCase(char ch) {
		if( 'a' <= ch && ch <= 'z' )  return (char) (ch -32);
		return ch;
	}

}
//









//