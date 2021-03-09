package days26;

import java.time.Duration;
import java.time.LocalTime;

public class Ex10 {

	public static void main(String[] args) {
		// 
		LocalTime t1 = LocalTime.of(0, 0, 0);
		LocalTime t2 = LocalTime.of(12, 34, 56);
		// 시간 - 시간 간격(차)
		Duration du = Duration.between(t1, t2); // t1<= ~ < t2
		int hour = (int) (du.getSeconds() % 3600);
        int min = (int) (( du.getSeconds() - hour*3600) / 60);
        /*
		System.out.printf("%d시 %d분 %d초\n",
				hour , //du.toHours() 
				du.getSeconds() % 60, //, du.toMinutes() %60     // 34
				, du.getSeconds() % 60 );  // 56
		*/
        
        // (기억)
        //  두 시간의 차 : Duration -> LocalTime 형 변환
        //                                     getH() , gM()
        LocalTime t =  LocalTime.of(0, 0).plusSeconds(du.getSeconds());
        t.getHour();
        t.getMinute();
        t.getSecond();

	}

}
//









//