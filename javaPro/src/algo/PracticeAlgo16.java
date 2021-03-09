package algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticeAlgo16 {
	public static int[] solution(String[] genres, int[] plays) {
		Map<Integer, String> listMap = new LinkedHashMap<>();
		for(int i = 0; i < plays.length; i++) {
			listMap.put(plays[i], genres[i]);
		}
		System.out.println("장르 및 음악 : " + listMap);

		Iterator<Entry<Integer, String>> listIr = listMap.entrySet().iterator();


		Map<Integer, String> genresMap = new HashMap<Integer, String>();
		for(int i = 0; i < genres.length; i++) {
			genresMap.put(i, genres[i]);
		}
		System.out.println("장르 : " + genresMap);

		Map<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < plays.length; i++) {
			playsMap.put(i, plays[i]);
		}
		System.out.println("음악 : " + playsMap);

		Map<Integer, String> musicMap = new HashMap<Integer, String>();
		for(int i = 0; i < listMap.size(); i++) {
			while(listIr.hasNext()) {
				System.out.println(listIr.next().getKey() + ", " + listIr.next().getValue());
				musicMap.put(i, listIr.next().getKey() + " " + listIr.next().getValue());
			}
		}

		System.out.println(musicMap);

		return null;
	}

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] result = solution(genres, plays);
		System.out.println(Arrays.toString(result));
	}
}



























