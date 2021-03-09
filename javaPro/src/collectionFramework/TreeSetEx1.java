package collectionFramework;

import java.util.TreeSet;

// 범위 검색 예제
public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("범위 검색  from : " + from + ", to : " + to);
		System.out.println("결과 1 : " + set.subSet(from, to));
		System.out.println("결과 2 : " + set.subSet(from, to + "zzz"));
		
	}
}


































