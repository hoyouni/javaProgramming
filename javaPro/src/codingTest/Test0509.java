package codingTest;

public class Test0509 {
	public static String solution(int[] numbers, String hand) {
		String str = "";
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				str += "L";
			}
			else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				str += "R";
			}
			else if((str.indexOf("L") == -1 && str.indexOf("R") == -1) && (numbers[i] == 2 || numbers[i] == 5 ||numbers[i] == 8 || numbers[i] == 0)) {
				String str2 = hand.substring(0, 1);
				if(str2.equals("l")) {
					str += "L";
				} else {
					str += "R";
				}
			}
			else {
					int Lfirst = str.lastIndexOf("L");
					int Rfirst = str.lastIndexOf("R");
					
					
					int first = Math.abs(numbers[i] - numbers[Lfirst]);
					int second = Math.abs(numbers[i] - numbers[Rfirst]);
					
					if(first >= 4 && first <= 6) {
						first = first - 3;
					}
					else if(first >= 7 && first <= 9) {
						first = first - 6;
					}
					
					
					if(second >= 4 && second <= 6) {
						second = second - 3;
					}
					else if(second >= 7 && second <= 9) {
						second = second - 6;
					}
					
					
					if(first < second) {
						str  += "L";
					}
					else if(first > second) {
						str  += "R";
					}
					else{
						String str2 = hand.substring(0, 1);
						if(str2.equals("l")) {
							str += "L";
						} else {
							str += "R";
						}
					}
					
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String result = solution(numbers, hand);
		System.out.println(result);
	}
}

































