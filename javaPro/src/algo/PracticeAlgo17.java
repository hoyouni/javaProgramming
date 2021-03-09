package algo;

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

class MusicDTO {
	private String musicGenre;
	private int musicPlay;
	public String getMusicGenre() {
		return musicGenre;
	}
	public void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	public int getMusicPlay() {
		return musicPlay;
	}
	public void setMusicPlay(int musicPlay) {
		this.musicPlay = musicPlay;
	}
	@Override
	public String toString() {
		return musicGenre + " " + musicPlay;
	}
}

public class PracticeAlgo17 {
	public static int[] solution(String[] genres, int[] plays) {
		Set<String> genre = new HashSet<String>();
		for(int i = 0; i < genres.length; i++) {
			genre.add(genres[i]);
		}
		List<String> genreName = new ArrayList<String>();
		Iterator<String> ir = genre.iterator();
		while(ir.hasNext()) {
			String genreNames = ir.next();
			genreName.add(genreNames);
		}

		//
		MusicDTO dto = null;

		List<MusicDTO> list = new ArrayList<MusicDTO>();

		for(int i = 0; i < genres.length; i++) {
			dto = new MusicDTO();
			dto.setMusicGenre(genres[i]);
			dto.setMusicPlay(plays[i]);
			list.add(dto);
		}

		//
		Map<Integer, MusicDTO> musicMap = new HashMap<Integer, MusicDTO>();
		for(int i = 0; i < list.size(); i++) {
			musicMap.put(i, list.get(i));
		}

		System.out.println("musicMap : " + musicMap);

		//
		List<Integer> playsCnt = new ArrayList<Integer>();
		for(int i = 0; i < genreName.size(); i++) {
			playsCnt.add(0);
		}

		Iterator<Entry<Integer, MusicDTO>> musicIr = musicMap.entrySet().iterator();
		while(musicIr.hasNext()) {
			Entry<Integer, MusicDTO> entry = musicIr.next();
			int musicBno = entry.getKey();
			dto = entry.getValue();
		}

		int cnt = 0;
		int index = 0;
		while(index < genreName.size()) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getMusicGenre().equals(genreName.get(index))) {
					cnt += list.get(i).getMusicPlay();
					playsCnt.set(index, cnt);
				}
			}
			cnt = 0;
			index++;
		}
		System.out.println("genreName : " + genreName);
		System.out.println("playsCnt : " +playsCnt);

		//
		Map<String, Integer> genrePlayCnt = new HashMap<String, Integer>();
		for(int i = 0; i < playsCnt.size(); i++) {
			genrePlayCnt.put(genreName.get(i), playsCnt.get(i));
		}

		List<Map.Entry<String, Integer>> list2 = new LinkedList<>(genrePlayCnt.entrySet());

		Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				int comparision = (o1.getValue() - o2.getValue()) * -1;
				return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
			}
		});

		//
		Map<String, Integer> genrePlaysCnt = new LinkedHashMap<>(); 
		for(Iterator<Map.Entry<String, Integer>> iter = list2.iterator(); iter.hasNext();){
			Map.Entry<String, Integer> entry = iter.next();
			genrePlaysCnt.put(entry.getKey(), entry.getValue());
		}
		System.out.println("SortGenrePlayCnt : " + genrePlaysCnt);

		//
		Iterator<Entry<String, Integer>> ir3 = genrePlaysCnt.entrySet().iterator();
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < genreName.size() *2; i++) {
			result.add(0);
		}
		while(ir3.hasNext()) {
			Entry<String, Integer> entry3 = ir3.next();
			for(int i = 0; i < list.size(); i++) {
				if(entry3.getKey().equals(list.get(i).getMusicGenre())) {
					
				}
			}
		}
		

		return null;
	}

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] result = solution(genres, plays);
		System.out.println(Arrays.toString(result));
	}
}

















