package Project;

public class Tennis_GamePeopleName extends Tennis_manOrWoman {
	String[] names = null;
	String[] team = null;
	
	public void gamePeopleName() { //���� ���� ��� �Լ�
		names = new String[gameStyle*2];
		for (int i = 0; i < names.length; i++) {
			System.out.printf("> %d��° ���� �̸��� �Է��ϼ��� ?\t", i+1);
			names[i] = scan.next();
		}

		team = new String[2];
		if(names.length == 4) {
			team[0] = names[0]+"/"+names[1];
			team[1] = names[2]+"/"+names[3];
		}else {
			team[0] = names[0];
			team[1] = names[1];
		}

	}
}