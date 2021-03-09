package collectionFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// 중복된 값은 저장되지 않는 HashSet의 성질을 이용한 로또번호 생성 예제
public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set); // sort 함수의 인자 값에 list가 들어가야 하기때문에 HashSet에 저장된 객체를 LinkedList에 담아서 처리
		Collections.sort(list); 
		System.out.println(list);
	}
}





























