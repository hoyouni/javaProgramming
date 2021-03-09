package sgm00006Algo;

import java.util.Arrays;

public class Test2 {
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		System.out.println(Arrays.toString(participant));
		System.out.println(Arrays.toString(completion));
		
		for(int i = 0; i < completion.length; i++) {
			 if(!participant[i].equals(completion[i])) {
				 return participant[i];
			 }
		}
		
		
		return participant[participant.length - 1];
	}
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String result = solution(participant, completion);
		System.out.println(result);
	}

}



























