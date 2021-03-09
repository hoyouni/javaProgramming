package days21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.StringJoiner;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex06.java
 */
public class Ex06 {
	public static void main(String[] args) {
		String team = "김호연[기]	고승우[팀]	김지민	정영진	여원경	이영재";
		String[] members = team.split("\\s+");
		
		//잘라진 것을 다시 합치는 함수
		//String m = String.join("/", members); 
		//System.out.println(m);
		
		//중요 
		StringJoiner sj = new StringJoiner("</li><li>", "<ol><li>", "</li></ol>");
		for (String name : members) {
			sj.add(name);
		}
		
		System.out.println(sj);
		
		try (FileWriter fw = new FileWriter("sample.htm");
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(sj.toString());
			System.out.println("END");
		} catch(Exception e) {
			
		}
		
		
		/*
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
		*/
	}
}
