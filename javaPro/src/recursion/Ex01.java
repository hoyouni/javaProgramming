package recursion;

// 재귀함수 : 자기 자신을 호출하는 함수 (Recursion)
// recursion이 항상 무한루프에 빠지는 것은 아니다.
// 모든 재귀 함수는 반복문으로 변경이 가능하다.
// 또한 모든 반복문은 재귀 함수로 표현 가능하다.
// 재귀함수는 복잡한 알고리즘을 단순하고 알기 쉽게 표현하는 것을 가능하게 한다.
// 하지만 함수 호출에 따른 오버헤드가 있다. (매개변수 전달, 엑티베이션 프레임 생성 등..)
public class Ex01 {
	public static void main(String[] args) {
		int n = 4;
		func(n);
	}

	private static void func(int n) {
		if(n <= 0) { // base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
			return;
		} else {
			System.out.println("hello" + n);
			func(n - 1); // recursive case : recursion을 반복하다보면 결국 base case로 수렴해야 한다.
		}
	}
}


















