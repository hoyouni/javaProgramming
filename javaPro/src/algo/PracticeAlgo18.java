package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo18 {
	public static int solution(String begin, String target, String[] words) {
		List<String> word = new ArrayList<String>();
		for(int i = 0; i < words.length; i++) {
			word.add(words[i]);
		}
		System.out.println(word);
		//

		List<Integer> wordCnt = new ArrayList<Integer>();
		for(int i = 0; i < words.length; i++) {
			wordCnt.add(0);
		}
		//

		int index = 0;
		int cnt = 0;
		int resultCnt = 0;

		while(begin != target) {
			while(index < begin.length()) {
				char oneOfBegin = begin.charAt(index);
				for(int i = 0; i < words.length; i++) {
					if(oneOfBegin == words[i].charAt(index)) {
						wordCnt.set(i, wordCnt.get(i) + 1);
					}
				}
				index++;
			}
			System.out.println(wordCnt);
			int maxIdx = wordCnt.indexOf(Collections.max(wordCnt));
			resultCnt++;
			
			index = 0;
			begin = words[maxIdx];
			wordCnt.remove(maxIdx);
			//word.remove(maxIdx);
			
		}
		
		

		return -1;
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		int result = solution(begin, target, words);
		System.out.println(result);
	}
}












