package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Lv3 여행경로
public class Programmers_Lv3_TripRoute {
	static boolean[] visited;
	static List<String> list = new ArrayList<String>();
	static String route = "";
	
	public static String[] solution(String[][] tickets) {
		System.out.println("tickets : " + Arrays.deepToString(tickets));
		
		String[] answer = {};
		
		visited = new boolean[tickets.length];
		
		System.out.println("visited : " + Arrays.toString(visited));
		System.out.println("tickets.length : " + tickets.length);
		System.out.println();
		
		for(int i = 0; i < tickets.length; i++) {
			// 출발지
			String departure = tickets[i][0];
			System.out.println("출발지 : " + departure);
			// 도착지
			String destination = tickets[i][1];
			System.out.println("도착지 : " + destination);
			
			System.out.println();
			
			if(departure.equals("ICN")) {
				visited[i] = true;
				System.out.println("출발지가 ICN인 visited["+i+"] 을 true 로 바꾸기 : " + " visited["+i+"] : " + visited[i]);
				System.out.println("true visited : " + Arrays.toString(visited));
				System.out.println();
				
				route = departure + ",";
				System.out.println("route : " + route);
				System.out.println("-------------------DFS-------------------");
				System.out.println();
				
				dfs(tickets, destination, 1);
				visited[i] = false;
				System.out.println("false visited["+i+"] : "+ visited[i]);
				System.out.println("false visited : " + Arrays.toString(visited));
				System.out.println();
			}
			
		}
		
		Collections.sort(list);
		answer = list.get(0).split(",");
		
		return answer;
	}
	
	public static void dfs(String[][] tickets, String end, int count) {
		route = route + end + ","; // ICN. JFK
		
		System.out.println("DFS route + end + , : " + route);
		System.out.println();
		
		// dfs 종료 조건 
		if(count == tickets.length) {
			list.add(route);
			return;
		}
		
		for(int i = 0; i < tickets.length; i++) {
			String depart = tickets[i][0];
			
			System.out.println("DFS depart : " + depart);
			
			String desti = tickets[i][1];
			
			System.out.println("DFS desti : " + desti);
			System.out.println();
			
			// 도착지 = 출발지 이면서 방문하지 않았다면
			if(end.equals(depart) && !visited[i]) {
				System.out.println("DFS end equals depart["+i+"][0] : " + end + ", " + depart);
				System.out.println("DFS visited : " + Arrays.toString(visited));
				System.out.println("DFS visited["+i+"] : " + visited[i]);
				System.out.println();
				
				visited[i] = true;
				
				System.out.println("DFS true visited : " + Arrays.toString(visited));
				System.out.println();
				
				System.out.println("-------------------DFS to DFS-------------------");
				System.out.println();
				dfs(tickets, desti, count + 1);
				
				visited[i] = false;
				
				System.out.println("DFS false visited : " + Arrays.toString(visited));
				System.out.println();
				
				route = route.substring(0, route.length() - 4);
				
				System.out.println("DFS route : " + route);
				System.out.println();
			}
			
		}
		
	}

	public static void main(String[] args) {
		String[][] tickets = {
				{"ICN", "JFK"}, 
				{"HND", "IAD"}, 
				{"JFK", "HND"}
		};
		for(int i = 0; i < tickets.length; i++) {
			for(int j = 0; j < tickets[i].length; j++) {
				//System.out.println("tickets["+i+"]["+j+"] : " + tickets[i][j]);
			}
		}
		String[] result = solution(tickets);
		System.out.println(Arrays.toString(result));
	}
}












