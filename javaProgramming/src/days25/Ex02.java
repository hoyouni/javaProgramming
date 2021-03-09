 package days25;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		// 업캐스팅..
		// Fruit f = new Apple();
		
		
		// p 675 예제 12 - 1
		Box<Fruit> fruitBox = new Box<Fruit>();
		fruitBox.add( new Fruit() );
		fruitBox.add( new Apple() ); // Fruit -> Apple  업캐스팅
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.add( new Apple() );
		// appleBox.add( new Fruit() );  에러
		// appleBox.add( new Toy() );    에러
		
		// 업캐스팅  X ( 기억 ) 
		// Box<Fruit> fruitBox2 = new Box<Apple>(); // X
		

		System.out.println(" END ");
	}

}
//

class Fruit{}
class Apple extends Fruit{}
class Grape extends Fruit{}

class Toy{}

// 제네릭 클래스 선언
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i); }
	public String toString()  { return list.toString(); }
}









//