package recursion;

// 순차 검색 : recursion 사용
// 매개변수의 명시화
// 검색 구간의 시작점과 종료점을 명시적으로 지정한다.
public class Ex12 {
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9};
		int begin = 0;
		int end = data.length - 1;
		int target = 3;
		int result = search(data, begin, end, target);
		System.out.println(result);
		
	}
	
	public static int search(int[] data, int begin, int end, int target) {
		if(begin > end) { // base case, 검색할 데이터가 없다면 
			return -1; 
		} else if(target == data[begin]) {
			return begin;
		} else { 
			// recursion
			return search(data, begin + 1, end, target);
		}
	}
}



















