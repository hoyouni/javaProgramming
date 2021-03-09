package collectionFramework;

import java.util.Arrays;
import java.util.Comparator;

// Comparator 와 Comparable
// Arrays.sort() 는 사실 Character 클래스의 Comparable의 구현에 의해 정렬된 것
// Comparator과 Comparable 은 모두 인터페이스로 컬렉션을 정렬하는데 필요한 메소드를 정의
// Comparable을 구현한 클래스는 정렬이 가능
// Comparable 인터페이스의 compareTo(Object o) 메소드
// 비교하는 두 객체가 같으면 0, 비교하는 값보다 작으면 -1, 비교하는 값 보다 크면 1 리턴
// Comparator 인터페이스의 compare(Object o1, Object o2) 도 같은 기능
// Comparable 을 구현한 클래스들이 기본적으로 오름차순으로 정렬되어 있지만, 내림차순으로 정렬한다던가 
// 다른 기준에 의해서 정렬되도록 하고 싶을때는 Comparator를 구현해 정렬 기준 제공
public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr)); // String 의 Comparable 구현에 의한 정렬
		
		Arrays.sort(strArr, new Descending()); // 역순정렬
		System.out.println(Arrays.toString(strArr));
	}
}

class Descending implements Comparator { // 문자열 내림차순 구현 
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) *  -1;
		}
		return -1;
	}
}




























