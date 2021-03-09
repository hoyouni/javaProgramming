package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

// 1.List -  ArrayList
public class Ex07 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);

		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		
		System.out.printf("%s, %s\n", list1, list2);
		
		list2.set(3, "AA");
		System.out.printf("%s, %s\n", list1, list2);

		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		System.out.printf("%s, %s\n", list1, list2);
		
		// 변수 i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해 나머지 요소들이 자리이동을 하기 때문에
		// 올바른 결과를 얻을 수 없다. 
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		System.out.printf("%s, %s\n", list1, list2);
		
		
		
		
	}
}


























