package days23;

import java.util.HashSet;

public class Ex13 {

	public static void main(String[] args) {
		// p 633
		// LinkedHashSet
		// HashSet           + Linked
		// 해싱기법 Set           순서 O
		// 중복X

		// p 634
		HashSet set = new HashSet();
		//set.add(11);
		//set.add(true);
		//set.add(3.14);
		set.add("abc");
		set.add("abc");  // X
		set.add( new Person("홍길동",20));
		set.add( new Person("홍길동",20));
		
	}

}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
//









//