package days11;

import java.util.Arrays;

/**
 * @Author k��n��k
 * @Source Ex06.java
 * @Date 2019. 8. 12. - ���� 3:13:47
 * @Subject �迭 ����   System.arrayCopy()
 *                              Arrays Ŭ���� �ȿ� �Լ����..
 */
public class Ex06 {

	public static void main(String[] args) {
		int [] src = {10,30,30,20};
		int [] dest = new int[src.length+3];
		// Arrays Ŭ����
		//Arrays.sort(src);
		//Arrays.fill(dest, -1);
		
		// System.arraycopy(src, 1, dest, 4, 2);
		System.arraycopy(src, 0, dest, 0, src.length);
		//[0, 0, 0, 0, 30, 30, 0]
		System.out.println( Arrays.toString( dest )  );		
				
	}

}
//









//