package days25;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 9. 2. - 오전 7:42:23
 * @Subject  p 670 제네릭 ( Generics )
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. JDK 1.5 도입~
		 *     ( JDK 1.8 도입된 람다식 만큼 큰 변화 )
		 * 2. 지(제)네릭스 ? 다양한 타입의 객체들 다루는 메서드, 컬렉션 클래스에
		 *                       [컴파일 시에 타입체크]를 해주는 기능이다.
		 * 3. 사용 이유 ? 
		 *     ㄱ. 객체의 타입 안정성 높이고 - ( 의도하지 않은 타입의 객체가 저장되는 것을 막는다. )
		 *                                          (형변환 오류 발생하는 것 )
		 *     ㄴ. 형 변환의 번거로움 줄이고  O
		 * 4.                             
		 * */
		
		/*
		Box box = new Box();
		box.setItem(10);
		box.setItem(20);
		box.setItem(true);
		box.setItem('c');
		box.setItem(new 클래스명());
		// 형변환.... 
		*/
		// 
		Box<Integer> box = new Box();
		//box.setItem(item);
		

	}

}

// 자료형 item
// 제네릭 클래스 
// Box<T>에서  T == 타입변수  [T]ype
//       E                  [E]lement
//        K                Key
//        V                Value

//      Box<T> 제네릭클래스,    T의 Box
//     Box         원시 타입
//     T             타입변수
/*
class Box<T>{
    T item;

	public  T getItem() {
		return item;
	}

	public void setItem( T item) {
		this.item = item;
	}
}
*/
/*
class Box{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
*/

/*
class Box{
	boolean item;

	public boolean getItem() {
		return item;
	}

	public void setItem(boolean item) {
		this.item = item;
	}
	
}
*/
/*
class Box{
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}
*/
// 이영재 ( 오후 출석 예정 )
// 김예주 ( 09:29 ), 김혜빈 (지각) 
// 김호연 ( 8/30 오후 조퇴 ~  9/4 오후 출석 예정 )





