package days22;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		ArrayList  list = new ArrayList();
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		 */
		
		
		// Vector
		// 1. List
		// 2. ArrayList 기능 동일
		// 3. 동기화 처리  O
		
		
		Vector<Student> list = new Vector<Student>();
		list.add(new Student(1, "정영진"));
		list.add(new Student(2, "이영재"));		
		list.add(1, new Student(3, "여원경") );
		
		
		// 검색
		// list.indexOf(o)
		// list.contains(o)
		// list.remove(index)
		// list.remove(o)
		// list.clear();

		
		//Student s = list.elementAt(1);
		//Student s = list.get(1);
		//System.out.println(s);

		
		// 반복자 -                           "fail fast"
		// 열거자
		
		Enumeration<Student> er = list.elements();
		while (er.hasMoreElements()) {
			Student s = er.nextElement();
			System.out.println(  s );
		}

		// list.firstElement();	==	list.get(0);
		// list.lastElement()     ==   list.get(  list.size()-1  );		
		// list.insertElementAt(obj, index); ==		list.add(index, obj);		
		// list.removeElementAt(index);  == list.remove(index)		
		// list.set(index, element); ==	list.setElementAt(obj, index);



		// 모든 학생 정보 출력... ( iterator 사용 )
		/*
		System.out.println( list.capacity() );  // 10
		list.trimToSize();
		System.out.println( list.capacity() );  // 3
		int minCapacity = 5;  // 최소 용량
		list.ensureCapacity(minCapacity);
		System.out.println( list.capacity() );  // 6
		 */
		/*
		Iterator<Student> ir =  list.iterator();
		while (ir.hasNext()) {
			Student s = ir.next();
			System.out.println( s );
		}
		 */

	}

}


class Student{
	int sno;         // 학번
	String name;  // 학생명
	Student(int sno, String name){
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student ) {
			Student s = (Student)obj;
			if( s.sno == this.sno ) 
				return true;
		}
		return false;
	}
	@Override
	public String toString() {		
		return String.format("학번:%d, 학생명:%s",  sno, name);
	}

}

//