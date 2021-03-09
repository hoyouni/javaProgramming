package days06;

public class Ex05 {
	public static void main(String[] args) {
		String a ="badlj";
		String b ="badky";
		boolean flag = true;
		
		if(a.length() == b.length()) {
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) != b.charAt(i)) {
					flag = false;
					System.out.println("다르다.");
					break;
				}
			} if(flag) {
				System.out.println("같다.");
			}
		} else {
			System.out.println("다르다.");
		}
	}
}
