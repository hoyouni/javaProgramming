package days21;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex05.java
 * 문자열 다루기
 */
public class Ex05_02 {
	public static void main(String[] args) {
		// 학생명단.txt
		String fileName = "..\\..\\test\\학생명단.txt";
		
		//fileName.toUpperCase(); // 대문자로 바꾸는 함수
		//fileName.toLowerCase(); // 소문자로 바꾸는 함수
		
		
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {

			String line = null;
			int lineNum = 1;
			String team = null;
			while(((line = br.readLine()) != null)) {
				team = line.substring(0, 2);
				int idx = line.indexOf("박성재");
				line = line.replace("박성재", "");
				System.out.printf("%d :  %s[%d] = %s\n", lineNum++, team, idx, line);
			}
		} catch(Exception e) {
			System.out.println("1 : " + e.toString());
		}
	}
}










