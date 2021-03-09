package collectionFramework;

import java.util.TreeSet;

// 지정된 값보다 큰 값과 작은 값의 객체 얻기
public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		System.out.println("50 보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50 보다 큰 값 : " + set.tailSet(new Integer(50)));
		
	}
}
