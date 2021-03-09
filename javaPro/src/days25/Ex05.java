package days25;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		// [  p 689 제네릭 타입 제거 ]
		// ArrayList  list = new ArrayList();
		Box box = new Box();
		 
		
		// p 680 와일드카드(?) 예제
		FruitBox<Fruit> fbox = new FruitBox<>();
		FruitBox<Apple> abox = new FruitBox<>();
		
		//Juicer.makeJuice(fbox);
		//Juicer.makeJuice(abox);
		
		Juicer.<Apple>makeJuice(abox);		
		
		
		// p 684 제네릭 메서드
		// 메서드의 선언부에 제니릭 타입이 선언된 메서드
		
		System.out.println("END");

	}
	
	/*
	public <T> void test(T a) {
		System.out.println(a);
	}
	*/

}
// 제네릭 클래스 선언  : Box 제네릭 클래스 부모클래스
class FruitBox<T extends Fruit> extends Box<T>{
	
}
class Juice{
	
}
class Juicer{
	// 제네릭 메서드로 변환
	/*
	static   Juice makeJuice(FruitBox<? extends Fruit> box) {
		//
		return new Juice();
	}
	*/
	// 제네릭 메서드 형식
	static <T extends Fruit>  Juice makeJuice(FruitBox<T> box) {
		//
		return new Juice();
	}
}









//