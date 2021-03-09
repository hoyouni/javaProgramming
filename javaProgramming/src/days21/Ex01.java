package days21;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex01.java
 */
import java.util.Comparator;
import java.util.Objects;

public class Ex01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Point 클래스 - equals() 오버라이딩 x,y 같으면 같다.
		Student s1 = new Student(25, "홍길동");
		Student s2 = new Student(34, "홍길동");
		Student s3 = null;
		
		System.out.println(s1.equals(s2)); // 동일 객체?
		System.out.println(Objects.isNull(s3)); // 빈 값인가 ?
		System.out.println(Objects.compare(s1, s2, new StudentComparator())); // 객체 비교, 같으면 0 , 다르면 -1,1 , compare의 마지막 인자는 객체를 넣어라 
		
	}
} //Ex01


//학생 비교 잣대
@SuppressWarnings("rawtypes")
class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		/*
		if(s1.sno == s2.sno)
			return 0; //같다
		else if(s1.sno > s2.sno)
			return 1;
		else
			return -1;
		*/
		
		return Integer.compare(s1.sno, s2.sno);
	}
	
} // 객체 비교 클래스



class Student {
	int sno;
	String name;
	
	public Student() {}
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			if(s.sno == this.sno) {
				return true;
			}
		}
	
		return false;
	}
	
	
	
} //Student