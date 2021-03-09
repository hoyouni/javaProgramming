package doItAlgo;

// 이진 검색시 중복된 값 중 맨 앞의 값의 인덱스 찾기 
public class Prac03_05 {
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
		int n = a.length;
		int key = 7;

		int result = binSearch(a, n, key);
		System.out.println(result);
	}

	static int binSearch(int[] a, int n, int key) {
		int start = 0; 
		int end = a.length - 1;

		while(start < end) {
			int center = (start + end) / 2;
			if (a[center] == key) {
				while(center > start) {
					if (a[center - 1] < key) {
						break;
					}
					center--;
				}
				return center; 
			} 
			else if (a[center] < key)
				start = center + 1; 
			else
				end = center - 1;
		} 

		return -1;
	}

}



































