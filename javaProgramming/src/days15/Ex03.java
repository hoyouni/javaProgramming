package days15;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 19. - 오전 11:20:22
 * @Subject p 233
 */
public class Ex03 {

	public static void main(String[] args) {
		//       클래스의 구성요소 :  멤버=필드+메서드
		// 2.3 객체의 구성요소    :         속성( property ),   기능(function)
		//                                      크기,길이,높이,색상,볼륨,채널 등등
		//                                                                켜기, 끄기, 볼륨, 채널변경 등등

		// p 235 그림( 이해 필요 )
		//int age ;
		//System.out.println(age);
		
		// 배열은 초기화 하지 않아도 각 요소는 int 의 기본값 : 0으로 초기화..
		//int [] m = new int[3];
		//System.out.println(m[0]); // 0
		
		
		TV tv = new TV();
		TV tv2 = new TV();
		
		// (기억) 객체를 생성 후 초기화 하지 않았을 경우 필드 초기값 
		System.out.println( tv.channel );
		System.out.println( tv.color );
		System.out.println( tv.power );
		
		
	} 
}  // class

// The public type TV must be defined in its own file
class TV{
	// fields
	/*
	String color;            // null
	boolean power;      // false
	int channel;            // 0
	int [] m;                 // null 
	*/

	String color = null;            // null
	boolean power = false;      // false
	int channel = 0;            // 0
	int [] m = null;                 // null
	
	// method
	void power() {     power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--;}
}

//









//