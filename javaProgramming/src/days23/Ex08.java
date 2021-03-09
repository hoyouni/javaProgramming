package days23;

import java.util.Arrays;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		// p 628 Comparator와 Comparable
		//String [] m = {"a","d","c", "b"};
		Student [] m = {
				new Student(1, "홍길동"),
				new Student(2, "김재우")
		};
		Arrays.sort(m);
		System.out.println(Arrays.toString( m) );
		
	}

}
//
class Student implements Comparable{
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	String name;
	int sno;
	
	@Override
	public int compareTo(Object o) { 
		return 0;
	}
}








//