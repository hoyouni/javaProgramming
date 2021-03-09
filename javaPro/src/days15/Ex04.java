package days15;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 19. - 오전 11:43:53
 * @Subject p 240 2.5 객체 배열
 */
public class Ex04 {

	public static void main(String[] args) {
		// 배열 선언 형식
		// 자료형 [] 배열명 = new 자료형[배열크기];
		// tv 는 배열명이다( 객체명 X )
		// [ 클래스 배열 or 객체 배열 ]
		TV [] tv = new TV[1000];
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new TV();
		}
		for (int i = 0; i < tv.length; i++) {
			tv[i].power();
		}
		// 객체
		// 각 요소는 tv[0] ~ tv[999] = null 초기화
		//  java.lang.NullPointerException
		//tv[0] = new TV();
		//tv[0].power();
		
		
		
		/*
		TV t1 = new TV();
		TV t2 = new TV();
		TV t3 = new TV();
		TV t4 = new TV();
		TV t5 = new TV(); 
		
		TV t1000 =new TV();
		
		// 모든 TV 켜기
		t1.power();
		t2.power();
		t3.power();
		t4.power();
		t5.power();
		
		t1000.power();
		*/
	}

}
//









//