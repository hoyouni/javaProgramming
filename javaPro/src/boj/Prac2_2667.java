package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prac2_2667 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] grid = new int[N][N];
		
		for(int i = 0; i < grid.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			String[] str = s.split("");
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(str[j] + " ");
			}
		}
		

		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				//System.out.print("grid["+i+"]["+j+"] : " + grid[i][j] + " ");
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}




































