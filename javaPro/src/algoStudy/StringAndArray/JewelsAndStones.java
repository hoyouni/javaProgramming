package algoStudy.StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
	public static int solution(String jew, String stone) {
		long start = System.currentTimeMillis();
		
		Set<Character> set = new HashSet<Character>();
		for(char jewel : jew.toCharArray()) {
			set.add(jewel);
		}
		
		int cnt = 0;
		for(char stoneChar : stone.toCharArray()) {
			if(set.contains(stoneChar)) {
				cnt++;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (end - start) + "초");
		
		return cnt;
	}
	
	public static void main(String[] args) {
		String jew = "aAasdfasdfsadfsafdasgfsadfasfasdfsadfsafsadfsadfsaf";
		String stone = "aAAbbbbasdfasdfdasfasdfasdfasdfawefegeawgweadsbefbjmhlhijliulhligukj";
		int result = solution(jew, stone);
		System.out.println(result);
	}
}





























