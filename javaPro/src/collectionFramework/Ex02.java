package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

// Set ? 수학에서 사용되는 '집합' 과 동일한 의미, 순서를 갖고있지 않다.
public class Ex02 {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		HashSet<Integer> B = new HashSet<Integer>();
		HashSet<Integer> C = new HashSet<Integer>();
		
		A.add(1);
		A.add(2);
		A.add(3);
		
		B.add(3);
		B.add(4);
		B.add(5);
		
		C.add(1);
		C.add(2);
		
		// containsAll : 부분집합과 동일
		System.out.println(A.containsAll(B)); // false
		System.out.println(A.containsAll(C)); // true
		
		// addAll : 합집합과 동일
		//A.addAll(B);
		
		// retainAll : 교집합과 동일
		//A.retainAll(B);
		
		// removeAll : 차집합과 동일
		//A.removeAll(B);
		
		Iterator<Integer> ir = A.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}































