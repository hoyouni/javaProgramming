package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1966 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = sc.nextInt();
		
		int[] answer = new int[testCase];
		int idx = 0;
		
		if(testCase <= 0) {
			System.out.println(0);
		} 
		else {
			for(int i = 0; i < testCase; i++) {
				int N = sc.nextInt(); 
				int M = sc.nextInt(); 
				
				String number = br.readLine();
				StringTokenizer st = new StringTokenizer(number, " ");
				
				Queue<Integer> q1 = new LinkedList<>(); // 문서 자료
				Queue<Integer> q2 = new LinkedList<>(); // 문서 중요도
				List<Integer> list = new ArrayList<>(); // 중요도에 따른 프린트 결과
				
				for(int j = 0; j < N; j++) {
					int num = Integer.valueOf(st.nextToken());
					q1.offer(j);
					q2.offer(num);
				}

				while(!q2.isEmpty()) {
					int max = Collections.max(q2);
					int num_q1 = q1.poll();
					int num_q2 = q2.poll();

					if(max > num_q2) {
						q2.offer(num_q2);
						q1.offer(num_q1);
					} else {
						list.add(num_q1);
					}

				}
				
				int result = list.indexOf(M) + 1;
				answer[idx++] = result;
				
			}
		}
		
		for(int ans : answer) {
			System.out.println(ans);
		}
		
		sc.close();
		br.close();
	}
}
















