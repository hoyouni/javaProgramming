package nds;

import java.util.Arrays;

public class Test2 {
	public static int solution(int[] goods, int[] boxes){
		Arrays.sort(goods);
		Arrays.sort(boxes);
		System.out.println("goods : " + Arrays.toString(goods));
		System.out.println("boxes : " + Arrays.toString(boxes));
		
		int idx=0;
		int max = 0;
		
		for(int i = 0; i < goods.length; i++) {
			while(true) {
				if(idx > boxes.length - 1) {
					break;
				}
				
				if(goods[i] <= boxes[idx]) {
					max++;
					idx++;
					break;
				}else {
					idx++;
				}
			} // while
		} //for
		return max;
	}



	public static void main(String[] args) {
		int[] goods = {3,8,6};
		int[] boxes = {5,6,4};
		int result = solution(goods, boxes);
		System.out.println(result);

	}
}
































