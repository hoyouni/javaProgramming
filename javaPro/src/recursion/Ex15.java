package recursion;

// binarySearch (이진 검색)
// 데이터가 크기순으로 정렬되어 있을때 검색 할 수 있는 알고리즘
public class Ex15 {
	public static void main(String[] args) {
		String[] items = {"1", "2", "3", "4", "5"};
		String target = "3";
		int begin = 0;
		int end = items.length - 1;
		int result = binarySearch(items, target, begin, end);
		System.out.println(result);
	}
	
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if(begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0) {
				return middle;
			} else if(compResult < 0) 
				return binarySearch(items, target, begin, middle - 1);
			else
				return binarySearch(items, target, middle + 1, end);
		}
	}
}












