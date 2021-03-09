package recursion;

// recursive thinking 순환적 사고
// 수학함수 뿐 아니라 다른 많은 문제들을 recursion으로 해결할 수 있다.
// 문자열 길이 구하기 
public class Ex07 {
	public static void main(String[] args) {
		int result = length("hello");
		System.out.println(result);
	}
	
	public static int length(String str) {
		if(str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
			// 1 + length("ello")
			// 1 + 1 + length("llo")
			// 1 + 1 + 1 + length("lo")
			// 1 + 1 + 1 + 1 + length("o")
			// 1 + 1 + 1 + 1 + 1 + length("")
			// 1 + 1 + 1 + 1 + 1 + 0
		}
	}
}
