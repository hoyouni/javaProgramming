package days21;
/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex10.java
 * 기본적인 수학계산과 관련된 유용한 메소드를 가지고 있는 클래스 
 */
public class Ex10 {
	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(Math.E); // 자연로그의 밑
		System.out.println(Math.round(3.141592)); // Math.round() double or float 
		
		// 소수점 2자리 까지 출력하기 (소수점 3번째 자리에서 반올림) 기억해두기
		double pi = Math.PI;
		System.out.println(Math.round(pi * 100) / 100D);
		
		// 절상
		System.out.println(Math.ceil(3.1)); // return double 
		
		// 절삭
		System.out.println(Math.floor(3.9)); // return double
		
		// 부호 변환
		System.out.println(Math.negateExact(-10));
		
	}
}












