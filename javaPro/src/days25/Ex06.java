package days25;

/**
 * @Author k≡n¡k
 * @Source Ex06.java
 * @Date 2019. 9. 2. - 오전 10:40:23
 * @Subject p 691
 */
public class Ex06 {

	public static void main(String[] args) { 
		// 열거형( enums )
		// JDK 1.5 추가.
		/*
		System.out.println(성별.남자);
		if( 성별.남자 ) {
			
		}else {
			
		}
		*/
		/*
		 * 
		 * [열거형 선언 형식 ]
		 * enum 열거형이름 { 상수명1, 상수명2 ... }
		 * 
		 * */

	}

}
// 방향.. 열거형... 
// enum Direction { EAST = 0, SOUTH = 1, WEST=2, NORTH=3 }
enum Direction { 
	
	EAST(1), SOUTH(5), WEST(-1), NORTH(10);
	
	private final int value;  // 상수 필드
	private Direction(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}

class Unit{
	int x, y;
	Direction  dir;  // 자료형   필드명;
	
	void init() {
		this.dir = Direction.EAST;
		switch (this.dir) {
		case EAST:break;
		case SOUTH: break; 
		default:
			break;
		}
	}
}

class Card{
	// 상수 필드 선언..
}

/*
//   0/1   ture/false    'm'  'w'  표준화
class 성별{
	public static int 남자 = 0;
	public static int 여자 = 1;
}
*/

// 클래스 컴파일되어 진다. 
enum 성별{ 남자, 여자  }










//