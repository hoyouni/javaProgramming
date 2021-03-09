package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class MusicDTO {
	String musicGenre;
	int musicPlays;

	public String getMusicGenre() {
		return musicGenre;
	}
	public void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	public int getMusicPlays() {
		return musicPlays;
	}
	public void setMusicPlays(int musicPlays) {
		this.musicPlays = musicPlays;
	}
	@Override
	public String toString() {

		return musicGenre + " " + musicPlays;
	}

}

class ValueComparator implements Comparator<String> {
	Map<String, Integer> base;
	public ValueComparator(Map<String, Integer> base) {
		this.base = base;
	}
	public int compare(String a, String b) {
		if(base.get(a) >= base.get(b)) {
			return -1;
		} else {
			return 1;
		}
	}
}

class ValueComparator2 implements Comparator<Integer> {
	Map<Integer, Integer> base;
	public ValueComparator2(Map<Integer, Integer>  base) {
		this.base = base;
	}
	public int compare(Integer a, Integer b) {
		if(base.get(a) >= base.get(b)) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class Programmers_Lv3_BestAlbum {

	public int[] solution(String[] genres, int[] plays) {
		Set<String> genre1 = new HashSet<String>();
		for(int i = 0; i < genres.length; i++) {
			genre1.add(genres[i]);
		}

		List<String> genre = new ArrayList<String>();
		Iterator<String> ir1 = genre1.iterator();
		while(ir1.hasNext()) {
			genre.add(ir1.next());
		}
		System.out.println("genre : " + genre);

		List<MusicDTO> list = new ArrayList<MusicDTO>();

		MusicDTO dto;
		for(int i = 0; i < genres.length; i++) {
			dto = new MusicDTO();
			dto.setMusicGenre(genres[i]);
			dto.setMusicPlays(plays[i]);
			list.add(dto);
		}

		System.out.println("list : " + list);

		Map<Integer, MusicDTO> map = new HashMap<Integer, MusicDTO>();
		for(int i = 0; i < list.size(); i++) {
			map.put(i, list.get(i));
		}
		System.out.println("map : " + map);

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		for(int i = 0; i < genre.size(); i++) {
			int genreCount = 0;
			for(int j = 0; j < list.size(); j++) {
				if(genre.get(i).equals(list.get(j).getMusicGenre())) {
					genreCount = genreCount + list.get(j).getMusicPlays();
				}
			}
			map2.put(genre.get(i), genreCount);
		}
		ValueComparator bvc = new ValueComparator(map2);

		//System.out.println("map2 : " + map2);

		List<String> list2 = new ArrayList<String>();
		Set<Entry<String, Integer>> set3 = map2.entrySet();
		Iterator<Entry<String, Integer>> ir3 = set3.iterator();
		while(ir3.hasNext()) {
			String first = ir3.next().getKey();
			list2.add(first);
		}
		System.out.println("list2 : " + list2);

		//Map<Integer, Map> result;

		Set<Entry<Integer, MusicDTO>> set4 = map.entrySet();
		Iterator<Entry<Integer, MusicDTO>> ir4;

		Map<Integer, Entry<Integer, MusicDTO>> result = new TreeMap<Integer, Map.Entry<Integer,MusicDTO>>();
		Map<Integer, Integer> result2 = new TreeMap<Integer, Integer>();
		List<Integer> realResult = new ArrayList<Integer>();
		for(int i = 0; i < list2.size(); i++) {
			ir4 = set4.iterator();
			int cnt = 0;
			while(ir4.hasNext()) {
				Entry<Integer, MusicDTO> goods = ir4.next();
				if(list2.get(i).equals(goods.getValue().getMusicGenre())) {
					result.put(cnt, goods);
					cnt++;
				}

			}
			//System.out.println(result);

			Set<Entry<Integer, Entry<Integer, MusicDTO>>> set5 = result.entrySet();
			Iterator<Entry<Integer, Entry<Integer, MusicDTO>>> ir5;
			List<MusicDTO> lastList = new ArrayList<MusicDTO>();

			ir5 = set5.iterator();
			while(ir5.hasNext()) {
				lastList.add(ir5.next().getValue().getValue());
			}

			
			Collections.sort(lastList, new Comparator<MusicDTO>() {
				@Override
				public int compare(MusicDTO o1, MusicDTO o2) {
					if(o1.getMusicPlays() >= o2.getMusicPlays()) {
						return 1;
					}
					return -1;
				}
			});
			System.out.println("lastList : " + lastList);

			Iterator<Entry<Integer, Entry<Integer, MusicDTO>>> ir6;

			ir6 = set5.iterator();
			int cnt2 = 0;
			while(ir6.hasNext()) {
				result2.put(ir6.next().getValue().getKey(), lastList.get(cnt2).getMusicPlays());
				cnt2++;
			}

			//ValueComparator2 v = new ValueComparator2(result2);
			System.out.println("result2 : " + result2);

			Set<Entry<Integer, Integer>> set7 = result2.entrySet();
			Iterator<Entry<Integer, Integer>> ir7 = set7.iterator();

			while(ir7.hasNext()) {
				if(result2.size() == 1) {
					realResult.add(ir7.next().getKey());
					break;
				} else {
					for(int k = 0; k < 2; k++) {
						realResult.add(ir7.next().getKey());
					}
					break;
				}
			}


			result.clear();
			result2.clear();
			lastList.clear();

		}

		int[] realrealResult = new int[realResult.size()];
		for(int i = 0; i < realResult.size(); i++) {
			realrealResult[i] = realResult.get(i);
		}

		System.out.println(Arrays.toString(realrealResult));

		return null;
	}

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		Programmers_Lv3_BestAlbum p = new Programmers_Lv3_BestAlbum();

		int[] result = p.solution(genres, plays);
		System.out.println(Arrays.toString(result));
	}
}




































