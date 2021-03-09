package sgm00006Algo;

public class Test8 {
	public static String solution(String s) {
        String[] str = s.split("");
        
        double num = Math.floor((double)str.length / 2);
        
        return s.length() % 2 != 0 ? str[(int)num ] : str[(int)num - 1] + str[(int)num];
        
    }
	
	public static void main(String[] args) {
		String s = "qwer";
		String result = solution(s);
		System.out.println(result);
	}
}



























