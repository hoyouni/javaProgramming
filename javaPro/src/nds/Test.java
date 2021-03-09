package nds;

public class Test {
	public static String solution(String sentence) {
		char[] sentences = sentence.toLowerCase().toCharArray();
		
		int[] arr2 = new int[5001];
		for(int i = 0; i < sentences.length; i++) {
			arr2[sentences[i]]++;
		}
		
		StringBuffer sb = new StringBuffer();
		for(char i = 'a'; i <= 'z'; i++) {
			if(arr2[i] == 0) {
				sb.append(i);
			}
		}
		
		String result = sb.toString();
		if(result.length() == 0) {
			return "perfect";
		}
		
		return result;
	}

	public static void main(String[] args) {
		String sentence = "His comments came after Pyongyang announced it had a plan to fire four missiles near the US territory of Guam.";
		//String sentence = "Jackdaws love my big sphinx of quartz";
		String result = solution(sentence);
		System.out.println(result);
	}
}
































