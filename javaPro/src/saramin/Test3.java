package saramin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test3 {
	static int maxCnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sb = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(sb.nextToken());

		String[] avgJum = br.readLine().split(" ");
		int[] price = new int[avgJum.length];
		
		for(int i=0 ; i < avgJum.length; i++) {
			price[i] = Integer.parseInt(avgJum[i]);
		}

		perm(price,0);
		System.out.println(maxCnt);

	}

	public static void start(int[] price) {
		int cnt = 0;

		for(int i=0 ; i < price.length - 1; i++) {
			if(price[i + 1] - price[i] > 0) {
				cnt++;
			}
		}

		maxCnt = Math.max(cnt, maxCnt);

	}

	public static void swap(int[] price , int a , int b) {
		int temp = price[a];
		price[a] = price[b];
		price[b] = temp;
	}

	public static void perm(int[] price , int d) {
		if(d == price.length) {
			start(price);
			return;
		}
		for(int i=d ; i < price.length; i++) {
			swap(price, d, i);
			perm(price, d + 1);
			swap(price, d, i);
		}
	}
}













