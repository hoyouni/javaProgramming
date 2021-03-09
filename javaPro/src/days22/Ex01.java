package days22;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 28. - 오전 7:32:22
 * @Subject 
 */
public class Ex01 {

	public static void main(String[] args) {
		// 문1) Integer 클래스의 메소드를 사용하여
		// 10진수  10을                              2진수,8진수,16진수로 출력
		System.out.println( Integer.toBinaryString(10) );
		System.out.println( Integer.toOctalString(10) );
		System.out.println( Integer.toHexString(10) );

		// 문2) Integer 클래스의 메소드를 사용하여
		//	2진수 0000 1010               16진수로 출력
		// 2진수 -> 10진수
		System.out.println( Integer.toHexString(  Integer.valueOf("00001010", 2) ) );		

	}
	
}
// 고승우(학교), 장동환(학교)
// 김호연( 9:10 ~ 11:20 기상), 김예주( 10:01 지각 )
// 이경섭(병원 11:53)






 






//