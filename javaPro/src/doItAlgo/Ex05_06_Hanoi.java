package doItAlgo;

import java.util.Scanner;

// 하노이의 탑(재귀)
public class Ex05_06_Hanoi {
	static String[] name = {"A기둥", "B기둥", "C기둥" };
	
	public static void move(int n, int x, int y) {
		if(n > 1) {
			move(n - 1, x, 6 - x - y);
		}
		
		System.out.println("원반["+n+"]을" + name[x - 1] + "기둥에서 " + name[y - 1] + "기둥으로 올겼습니다.");
		
		if(n > 1) {
			move(n - 1, 6 - x - y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = sc.nextInt();
		
		// n개의 원반을 x번 기둥에서 y번 기둥으로 옮김
		move(n, 1, 3);
		
	}
}




























