package algo;

public class PracticeAlgo29 {
	public static void main(String[] args) {
		String s = "klfjsielfs";
		char[] first = s.toCharArray();
		char[] result = new char[first.length];
		for(int i = 0; i < first.length; i++) {
			if((first[i] >= 65 && first[i] <= 90) || (first[i] >= 97) && first[i] <= 122) {
				result[i] = first[first.length - 1 - i];
			}
			else {
				result[i] = first[i];
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < result.length; i++) {
			sb.append(result[i]);
		}
		String str = sb.toString();
		System.out.println(str);
		
	}
}




















