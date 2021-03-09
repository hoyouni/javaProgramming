package codingTest;


public class Test2 {
	public static int solution(String p, String s) {
		String[] p_int = p.split("");
		String[] s_int = s.split("");
		
		int[] p1 = new int[p.length()];
		int[] p2 = new int[p.length()];
		int[] s1 = new int[s.length()];
		
		for(int i = 0; i < p.length(); i++) {
			p1[i] = Integer.parseInt(p_int[i]);
			p2[i] = Integer.parseInt(p_int[i]);
			s1[i] = Integer.parseInt(s_int[i]);
		}
		//
		
		int result = 0;
		
		for(int i = 0; i < p1.length; i++) {
			int cnt1 = 0;
			int cnt2 = 0;
			
			while(p1[i] != s1[i]) {
				if(p1[i] == s1[i]) {
					cnt1++;
					break;
				}
				p1[i]++;
				cnt1++;
				
				if(p1[i] > 10) {
					p1[i] = 0;
					cnt1--;
				}
				
			}
			while(p2[i] != s1[i]) {
				if(p2[i] == s1[i]) {
					cnt2++;
					break;
				}
				p2[i]--;
				cnt2++;
				
				if(p2[i] < 0) {
					p2[i] = 9;
					//cnt2--;
				}
				
			}
			
			if(cnt1 > cnt2) {
				result += cnt2;
				
			} else {
				result += cnt1;
				
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String p = "82195";
		String s = "64723";
		int result = solution(p, s);
		System.out.println(result);
	}
}

































