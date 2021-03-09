package programmers;

import java.util.Arrays;
import java.util.Comparator;

// Lv2 가장 큰 수 
public class Programmers_Lv2_MaxNum {
	public static String solution(int[] numbers) {
        StringBuffer sb = new StringBuffer();
		String answer = "";
        
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = (String.valueOf(numbers[i]));
        }
       
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        if (arr[0].equals("0")) return "0";
       
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return answer + sb;
    }

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String result = solution(numbers);
		System.out.println(result);
	}
}




































