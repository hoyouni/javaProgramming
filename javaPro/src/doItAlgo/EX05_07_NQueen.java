package doItAlgo;

// 8퀸 문제 (4퀸 or 조합 문제)

// 각 행, 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열 
public class EX05_07_NQueen {
	static int[] pos = new int[4]; // 각 행에 퀸을 배치했는지 체크
	static boolean[] flag = new boolean[4]; // 각 열의 퀸의 위치 
	
	// 각 열의 퀸 위치 출력
	public static void print() {
		for(int i = 0; i < 4; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	// i열의 알맞은 위치에 퀸 배치 
	public static void set(int i) {
		for(int j = 0; j < 4; j++) {
			if(flag[j] == false) {
				pos[i] = j;
				if(i == 3) {
					print();
				}
				else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}
}

































