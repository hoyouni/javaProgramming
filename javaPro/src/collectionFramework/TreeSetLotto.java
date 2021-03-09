package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

// TreeSet 을 이용한 로또 추출 
public class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		// TreeSet은 데이터를 저장할 때 이미 정렬하기 때문에 따로 sort를 이용해서 정렬할 필요 없음
		System.out.println(set);
	}
}






























