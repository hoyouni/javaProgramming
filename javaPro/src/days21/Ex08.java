package days21;
/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex08.java
 * StringBuffer : 동기화 처리 O , StringBuilder : 동기화 처리 X
 * 스레드 수업 : 동기화 X, 그 외 기능은 같다.
 */
public class Ex08 {
	public static void main(String[] args) {
		//String data = "abc";
		// ab 문자 사이에 x 추가 
		// "axbc" "xb" 삭제
		// "a" + "b"
		// String 클래스는 추가 수정 삭제 등 어려워 + 불변
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append(true);
		sb.append('x');
		sb.append(3.14);
		
		sb.insert(1, 't');
		sb.replace(1, 3, "TTT");
		sb.delete(1, 4);
		
		sb.reverse();
		
		sb.toString();
		
		System.out.println(sb);
	}
}
