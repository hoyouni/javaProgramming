package Project;

public class Tennis_manOrWoman extends Tennis_GameStyle {
	int gender = 0;
	int set = 0;
	
	public void manOrWoman() { // ���� ���� �Լ�
		System.out.print("> ������ �Է��� �ּ��� ? (1.����  2.����)\t");
		gender = scan.nextInt();
		System.out.println();
		while (gender != 1 && gender != 2) {
			try {
				System.out.print("�߸��Է��ϼ̽��ϴ� �ٽ� �Է����ּ��� (1 = ����/ 2 = ����)=> ");
				gender = scan.nextInt();
				System.out.println();
			} catch (Exception e) {
			}

		}
		set = gender == 1 ? 5: 3;
	}

}
