package days22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<Integer>(200000);
		LinkedList<Integer> ll = new LinkedList<Integer>(); 
		System.out.println("1. 순차적으로 추가하기 ...");
		System.out.println("ArrayList : " + add1(al)+"ns");
		System.out.println("LinkedList : " + add1(ll)+"ns");
		// 
		System.out.println("2. 중간에  추가하기 ...");
		System.out.println("ArrayList : " + add2(al)+"ns");
		System.out.println("LinkedList : " + add2(ll)+"ns");

	}

	private static long add1(List<Integer> list) {
		// 처리 시간 long형으로 반환
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		long end = System.nanoTime();
		return end-start ;
	}
	
	private static long add2(List<Integer> list) {
		// 처리 시간 long형으로 반환
		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list.add(500, 50); // 
		}
		long end = System.nanoTime();
		return end-start ;
	}

}
//









//