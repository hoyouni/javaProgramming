package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex11_02 {

	public static void main(String[] args) {

		int[] grade = {3,2,3,3,1,2,5,1}; 
		// int [] -> ArrayList 변환
		
		//System.out.println(kenikSolution(grade));
	}
	
	public static  ArrayList<Integer> kenikSolution(ArrayList<Integer> grade){
		ArrayList<Integer> answer = new ArrayList<>();
		
		Iterator<Integer> ir =  grade.iterator();
		while (ir.hasNext()) {
			Integer v = (Integer) ir.next();
			int rank = (int)(grade.stream().filter( n -> n > v ).count())+1 ;
			answer.add(rank);
		}
		
		return answer;
	}

	private static int[] 찬호solution(int[] grade) {

		int [] testresult = Arrays.copyOf(grade,grade.length);
		
		int [] result = new int[grade.length];
		Arrays.sort(testresult);

		System.out.println(Arrays.toString(grade));
		System.out.println(Arrays.toString(testresult));
 
		for(int i=0;i<grade.length;i++) {
			for(int j=testresult.length-1;j>=0;j--) {
				if(testresult[j]==grade[i]) {
					result[i] = testresult.length-j;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(result));


		return result;
	}

}
//









//