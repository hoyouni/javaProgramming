package days25;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		// 년도를 입력받아서 그 년도의 1월~12월까지의 마지막 날짜 출력.
		int year = 2019;
		//
		int  [] m = new int[12];
		Calendar d = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			d.set(Calendar.MONTH,  i );
			int lastDay = d.getActualMaximum(Calendar.DATE);
			System.out.printf("%d월의 마지막 날짜 : %d일\n",
					i+1,
					lastDay);
			m[i] = lastDay;
		}
		


	}

}
//









//