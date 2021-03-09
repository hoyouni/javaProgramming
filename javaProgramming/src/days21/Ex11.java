package days21;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex11.java
 */
public class Ex11 {
	//public static void disp(Object obj) {
	//	System.out.println(obj);
	//}
	
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? "  + (i == i2));
		System.out.println("i.equals(i2) ? "  + i.equals(i2));
		System.out.println("i.compareTo(i2) ? "  + i.compareTo(i2));
		System.out.println("i.toString() ? "  + i.toString());
		
		System.out.println("MAX_VALUE "  + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE "  + Integer.MIN_VALUE);
		System.out.println("SIZE=  "  + Integer.SIZE + "bits");
		System.out.println("BYTES=  "  + Integer.BYTES + "bytes");
		System.out.println("TYPE=  "  + Integer.TYPE);
		
		
		
		
		// wrapper 클래스
		// 기본형 -> 클래스
		
		// wrapperclass 와  기본형과의 관계
		// Boxing, unBoxing ?
		//disp(new Date());
		//disp(100);
		//disp(true);
		
		// int i = 100; // 기본형 int
		// Integer j = new Integer("200"); // Integer wrapper class
		
		// int k = i + j;
		// System.out.println(k);
		// Integer k = i + j;
		// System.out.println(k);
		
	}
}
