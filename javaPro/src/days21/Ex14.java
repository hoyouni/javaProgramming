package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex14.java
 */
public class Ex14 {
	public static void main(String[] args) {
		// 정규식 == 정규 표현식 == Regular Expression == RegEx
		// 문자열 중에 어떤 패턴 (pattern) 과 일치하는 문자열을 찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한 문자열
		// java : java.util.regex 패키지 안에 클래스가 있다.
		// 		ㄱ. Matcher 클래스 
		// 		ㄴ. Pattern 클래스

		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.",
				"c0", "car", "combat", "count", "date", "disc"};

		// 소문자 c 로 끝나는 단어를 모두 찾아서 출력 
		String regex = "[a-zA-Z]*c";
		//						cZ* 0~ 여러개
		Pattern pattern = Pattern.compile(regex);

		for(int i = 0; i < data.length; i++) {
			Matcher m = pattern.matcher(data[i]);

			if(m.matches()) {
				System.out.print(data[i] + " ");
				
			}
		}
		System.out.println("\n\n End");
	}
}














