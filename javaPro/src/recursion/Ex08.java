package recursion;

// 문자열 프린트
public class Ex08 {
	public static void main(String[] args) {
		printChars("hello");
	}
	
	public static void printChars(String str) {
		if(str.length() == 0) {
			return;
		} else {
			System.out.println(str.charAt(0));
			// h
			// e
			// l
			// l
			// o
			printChars(str.substring(1));
			// ello
			// llo
			// lo
			// o
			// ""
		}
	}
}
