package doItAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 제네릭 안 썼을 경우 키 내림차순 정렬 알고리즘 
/*
class HeightOrderComparator implements Comparator {
	@Override
	public int compare(Object d1, Object d2) {
		PhysExamSearch o1 = (PhysExamSearch)d1;
		PhysExamSearch o2 = (PhysExamSearch)d2;
		return (o1.height > o2.height) ? -1 : (o1.height < o2.height) ? 1 : 0;
	}
}
*/

// 제네릭 쓸 경우 키 내림차순 정렬 알고리즘
class HeightOrderComparator implements Comparator<PhysExamSearch> {
	@Override
	public int compare(PhysExamSearch o1, PhysExamSearch o2) {
		return (o1.height > o2.height) ? -1 : (o1.height < o2.height) ? 1 : 0;
	}
}

// 신체 검사 데이터 
class PhysExamSearch {
	// 신체 검사 데이터 정의
	public String name;
	public int height;
	public double vision;
	
	// 생성자 
	public PhysExamSearch(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	// 문자열 반환 (정보 확인용)
	public String toString() {
		return name + " " + height + " " + vision;
	}
	
} // PhysExamSearch

public class Ex03_08_Comparator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhysExamSearch[] x = {
				new PhysExamSearch("이수민", 175, 2.0),
				new PhysExamSearch("이호연", 174, 1.2),
				new PhysExamSearch("진서현", 173, 0.7),
				new PhysExamSearch("홍준기", 171, 1.5),
				new PhysExamSearch("김한결", 169, 0.8),
				new PhysExamSearch("유지훈", 168, 0.4),
				new PhysExamSearch("이나령", 162, 0.3)
		};
		
		System.out.print("몇 cm 인 사람을 찾고 있습니까 ? ");
		int height = sc.nextInt();
		
		// 배열 x 에서 키가 height인 요소를 HEIGHT_ORDER 에 의해 검색
		int idx = Arrays.binarySearch(x, new PhysExamSearch("", height, 0.0), new HeightOrderComparator());
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
		
	}
}




































