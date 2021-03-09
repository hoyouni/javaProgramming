package ebay;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	// 재고량, 개당가격, 일일 판매 수량 
	public static long solution(int n, int[][] products) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		for(int i = 0; i < products.length; i++) {
			List<Integer> list = new ArrayList<>();
			int prod = products[i][0];
			int price = products[i][1];
			int count = products[i][2];
			int cnt = 0;
			
			while(cnt < n && prod >= count) {
				prod = prod - count;
				int good = price * count;
				list.add(good);
				cnt++;
			}
			result.add(list);
			cnt = 0;
		}
		
		System.out.println(result);
		
		return 0;
	}

	public static void main(String[] args) {
		int n = 2;
		int[][] products = {{10, 3, 2},{15, 2, 5}};
		long result = solution(n, products);
		System.out.println(result);
	}
}







































