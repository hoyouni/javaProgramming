package collectionFramework;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {
	public static String[] solution(String[] record) {
		HashMap<String, String> map = new HashMap<String, String>();
		int count = 0;
		for(int i = 0; i < record.length; i++) {
			if(record[i].contains("Enter")) {
				String[] enterUser = record[i].split(" ");
				map.put(enterUser[1], enterUser[2]);
				count++;
			}
			else if(record[i].contains("Leave")) {
				String[] outUser = record[i].split(" ");
				if(map.containsKey(outUser[1])) {
					count++;
				}
			}
			else if(record[i].contains("Change")) {
				String[] changeUser = record[i].split(" ");
				if(map.containsKey(changeUser[1])) {
					map.put(changeUser[1], changeUser[2]);
					
				}
			}
			
		}

		String[] result = new String[count];
		int index = 0;
		for(int k = 0; k < record.length; k++) {
			String[] temp = record[k].split(" ");
			if(record[k].contains("Enter")) {
				result[index++] = map.get(temp[1]) + "님이 들어왔습니다.";
			} else if(record[k].contains("Leave")) {
				result[index++] = map.get(temp[1]) + "님이 나갔습니다.";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] result = solution(record);
		System.out.println(Arrays.toString(result));
	}
}
