package Project;

import java.util.Scanner;

public class Tennis_GameStyle {
	  int gameStyle = 0;
	  Scanner scan = new Scanner(System.in);
	
	public void gameStyle() { // �ܽ� ���� ���� �Լ�
		System.out.print("������ ������ ������ �ּ���(1 = �ܽ� / 2 = ����) => ");
		gameStyle = scan.nextInt();

		while (gameStyle != 1 &&  gameStyle != 2) {
			try {
				System.out.print("�߸��Է��ϼ̽��ϴ� �ٽ� �Է����ּ��� (1 = �ܽ� / 2 = ����)=> ");
				gameStyle = scan.nextInt();
				System.out.println();
			} catch (Exception e) {

			}
		}
	}
}
