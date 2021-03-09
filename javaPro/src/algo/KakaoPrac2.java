package algo;

import java.util.Scanner;

// 다트게임 
public class KakaoPrac2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("다트 점수 : ");
		String inputVal = scanner.nextLine().trim();
		
		int len = inputVal.length(); // 입력된 값의 길이 
		int step = 1; // 1단계 : [점수] 2단계 : [보너스] 3단계 : [옵션:#*]
		int lenPos = 0; // 입력된 값의 길이
		int[] score = new int[3]; // 점수 
		int scorePos = 0; // 점수의 좌표 
		
		// 1S2D*3T = 37
		// 1. 입력된 길이 반복만큼 반복 분석
		while(lenPos < len) {
			String target = inputVal.substring(lenPos, lenPos + 1);
			if(step == 1) {
				try {
					// 1.1 1단계 점수 처리 (숫자만 올 수 있음)
					score[scorePos] = Integer.parseInt(target);
					step++;
				} catch (Exception e) {
					// 1.3 3단계 옵션 처리 
					
					if("*".equals(target)) {
						// 1.3.1 스타상
						score[scorePos - 1] = score[scorePos - 1] * 2;
						if(scorePos > 1) {
							score[scorePos - 2] = score[scorePos - 2] * 2;
						}
					}
					else if("#".equals(target)) {
						// 1.3.2 아차상
						score[scorePos - 1] = score[scorePos - 1] * (-1);
					}
					else {
						System.out.println("유효한 다트 점수가 아닙니다.");
						return;
					}
				}
			}
			else if(step == 2) {
				// 1.2 2단계 보너스 처리
				if("S".equals(target)) {
					// 1.2.1 Single 처리
					score[scorePos] = (int)Math.pow(score[scorePos], 1);
					
				}
				else if("D".equals(target)) {
					// 1.2.2 Double 처리
					score[scorePos] = (int)Math.pow(score[scorePos], 2);
					
				}
				else if("T".equals(target)) {
					// 1.2.3 Triple 처리 
					score[scorePos] = (int)Math.pow(score[scorePos], 3);
					
				}
				else if("0".equals(target)) {
					// 1.1.1 10점 처리
					// 점수가 0~10 사이의 정수이기 때문에 0이 나올수 있다.
					if(score[scorePos] == 1) {
						score[scorePos] = 10;
						// 2단계 처리를 다시 하기 위해 값 조절 
						scorePos--;
						step++;
					}
				}
				else {
					System.out.println("유효한 다트 점수가 아닙니다.");
					return;
				}
				scorePos++;
				step--;
			}
			// 다음 문자 처리 
			lenPos++;
		}
		System.out.println(score[0] + score[1] + score[2]);
	}
}







































