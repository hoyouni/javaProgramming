package days24;

import java.util.HashMap;

public class Ex06 {

	public static void main(String[] args) {
		// p 650 		
		String [] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < data.length; i++) {
			String key = data[i];
			if( hm.containsKey(key) ) {
				int value = hm.get(key);
				value++;
				hm.put(key, value);
				//hm.put( , 1++);
			}else {
				//  hm.put( , 1);
			}
		}
		
		/*
		// 0행 대문자
		// 1행 소문자
		int [][] alphabets = new int[2][26];
		
		for (int i = 0; i < data.length; i++) {
			
			char one = data[i].charAt(0);
			alphabets[ Character.isUpperCase(one )?0:1][Character.isUpperCase(one )?one-65:one-97]++;
		
		}
		*/
		System.out.println(" END ");

	}

}
//









//