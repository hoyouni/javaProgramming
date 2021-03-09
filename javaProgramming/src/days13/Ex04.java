package days13;

import java.util.Arrays;

/**
 * @Author k≡n¡k
 * @Source Ex04.java
 * @Date 2019. 8. 14. - 오후 12:17:30
 * @Subject 병합정렬( merge sort )
 */
public class Ex04 {

	public static void main(String[] args) {
		//
		int [] m = {1,3,4};
		int [] n = {2,5,6,7};
		int size = m.length + n.length;
		int [] mn = new int[size];

		int i = 0,  j =0, k = 0;

		while(i < m.length) {
			if(m[i] > n[j]) {
				mn[k] = n[j];
				j++;
				k++;
			} else {
				mn[k] = m[i];
				i++;
				k++;
			}
		}
		for(int q = j; j < n.length; j++) {
			mn[k] = n[j];
			k++;
		}

		System.out.println( Arrays.toString(mn) );

	//while ( i != m.length && j != n.length ) {
	//	mn[k++] = m[i]>n[j]? n[j++]: m[i++];
	//}



	//int [] remainingArray = i==m.length ? n : m;
	//int    remainingStartIndex =  i==m.length ? j : i;

	//for (int r = remainingStartIndex; r < remainingArray.length; r++) {
	//	mn[k++] =  remainingArray[r];
	//}


}

}
//









//