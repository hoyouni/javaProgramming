package collectionFramework;

import java.util.ArrayList;
import java.util.List;

// ArrayList2
// 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력하는 예제
public class Ex08 {
	public static void main(String[] args) {
		final int LIMIT = 10; // 자르고자 하는 글자 수 
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		System.out.println(length);
		
		// ArrayList 생성할 때 저장할 요소의 개수를 고려해서 실제 저장할 개수보다 약간 여유 있는 크기로 잡을것 
		// 자동적으로 크기가 늘어나지만 그 만큼 처리 시간이 많이 소요된다.
		List list = new ArrayList(length / LIMIT + 10);
		
		for(int i = 0; i < length; i+=LIMIT) {
			if(i + LIMIT < length)
				list.add(source.substring(i, i + LIMIT));
			else
				list.add(source.substring(i));
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}






















