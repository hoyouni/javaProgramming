package days21;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex05.java
 * 문자열 다루기
 */
public class Ex05 {
	public static void main(String[] args) {
		// for 1 ~ 1000 출력 
		// 0001 0002 0003 4자리 숫자로 출력 
		/*
		for (int i = 1; i <= 1000; i++) {
			//System.out.printf("%04d\n", i);
			String no = String.format("%04d", i);
			System.out.println(no);
		}
		 */

		// 학생명단.txt
		String fileName = "..\\..\\test\\학생명단.txt";
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
			// 한 라인 단위로 문자를 읽어와서 처리
			// 버퍼 기능이 있어 라인 단위로 처리 할 수 있는 BufferedReader
			// 각 팀에서 박성재 학생을 찾아서 팀 출력 
			//            박성재 학생 이름을 변경 해서 출력
			String line = null;
			int lineNum = 1;
			while(((line = br.readLine()) != null)) {
				System.out.printf("%d :  %s\n", lineNum++, line);
			}
		} catch(Exception e) {
			System.out.println("1 : " + e.toString());
		}
	}
}










