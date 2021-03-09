package collectionFramework;

import java.util.HashMap;
import java.util.Scanner;

// HashMap 예제
// id와password를 키와 값의 쌍으로 저장하고 입력된 id를 키로 HashMap에서 검색해서 얻은 값을 입력된 비밀번호와 비교하는 예제
// 키가 중복될 경우 덮어 씌여 나중에 쓰인 키와 값이 담긴다.
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password 를 입력해주세요. ");
			System.out.println("id : ");
			String id = s.nextLine().trim();
			System.out.println("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요. ");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
}



















