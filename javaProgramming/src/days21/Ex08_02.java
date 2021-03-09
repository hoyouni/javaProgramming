package days21;
/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex08.java
 * StringBuffer : 동기화 처리 O , StringBuilder : 동기화 처리 X
 * 스레드 수업 : 동기화 X, 그 외 기능은 같다.
 */
public class Ex08_02 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
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
