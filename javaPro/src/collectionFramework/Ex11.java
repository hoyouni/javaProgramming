package collectionFramework;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet
 * 1. Set 인터페이스를 구현한 대표적인 컬렉션
 * 2. 중복을 허용하지 않는다.
 * 3. 새로운 요소를 추가할 때는 add 메소드나 addAll 메소드를 사용 
 * 4. 이미 저장되어 잇는 요소와 중복된 요소를 추가하고자 할 때는 false를 반환함으로 추가 실패를 알린다.
 * 5. 저장순서를 유지하지 않기 때문에 저장순서를 유지하고자 할 때는 LinkedHashSet 사용 
 * 6. 내부적으로는 HashMap을 이용해서 만들어짐
 */
public class Ex11 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set); // 중복된 값은 저장되지 않음 
	}
}






















