package days24;

import java.util.*; 
import java.util.Map.Entry; 

public class Ex10 {

	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> ir = set.iterator();
		
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
			
		}
		

	}

}
//









//