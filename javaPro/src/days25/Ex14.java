package days25;

import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		// p 532 예제 10-3
		final int [] TIME_UNIT = { 3600, 60, 1};
		final String [] TIME_UNIT_NAME = {"시간","분","초"};
		
		Calendar timer1 = Calendar.getInstance();
		Calendar timer2 = Calendar.getInstance();
		
		timer1.set(Calendar.HOUR_OF_DAY, 10);
		timer1.set(Calendar.MINUTE, 20);
		timer1.set(Calendar.SECOND, 30);
		
		timer2.set(Calendar.HOUR_OF_DAY, 20);
		timer2.set(Calendar.MINUTE, 30);
		timer2.set(Calendar.SECOND, 10);
		
		long difference =
			Math.abs(	timer2.getTimeInMillis() - timer1.getTimeInMillis() ) / 1000;
		
		String tmp = "";
		for (int i = 0; i < TIME_UNIT_NAME.length; i++) {
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		System.out.println(tmp);
		
	}

}
//









//