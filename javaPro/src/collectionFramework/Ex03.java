package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

// Iterator
public class Ex03 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		
		Iterator<Integer> ir = h1.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}





























