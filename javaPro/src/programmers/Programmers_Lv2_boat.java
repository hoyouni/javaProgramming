package programmers;

import java.util.Arrays;

// Lv2 구명보트 
public class Programmers_Lv2_boat {
	public static int solution(int[] people, int limit) {
		Arrays.sort(people);
		
		int result = 0;
		int index = people.length - 1;
		for(int i = 0; i <= index; i++, result++) 
			while(index > i && people[i] + people[index--] > limit) 
				result++;

		return result;
	}
	public static void main(String[] args) {
		int[] people = {70, 50, 80};
		int limit = 100;
		int result = solution(people, limit);
		System.out.println(result);
	}
}

























