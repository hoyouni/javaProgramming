package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 6603번 로또 DFS
public class Prac_6603 {
	static int[] result;
	static int[] rottoNum;
	static int N;
	
	public static void print() {
		for(int i = 0; i < N; i++) {
			if(result[i] == 1)
				System.out.print(rottoNum[i] + " ");
		}
		System.out.println();
	}
	
	public static void dfs(int start, int depth) {
		System.out.println("DFS result : " + Arrays.toString(result) + "\n");
		System.out.println("DFS start : " + start + "\nDFS depth : " + depth + "\n" + "dfs("+start+","+depth+")" + " 가 실행됩니다.");
		
		if(depth == 6) {
			System.out.println("\n" + "depth = 6 이므로 결과가 출력 됩니다.");
			print();
			System.out.println();
		}
		
		for(int i = start; i < N; i++) {
			result[i] = 1;
			System.out.println("result[i] = 1 대입할 때 result : " + Arrays.toString(result) + ", 이 때 i 값 : " + i);
			System.out.println("\n" + "--------------DFS 재호출--------------");
			dfs(i + 1, depth + 1);
			result[i] = 0;
			System.out.println("result[i] = 0 대입할 때 result : " + Arrays.toString(result) + ", 이 때 i 값 : " + i);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			String[] str1 = str.split(" ");
			N = Integer.parseInt(str1[0]);
			rottoNum = new int[N];
			result = new int[N];
			
			System.out.println("N : " + N);
			
			if(N == 0) {
				break;
			}
			
			for(int i = 0; i < N; i++) {
				rottoNum[i] = Integer.parseInt(str1[i + 1]);
			}
			
			System.out.println("rottoNum : " + Arrays.toString(rottoNum));
			System.out.println("result : " + Arrays.toString(result) + "\n");
			
			dfs(0, 0);
			System.out.println();
			
		}
		
	}
}




























