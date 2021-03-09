package days25;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		// p 676 제한된 지네릭 클래스 : <T extends Fruit & Eating > 의미
		//Box2<Integer> b1 = new Box2<Integer>();
		//Box2<String> b2 = new Box2<>(); // JDK 1.7 ~
		
		// Box2 제네릭 클래스의 T 타입변수는 Fruit 클래스~~ 자식 클래스만 
		

	}

}
//
interface Eating {}
class Box2<T extends Fruit & Eating >{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i); }
	public String toString()  { return list.toString(); }
}









//