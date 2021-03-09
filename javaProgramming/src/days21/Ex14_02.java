package days21;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex14.java
 */
public class Ex14_02 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.",
				"c0", "car", "combat", "count", "date", "disc"};

		String regex = "[a-z]*";
		
		
		for(int i = 0; i < data.length; i++) {
			if(Character.toString(data[i].charAt(i)).matches(regex)) {
				data[i] = Character.toString(data[i].charAt(i)).toUpperCase();
				System.out.print(data[i] +" ");
			}
		}
		
		System.out.println("\n\n End");
	}
}














