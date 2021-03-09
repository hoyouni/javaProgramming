package programmers;

// 단어 변환
// words 안에 target이 있을 경우 가장 짧은 변환 과정 리턴
// 만약 begin = hit target = cog 라면 
// hit -> hot -> dot -> dog -> cog
// hit -> hot -> lot -> log -> cog 4가지 경우 
public class Programmers_Lv3_WordChangeSol_OtherAnswer {
	
	// v = {false, false, false, false, false, false, false}
	public static boolean[] v;

	public int dfs(String begin, String target, String[] words) {
		int cnt = 0;
		String dupBegin;
		
		for(int i = 0; i < words.length; i++) {
			if(v[i]) // v[i] 가 true일 경우 검사한 곳이므로 넘어가고
				continue;
			for(int j = 0; j < begin.length(); j++) {
				dupBegin = (j > 0 ? begin.substring(0, j) : "") 
						+ words[i].charAt(j) 
						+ (j < begin.length() - 1 ? begin.substring(j + 1) : "");
				// dubBegin 이 target 이랑 같을 경우 함수 빠져나가고 
				if(dupBegin.equals(target)) 
					return 1;
				// dupBegin 이 words 배열 내 비교 대상과 같다면 방문 표시 후 dfs 돌림 
				if(dupBegin.equals(words[i])) {
					v[i] = true;
					cnt = 1;
					cnt = cnt + dfs(dupBegin, target, words);
				}
			}
		}
		
		return cnt;
	}
	
	public int solution(String begin, String target, String[] words) {
		v = new boolean[words.length + 1];
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(target))
				// words에 target이 있다면 dfs 탐색 수행 
				return dfs(begin, target, words);
		}
		
		// words 안에 target이 없을 경우 0 리턴
		return 0;
	}
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

		Programmers_Lv3_WordChangeSol_OtherAnswer p2 = new Programmers_Lv3_WordChangeSol_OtherAnswer();
		
		int result = p2.solution(begin, target, words);
		System.out.println(result);

	}
}





































