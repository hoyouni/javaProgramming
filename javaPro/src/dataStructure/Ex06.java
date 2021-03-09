package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

// ArrayList vs LinkedList
// 데이터 추가 / 삭제 시에는 LinkedList가 훨씬 빠르다
// ArrayList는 어느 주소로 접근하든 똑같이 빠르게 처리 되어 데이터를 조회 할 수 있음.
// LinkedList는 처음 노드부터 쭉 찾아야하므로 조회시엔 시간 효율이떨어짐.
// ArrayList는 내부적으로 배열의 크기가 지정되어 있다. (한계점이 있다.)
// LinkedList의 경우 메모리가 허용되는 한 무한의 데이터를 추가 할 수 있다. (다량의 데이터 처리 효율 높다)
// Java의 경우 ArrayList 메모리가 다 차면 기존 크기의 2배만큼 키워준다. (Dynamic Array)
// Java의 LinkedList의 경우 양방향 연결리스트 (Doubly LinkedList) 이다.
public class Ex06 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		long t = System.currentTimeMillis();
		a.get(2);
		System.out.println(t * 1000);
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		long j = System.currentTimeMillis();
		l.get(2);
		System.out.println(j * 1000);
	}
}


























