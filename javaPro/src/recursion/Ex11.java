package recursion;

// Designing Recursion (순환 알고리즘 설계)
// 1. 적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 한다.
// 2. 모든 case는 결국 base case로 수렴해야 한다.
// 3. 암시적 매개변수를 명시적 매개변수로 바꾸어라.
// ex) 순차 검색의 일반적인 방식
// data[0] 에서 data[n-1] 사이에서 target 검색
// 검색 구간의 시작 인덱스 0은 보통 생략. 즉 암시적 매개변수
public class Ex11 {
	public static int search(int[] data, int n, int target) {
		for(int i = 0; i < n; i++) {
			if(data[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9};
		int n = data.length;
		int target = 3;
		int result = search(data, n, target);
		System.out.println(result);
		
	}
}



























