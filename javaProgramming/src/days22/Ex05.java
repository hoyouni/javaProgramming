package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		// ( 기억 )
		// int []  -> ArrayList 변환
		// ArrayList<E> -> int[] 변환
		
		
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer [] m = new Integer[list.size()];
		list.toArray(m);
		*/
		
		
		//int [] m = { 3,1,5,4,2 };
		// T   Type
		// List<T> Arrays.asList(T...  a)   제네릭
		// T...  a ==  int... a 가변인자 == 배열
		// 제네릭 < T >   참조타입
		// List<int> list = Arrays.asList(m);
		//List<int[]> list = Arrays.asList(m);
		/*
		Integer [] m = { 3,1,5,4,2 };
		List<Integer> list = Arrays.asList(m);
		// ArrayList 타입으로 변환
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		*/
		
		// 두 번째 방법
		// Collections.addAll(c, elements)
		
		// 세 번째 방법
		int [] m = { 3,1,5,4,2 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < m.length; i++) {
			list.add(m[i]);
		}
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		int[] m2 = new int[list1.size()];
		
		for(int i = 0; i < m2.length; i++) {
			m2[i] = list1.get(i).intValue();
		}
		
		System.out.println(Arrays.toString(m2));
		
		
	}

}
//









//