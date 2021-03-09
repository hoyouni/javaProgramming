package days25;

import java.text.ChoiceFormat;

public class Ex19 {

	public static void main(String[] args) {
		// p 548 
		// ChoiceFormat 클래스
		// 특정 범위에 속하는 값을 문자열로 반환해 준다. 
		/*
		double [] limits = { 0, 60, 70, 80, 90};  // 낮은 값부터 큰 값 순서로 적어야 한다. 		
		String [] grades = {"가", "양","미","우","수"};		
		int [] scores = {100, 88, 70, 52, 60, 70, 95};		
		ChoiceFormat cf = new ChoiceFormat(limits, grades);		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d : %s\n ", scores[i], cf.format(scores[i]));
		}
		*/
		
		// 예제 10-17
		//double [] limits = { 0, 60, 70, 80, 90};  // 낮은 값부터 큰 값 순서로 적어야 한다. 		
		//String [] grades = {"가", "양","미","우","수"};
		String pattern = "0#가|60#양|70#미|80#우|90#수";
		int [] scores = {100, 88, 70, 52, 60, 70, 95};		
		//ChoiceFormat cf = new ChoiceFormat(limits, grades);		
		ChoiceFormat cf = new ChoiceFormat( pattern);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d : %s\n ", scores[i], cf.format(scores[i]));
		}

	}

}
//









//