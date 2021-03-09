package days23;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] a) {
		// p 624
		// Arrays 클래스 
		// 1. 배열 복사 : copyOf(), copyOfRange()
		int [] m = {1,2,3,4,5};
		// int [] n = Arrays.copyOf(m, m.length);
		// int [] n = Arrays.copyOf(m, 3);
		int [] n = Arrays.copyOfRange(m, 1, 3); // from <=       < to
		// System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println( Arrays.toString(n) );
		
		// 2. fill(), setAll()
		int [] arr = new int[10];
		// -1 
		//for (int i = 0; i < arr.length; i++) {
		//	arr[i] = -1;
		//}
		// Arrays.fill(arr, -1);
		// setAll()
		// Arrays.setAll( arr , (i) -> (int)(Math.random()*50)+1 );
		Arrays.setAll( arr , (i) -> -1 );
		System.out.println( Arrays.toString( arr ) );
		
		//public int XXX( int j) {
		//	return (int)(Math.random()*50)+1;
		//}
		
		// Arrays.Sort(m);
		// Arrays.binarySearch(m, 5);
		
		// 비교   Arrays.equas()/ 
		
		

	}

}
//









//