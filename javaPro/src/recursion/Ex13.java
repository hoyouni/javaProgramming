package recursion;

// 순차 탐색
public class Ex13 {
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9};
		int begin = 0;
		int end = data.length - 1;
		int target = 4;
		int result = search(data, begin, end, target);
		System.out.println(result);
	}
	
	public static int search(int[] data, int begin, int end, int target) {
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			if(data[middle] == target) {
				return middle;
			}
			int index = search(data, begin, middle - 1, target);
			if(index != -1)
				return index;
			else 
				return search(data, middle + 1, end, target);
		}
	}
}
