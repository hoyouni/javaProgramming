package days21;

import java.util.Objects;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex12.java
 * java.util.Objects 클래스
 * 유용한 클래스 패키지 
 */
public class Ex12 {
	
	@SuppressWarnings("unused")
	private String name;

	public void setName(String name) {
		
		if(Objects.isNull(name)) throw new NullPointerException("name must not be null.");
		
		this.name = name;
	}
	
	public static void main(String[] args) {
		Ex12 obj = new Ex12();
		String name = null;
		obj.setName(name);
		
		
		// array(배열) int[] m = new int[10];
		// Arrays 클래스 : 배열 사용하기 쉽도록 기능을 가지고 있는 배열의 보조 클래스 
		// Object 클래스의 보조 클래스 : Objects 클래스
		
		// 1. null 체크 / null 이 아닌지 체크
		/*
		Student s = null;
		if(Objects.nonNull(s)) {
			s.name = "홍길동";
			System.out.println(s.name);
		}
		System.out.println("end");
		*/
		
		// 2. 
		
	}
}
