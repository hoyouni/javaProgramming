package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList api_1
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40);
			numbers.add(1, 50);
			numbers.remove(2);
			numbers.get(2); // 30
			numbers.size(); // 4
			System.out.println(numbers);
			// 10 50 30 40
			Iterator<Integer> ir = numbers.iterator();
			while(ir.hasNext()) {
				System.out.println(ir.next());
			}
	}
}
































