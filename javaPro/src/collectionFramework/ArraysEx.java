package collectionFramework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Arrays 클래스 
public class ArraysEx {
	public static void main(String[] args) {
		// 배열 복사
		int[] arr = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr2));
		//System.out.println(Arrays.toString(arr3));
		//System.out.println(Arrays.toString(arr4));
		//System.out.println(Arrays.toString(arr5));
		//System.out.println(Arrays.toString(arr6));
		
		// 배열 채우기
		int[] fillArr = new int[5];
		Arrays.fill(fillArr, 9);
		
		// 배열 정렬과 검색
		int[] searchArr = {3,2,0,1,4};
		//int idx = Arrays.binarySearch(searchArr, 2);
		
		Arrays.sort(searchArr);
		System.out.println(Arrays.toString(searchArr));
		int idx = Arrays.binarySearch(searchArr, 2); // 반드시 정렬되어 있을때 사용 , 검색 속도가 빠르다는 장점 
		System.out.println(idx);
		
		// String 으로 변환
		int[][] arr2D = {{11,12}, {13,14}};
		System.out.println(Arrays.deepToString(arr2D));
		
		// 배열을 List로 변환
		int[] a = {1,2,3,4,5};
		List list1 = Arrays.asList(a);
		
	}
}




























