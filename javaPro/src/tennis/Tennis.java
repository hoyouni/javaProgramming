package tennis;
import java.util.Arrays;
import java.util.Scanner;

public class Tennis {

	static int gameStyle = 0;
	static Scanner scan = new Scanner(System.in);
	static int gender = 0;
	static int set = 0;
	static String[] names = null;
	static String[] team = null;
	static int[][] playPoint = null;
	static int scoreTotal1 = 0;
	static int scoreTotal2 = 0;


	public static void gameStyle() { // 단식 복식 구분 함수
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

	public static void manOrWoman() { // 성별 구분 함수
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

	public static void gamePeopleName() { //게임 선수 등록 함수
		names = new String[gameStyle*2];
		for (int i = 0; i < names.length; i++) {
			System.out.printf("> %d번째 선수 이름을 입력하세요 ?\t", i+1);
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

	public static void score() { // 점수 계산 (포인트듀스, 셋듀스 포함) 함수
		playPoint = new int [2][set+2];
		int[] scoreArray = {0,15,30,40,45};

		for(int i = 0 ; i < playPoint.length; i++) {
			for(int j = 0; j < playPoint[i].length; j++) {
				playPoint[i][j] = 0;
			}
		}
		
		int winTeam = 0;
		int pointCount1 = 0;
		int pointCount2 = 0;
		int setCount = 1;
		int setCount1 = 0;
		int setCount2 = 0;
		int pointDeuce1 = 0;
		int pointDeuce2 = 0;
		int setDeuce1 = 0;
		int setDeuce2 = 0;



		while(setCount <= set) {

			manGameFinal(); // 남자 경기 최종 승리 출력 함수
			womanGameFinal(); // 여자 경기 최종 승리 출력 함수

			boolean flag = true;

			while(flag) {
				System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");
				winTeam = scan.nextInt();

				if(winTeam == 1) { // 1팀이 이긴 경우
					int pointScore = scoreArray[++pointCount1];
					playPoint[winTeam-1][0] = pointScore;  //1팀이 이긴 경우 포인트 득점
					scoreBoard();

					if(pointCount1==4) {
						System.out.println(team[0] + "팀 승리!");
						playPoint[0][setCount] = ++setCount1;
						playPoint[0][0] = 0;
						playPoint[1][0] = 0;

						pointCount1 = 0;
						pointCount2 = 0;
						scoreBoard();
					}
					if(setCount1 == 6) {
						System.out.println();
						System.out.println(team[0] + "팀 set point 획득");
						System.out.println();
						setCount1 = 0;
						playPoint[0][set+1] = ++scoreTotal1;
						scoreBoard();
						flag = false;
					}
				}


				else if(winTeam == 2) { // 2팀이 이겼을 때 
					int pointScore = scoreArray[++pointCount2];
					playPoint[winTeam-1][0] = pointScore;  //1팀이 이긴 경우 포인트 득점
					scoreBoard();

					if(pointCount2==4) {
						System.out.println(team[1] + "팀 승리!");
						playPoint[1][setCount] = ++setCount2;
						playPoint[0][0] = 0;
						playPoint[1][0] = 0;

						pointCount1 = 0;
						pointCount2 = 0;
						scoreBoard();
					}
					if(setCount2 == 6) {
						System.out.println();
						System.out.println(team[1] + "팀 set point 획득");
						System.out.println();
						setCount2 = 0;
						playPoint[1][set+1] = ++scoreTotal2;
						scoreBoard();
						flag = false;
					}
				}


				if(pointCount1 == 3 && pointCount2 == 3) { // 포인트 듀스
					System.out.println("POINT DEUCE!!");
					scoreBoard();
					boolean flag2 = true;

					for(int i = 1; i <= 2; i++) {

						while(flag2) {
							System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");

							winTeam = scan.nextInt();

							if(pointDeuce1 == 1 && pointDeuce2 == 1) {
								pointDeuce1 = 0;
								pointDeuce2 = 0;
							}

							if(winTeam==1) {
								pointDeuce1 = pointDeuce1 + 1;

								//1팀이 듀스 성공 시킨 경우
								if(pointDeuce1==2) {
									System.out.println(team[0] + "팀 승리!");
									playPoint[0][setCount] = ++setCount1;
									playPoint[0][0] = 0;
									playPoint[1][0] = 0;

									//game 승리시 pointCnt 초기화
									pointCount1 = 0;
									pointCount2 = 0;
									pointDeuce1 = 0;
									pointDeuce2 = 0;
									flag2 = false;
									//break;
								} 
							}


							else if(winTeam == 2) {
								pointDeuce2 = pointDeuce2 + 1;
								// 2팀이 듀스 성공시킨 경우

								if(pointDeuce2 == 2){
									System.out.println(team[1] + "팀 승리!");
									playPoint[1][setCount] = ++setCount2;
									playPoint[0][0] = 0;
									playPoint[1][0] = 0;

									//game 승리시 pointCnt 초기화
									pointCount1 = 0;
									pointCount2 = 0;
									pointDeuce1 = 0;
									pointDeuce2 = 0;
									flag2 = false;
								}
							}
						} 
					}
				} // 포인트 듀스



				if(setCount1 == 5 && setCount2 == 5) { // 셋 듀스
					System.out.println("SET DEUCE!!");
					scoreBoard();
					boolean flag3 = true;

					for(int i = 1; i <= 2; i++) {
						while(flag3) {

							System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");
							winTeam = scan.nextInt();

							if(pointCount1 == 3 && pointCount2 == 3) { // 셋듀스 내에서 포인트 듀스
								System.out.println("POINT DEUCE!!");
								scoreBoard();
								boolean flag2 = true;

								for(int j = 1; j <= 2; j++) {

									while(flag2) {
										System.out.print("점수를 입력한 팀을 입력하세요 (1. "+team[0]+"팀 "+"2. " + team[1]+"팀): ");

										winTeam = scan.nextInt();

										if(pointDeuce1 == 1 && pointDeuce2 == 1) {
											pointDeuce1 = 0;
											pointDeuce2 = 0;
										}

										if(winTeam==1) {
											pointDeuce1 = pointDeuce1 + 1;

											//1팀이 듀스 성공 시킨 경우
											if(pointDeuce1==2) {
												System.out.println(team[0] + "팀 승리!");
												playPoint[0][setCount] = ++setCount1;
												playPoint[0][0] = 0;
												playPoint[1][0] = 0;

												//game 승리시 pointCnt 초기화
												pointCount1 = 0;
												pointCount2 = 0;
												pointDeuce1 = 0;
												pointDeuce2 = 0;
												flag2 = false;
												//break;
											} 
										}


										else if(winTeam == 2) {
											pointDeuce2 = pointDeuce2 + 1;
											// 2팀이 듀스 성공시킨 경우

											if(pointDeuce2 == 2){
												System.out.println(team[1] + "팀 승리!");
												playPoint[1][setCount] = ++setCount2;
												playPoint[0][0] = 0;
												playPoint[1][0] = 0;

												//game 승리시 pointCnt 초기화
												pointCount1 = 0;
												pointCount2 = 0;
												pointDeuce1 = 0;
												pointDeuce2 = 0;
												flag2 = false;
											}
										}
									} 
								}
							}//셋 듀스 내에서 포인트 듀스
							
							if(setDeuce1 == 1 && setDeuce2 == 1) {
								setDeuce1 = 0;
								setDeuce2 = 0;
							}
							
							
							if(winTeam==1) { // 1팀 승리 경우 
								int pointScore = scoreArray[++pointCount1];
								playPoint[winTeam-1][0] = pointScore;  //1팀이 이긴 경우 포인트 득점
								scoreBoard();

								if(pointCount1==4) {
									System.out.println(team[0] + "팀 승리!");
									playPoint[0][setCount] = ++setCount1;
									playPoint[0][0] = 0;
									playPoint[1][0] = 0;
									setDeuce1++;
									pointCount1 = 0;
									pointCount2 = 0;
									pointDeuce1 = 0;
									pointDeuce2 = 0;
									scoreBoard();
								}

								if(setDeuce1 == 2) {
									System.out.println();
									System.out.println(team[0] + "팀 set point 획득");
									setCount1 = 0;
									setCount2 = 0;
									setDeuce1 = 0;
									setDeuce2 = 0;
									playPoint[0][set+1] = ++scoreTotal1;
									scoreBoard();

									flag3 = false;

								}
							} 

							else if(winTeam == 2) {
								int pointScore = scoreArray[++pointCount2];
								playPoint[winTeam-1][0] = pointScore;  //1팀이 이긴 경우 포인트 득점
								scoreBoard();

								if(pointCount2==4) {
									System.out.println(team[0] + "팀 승리!");
									playPoint[1][setCount] = ++setCount2;
									playPoint[0][0] = 0;
									playPoint[1][0] = 0;
									setDeuce2++;
									pointCount1 = 0;
									pointCount2 = 0;
									pointDeuce1 = 0;
									pointDeuce2 = 0;
									scoreBoard();
								}

								if(setDeuce2 == 2) {
									System.out.println();
									System.out.println(team[0] + "팀 set point 획득");
									setCount1 = 0;
									setCount2 = 0;
									setDeuce1 = 0;
									setDeuce2 = 0;
									playPoint[1][set+1] = ++scoreTotal2;
									scoreBoard();
									flag3 = false;
								}
							}

						}
					} // 셋 듀스
					flag = false;
				}
			}
			setCount++;
		} //while

	}




	public static void womanGameFinal() { //여자 경기 최종 결과 함수
		if(set == 3) {

			if(scoreTotal1 == 2) {
				for(int i = 0; i < 10; i++) {
					System.out.println();
				}
				System.out.println("최종 승리  : " + team[0] + "팀");
				scoreBoard();
				System.exit(-1);

			} else if(scoreTotal2 == 2) {
				for(int i = 0; i < 10; i++) {
					System.out.println();
				}
				System.out.println("최종 승리 : " + team[1] + "팀");
				scoreBoard();
				System.exit(-1);
			}
		}

	}


	public static void manGameFinal() { //남자 최종 경기 결과  함수

		if(set == 5) {
			if(scoreTotal1 == 3) {
				for(int i = 0; i < 10; i++) {
					System.out.println();
				}
				System.out.println("최종 승리  : " + team[0] + "팀");
				scoreBoard();
				System.exit(-1);
			} 
			else if(scoreTotal2 == 3) {
				for(int i = 0; i < 10; i++) {
					System.out.println();
				}
				System.out.println("최종 승리 : " + team[1] + "팀");
				scoreBoard();
				System.exit(-1);
			}
		}

	}

	public static void scoreBoard() { //경기 결과 전광판 함수
		String [] menu1 = {"Name\t","Point\t","Set1\t","Set2\t","Set3\t","Set4\t","Set5\t","Score"};
		String [] menu2 = {"Name\t","Point\t","Set1\t","Set2\t","Set3\t","Score"};


		if(set==5) {
			for (int i = 0; i < menu1.length; i++) {
				System.out.print(menu1[i]);
			}
			System.out.println();
		}else if(set==3) {
			for (int i = 0; i < menu2.length; i++) {
				System.out.print(menu2[i]);
			}
			System.out.println();
		}

		for (int i = 0; i < playPoint.length; i++) {
			System.out.printf("[%s]\t",names[i]);
			for (int j = 0; j < playPoint[i].length; j++) {
				System.out.printf("[%d]\t",playPoint[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		gameStyle();
		manOrWoman();
		gamePeopleName();
		score();
		//scoreBoard(); 이건 호출 안해도 되고 함수 만들었다고 보여주는거

	}
}
