package days24;

import java.util.TreeSet;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 30. - 오전 10:10:52
 * @Subject p 642 예제 11-27
 *                    TreeSet :   정렬, 검색, 부분 검색 성능 빠르지 설명.. 이해... 
 */
public class Ex03 {

	public static void main(String[] args) {
		String [] data = {
				"abc","alien","bat", "car", "Car", 
				"disc","dance", "dZZZZ", "dzzzz", "elephant"
				,"elevator", "fan", "flower"
		};
		TreeSet<String> set  = new TreeSet<String>();
		for (int i = 0; i < data.length; i++)			set.add(data[i]);
		
		System.out.println(set);
		//
		String from = "b";
		String to = "d";
		
		System.out.println(set.subSet(from, to ));
		System.out.println(set.subSet(from, to+"zzzz" ));
		
		

	}

}
//









//