package days21;
/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex04.java
 */
public class Ex04 {
	public static void main(String[] args) {
		String dir = "C:\\class\\javaClass\\javaPro\\src\\days21";
		//String fileName = "Ex01.java";
		
		//파일 열기 (읽기) : 전체 경로가 필요함
		//dir 문자열의 마지막 문자 \\
		//dir 문자열의 마지막 문자 \\ 가 아니면 \\붙여서 + fileName
		//String path = dir.concat(fileName);
		
		// 1. dir 에서 제일 마지막 문자 하나 얻어오기 : dir.charAt(dir.length-1);
		// 2. dir.substring();
		System.out.println(dir.startsWith("C:")); // 해당 문자열로 시작하는가 true false
		System.out.println(dir.endsWith("\\")); // 해당 문자열로 끝나는가 true false
		
	}
}
