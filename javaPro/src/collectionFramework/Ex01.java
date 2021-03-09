package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// List 와 Set의 차이점
// List는 데이터의 중복을 허용하고 Set은 중복을 허용하지 않음.
public class Ex01 {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>(); // 1 2 3
		//ArrayList<Integer> A = new ArrayList<Integer>(); // 1 2 2 2 3
		
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
	
		Iterator<Integer> ir = A.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
		
	}
}







