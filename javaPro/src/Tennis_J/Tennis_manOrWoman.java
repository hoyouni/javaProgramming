package Tennis_J;

public class Tennis_manOrWoman extends Tennis_GameStyle {
	int gender = 0;
	int set = 0;
	
	public void manOrWoman() { // 성별 구분 함수
		System.out.print("> 성별을 입력해 주세요 ? (1.남자  2.여자)\t");
		gender = scan.nextInt();
		System.out.println();
		while (gender != 1 && gender != 2) {
			try {
				System.out.print("잘못입력하셨습니다 다시 입력해주세요 (1 = 남자/ 2 = 여자)=> ");
				gender = scan.nextInt();
				System.out.println();
			} catch (Exception e) {
			}

		}
		set = gender == 1 ? 5: 3;
	}

}
