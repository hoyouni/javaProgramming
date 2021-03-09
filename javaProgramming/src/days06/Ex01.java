package days06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
	 for(int k = 0; k <3; k++) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 3*k + 2; j <= 3*k +4 && j <= 9; j++) {
				
				System.out.printf("%d * %d = %02d /", j, i, j*i);
			}System.out.println();
			}System.out.println();
		}
	}
}
