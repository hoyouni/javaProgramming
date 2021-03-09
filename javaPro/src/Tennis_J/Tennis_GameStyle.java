package Tennis_J;

import java.util.Scanner;

public class Tennis_GameStyle {
	  int gameStyle = 0;
	  Scanner scan = new Scanner(System.in);
	
	public void gameStyle() { // 단식 복식 구분 함수
		System.out.print("게임의 형식을 결정해 주세요(1 = 단식 / 2 = 복식) => ");
		gameStyle = scan.nextInt();

		while (gameStyle != 1 &&  gameStyle != 2) {
			try {
				System.out.print("잘못입력하셨습니다 다시 입력해주세요 (1 = 단식 / 2 = 복식)=> ");
				gameStyle = scan.nextInt();
				System.out.println();
			} catch (Exception e) {

			}
		}
	}
}
