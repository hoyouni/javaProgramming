package days21;


import java.util.Random;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex13.java
 */
public class Ex13 {
	public static void main(String[] args) {
		// 0.0 <= Math.random(); < 1.0
		// jdk 1.5 ~ java.util.Random 클래스 
		Random rnd = new Random();
		int n = rnd.nextInt(45) + 1; // 0 <= n < 45
		System.out.println(n);
	}
}
