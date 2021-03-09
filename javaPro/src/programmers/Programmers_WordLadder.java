package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Programmers_WordLadder {
	public int solution(String begin, String target, String[] words) {
        List<String> wordList = Arrays.asList(words);
        
        if(wordList == null || !wordList.contains(target)) {
        	return 0;
        }
        
        Queue<String> queue = new LinkedList<String>();
        Set<String> dict = new HashSet<String>(wordList);
        
        queue.offer(begin);
        
        int level = 1;
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	for(int i = 0; i < size; i++) {
        		String str = queue.poll();
        		if(str.equals(target)) {
        			return level;
        		}
        		
        		for(String findStr : bfs(str, wordList)) {
        			queue.offer(findStr);
        		}
        		
        	}
        	level++;
        }
        
        
		return -1;
    }
	
	public List<String> bfs(String str, List<String> wordList) {
		List<String> result = new LinkedList<String>();
		Set<String> dict = new HashSet<String>(wordList);
		
		for(int i = 0; i < str.length(); i++) {
			char[] charArr = str.toCharArray();
			for(char j = 'a'; j <= 'z'; j++) {
				charArr[i] = j;
				String findStr = new String(charArr);
				if(dict.remove(findStr)) {
					result.add(findStr);
				}
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		Programmers_WordLadder a = new Programmers_WordLadder();
		int result = a.solution(begin, target, words);
		System.out.println(result);
	}
}



































