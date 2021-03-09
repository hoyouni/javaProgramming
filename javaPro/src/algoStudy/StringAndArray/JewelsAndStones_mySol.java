package algoStudy.StringAndArray;

public class JewelsAndStones_mySol {
	public static int solution(String j, String s) {
		long start = System.currentTimeMillis();
		
		String[] jewel = j.split("");

		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int idx = 0;
			while(idx < jewel.length) {
				if(s.substring(i, i + 1).equals(jewel[idx])) {
					cnt++;
				}
				idx++;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (end - start) + "초");
		
		return cnt;
	}
	
	public static void main(String[] args) {
		String j = "aAasdfasdfsadfsafdasgfsadfasfasdfsadfsafsadfsadfsaf";
		String s = "aAAbbbbasdfasdfdasfasdfasdfasdfawefegeawgweadsbefbjmhlhijliulhligukj";
		int result = solution(j, s);
		System.out.println(result);
	}
}





























