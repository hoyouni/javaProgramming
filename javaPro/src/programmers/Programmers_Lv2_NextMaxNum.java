package programmers;

// Lv2 다음 큰 숫자 
public class Programmers_Lv2_NextMaxNum {
	public static int solution(int n) {
		String binary = Integer.toBinaryString(n);
		int cnt = 0;
		
		for(int i = 0; i < binary.length(); i++) {
			if(binary.substring(i, i + 1).equals("1")) {
				cnt++;
			}
		}
		
		while(true) {
			n++;
			String binaryNext = Integer.toBinaryString(n);
			int cnt2 = 0;
			for(int i = 0; i < binaryNext.length(); i++) {
				if(binaryNext.substring(i, i + 1).equals("1"))
					cnt2++;
			}
			
			if(cnt == cnt2) {
				int nextNum = Integer.parseInt(binaryNext, 2);
				return nextNum;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int n = 15;
		int result = solution(n);
		System.out.println(result);
	}
}
