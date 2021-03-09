package days24;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 30. - 오전 7:36:28
 * @Subject p 635~637  
 */
public class Ex01 {

	public static void main(String[] args) {
		// 중복 X , 순서 X
		// 문제제시)  SNO 가 같으면 같은 객체로 인식을 해서 hset 저장 X
		HashSet<Person> hset = new HashSet<Person>();
		Person p1 = new Person(1, "정의호", 26); 
		System.out.println( p1.hashCode() );  // 366712642
		hset.add(p1);		
		
		Person p2 = new Person(1, "정영진", 26);
		System.out.println( p2.hashCode() ); // 1829164700
		hset.add(p2);
		
		Person p3 = new Person(2, "정영진", 26);
		System.out.println( p3.hashCode() ); // 1829164700
		hset.add(p3);
		
		System.out.println(  hset.size() );  // 2
		
		// 출력... 
		
		System.out.println(" END "); 

	}

}

class Person{
	int sno;
	String name;
	int age;
	public Person() {}
	public Person(int sno, String name, int age) {
		this.sno = sno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.sno);
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person) {
			
			Person tmp = (Person)obj;
			return this.sno == tmp.sno;
		}
		return false;
	}

}

// 정의호( 아파서 결석 )
// 정영진( 지각 예정 )
// 김예주( 결석 )
// 김호연 ( 8/30 오후 조퇴 ~  9/4 오후 출석 예정 )


// 정영진( 다음주 월요일 개인 사정 )







//