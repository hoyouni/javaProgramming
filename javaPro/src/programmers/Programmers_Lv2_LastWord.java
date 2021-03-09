package programmers;

import java.util.Arrays;
import java.util.HashSet;

// Lv2 끝말잇기 
public class Programmers_Lv2_LastWord {
	static int[] result = {0, 0};
	public static int[] solution(int n, String[] words) {
		char wordStart; 
        char wordEnd = words[0].charAt(words[0].length()-1); 
        
        HashSet<String> hashSet = new HashSet<String>(); 
        hashSet.add(words[0]); 
        
        for(int i=1; i<words.length;i++){ 
            hashSet.add(words[i]);
            wordStart = words[i].charAt(0);
            if(wordEnd!=wordStart || hashSet.size() != i+1){
            	result[0] = (i%n)+1;
            	result[1] = (i/n)+1;
                break;
            }
            wordEnd= words[i].charAt(words[i].length()-1); 
        }
        
        return result;
        
    }
	public static void main(String[] args) {
		int n = 2;
		//String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		//String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] result = solution(n, words);
		System.out.println(Arrays.toString(result));
	}
}

























