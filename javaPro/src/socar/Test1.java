package socar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {
	public static int solution(String[] bakery_schedule, String current_time, int K) throws ParseException {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		int current = Integer.parseInt(current_time.substring(0, 2) + current_time.substring(3));
		
		for(int i = 0; i < bakery_schedule.length; i++) {
			String[] bakery = bakery_schedule[i].split(" ");
			int c_time = Integer.parseInt(bakery[0].substring(0,2) + bakery[0].substring(3));
			if(c_time >= current) {
			map.put(c_time, Integer.parseInt(bakery[1]));
			}
		}
		
		List<Integer> result = new ArrayList<Integer>();
		Set<Integer> set = map.keySet();
		List<Integer> curSet = new ArrayList<Integer>(set);
		
		int cnt = 0;
		for(int i = 0; i < map.size(); i++) {
			if(map.get(curSet.get(i)) <= K) {
				result.add(curSet.get(i));
			}
			cnt = cnt + map.get(curSet.get(i));
			
			if(cnt > K)
				break;
			
		}
		
		if(cnt < K) 
			return -1;
		
		long answer = 0;
		if(result.size() == 0) 
			return -1;
		else {
			int lastTime = result.get(result.size() - 1);
			String lastTimes = Integer.toString(lastTime);
			lastTimes = lastTimes.substring(0, 2) + ":" + lastTimes.substring(2);
			SimpleDateFormat format = new SimpleDateFormat("HH:mm");
			Date date1 = format.parse(lastTimes);
			Date date2 = format.parse(current_time);
			
			answer = date1.getTime() - date2.getTime();
		}
		
		return (int)answer / 1000 / 60;
	}
	
	public static void main(String[] args) throws ParseException {
		String[] bakery_schedule = {
			"09:05 10",
			"12:20 5",
			"13:25 6",
			"14:24 5"
		};
		
		String current_time = "12:05";
		int K = 10;
		
		Test1 a = new Test1();
		System.out.println(a.solution(bakery_schedule, current_time, K));
		
	}
}































