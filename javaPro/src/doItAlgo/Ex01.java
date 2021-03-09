package doItAlgo;

// 세 개의 수 중 최대값 찾기
public class Ex01 {
	public static int max(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max(3,2,1) : " + max(3, 2, 1));
	}
}

































