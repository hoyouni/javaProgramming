package days21;


import java.util.StringTokenizer;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex09.java
 * StringTokenizer
 */
public class Ex09 {
	public static void main(String[] args) {
		String data = "홍길동,김길동,박길동,최길동";
		@SuppressWarnings("unused")
		String[] datas = data.split(","); // 웬만하면 split으로 자르기 
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while (st.hasMoreElements()) { // true | false 
			String name = (String) st.nextElement();  
			System.out.println(name);
		}
		
	}
}
