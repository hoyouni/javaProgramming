package recursion;

// 최대값 찾기
public class Ex14 {
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9};
		int begin = 0;
		int end = data.length - 1;
		int result = findMax(data, begin, end);
		System.out.println(result);
		
	}
	
	public static int findMax(int[] data, int begin, int end) {
		if(begin == end) {
			return data[begin];
		} else {
			int middle = (begin + end) / 2;
			int max1 = findMax(data, begin, middle);
			int max2 = findMax(data, middle + 1, end);
			return Math.max(max1, max2);
		}
	}
}
