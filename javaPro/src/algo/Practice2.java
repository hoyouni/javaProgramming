package algo;

import java.util.Arrays;
import java.util.HashSet;

public class Practice2 {
	public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char start; 
        char end = words[0].charAt(words[0].length()-1); 
        HashSet<String> hashSet = new HashSet<String>(); 
        hashSet.add(words[0]); 
        for(int i=1; i<words.length;i++){ 
            hashSet.add(words[i]);
            start = words[i].charAt(0);
            if(end!=start || hashSet.size() != i+1){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }
            end= words[i].charAt(words[i].length()-1); 
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 5;
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		//String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		//String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] result = solution(n, words);
		System.out.println(Arrays.toString(result));
	}
}





















