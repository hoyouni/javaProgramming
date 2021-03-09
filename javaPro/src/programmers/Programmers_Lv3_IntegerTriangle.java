package programmers;

import java.util.Arrays;

// Lv3 정수 삼각형 
public class Programmers_Lv3_IntegerTriangle {
	public static int solution(int[][] triangle) {
		int[][] copyT = new int[triangle.length][triangle.length];
		copyT[0][0] = triangle[0][0];
		
		for(int i = 1; i < copyT.length; i++) {
			copyT[i][0] = copyT[i - 1][0] + triangle[i][0];
			copyT[i][i] = copyT[i - 1][i - 1] + triangle[i][i];
		}
		
		for(int i = 2; i < copyT.length; i++) {
			for(int j = 1; j < i; j++) {
				copyT[i][j] = Math.max(copyT[i - 1][j - 1], copyT[i - 1][j]) + triangle[i][j];
			}
		}
		
		int max = copyT[copyT.length - 1][0];
		
		for(int i = 1; i < copyT.length; i++) {
			if(copyT[copyT.length - 1][i] > max)
				max = copyT[copyT.length - 1][i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int result = solution(triangle);
		System.out.println(Arrays.deepToString(triangle));
		System.out.println(result);
		
	}
}
































