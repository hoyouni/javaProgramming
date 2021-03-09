package recursion;

// 문자열 뒤집어서 출력
public class Ex09 {
	public static void main(String[] args) {
		printCharsReverse("hello");
	}
	
	public static void printCharsReverse(String str) {
		if(str.length() == 0) {
			return;
		} else {
			System.out.println(str.substring(str.length() - 1, str.length()));
			printCharsReverse(str.substring(0, str.length() - 1));
		}
	}
}
