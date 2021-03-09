package algoStudy.DFSandBFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BFS_RemoveInvalidParentheses {
	public List<String> removeInvalidParenteses(String s) {
		List<String> res = new ArrayList<>();

		if(s == null) {
			return res;
		}

		Queue<String> queue = new LinkedList<>();
		Set<String> visited = new HashSet<>();

		queue.offer(s);
		visited.add(s);

		boolean flag = false;

		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				String str = queue.poll();
				if(isValid(str)) {
					res.add(str);
					flag = true;
				}
				if(flag)
					continue;
				for(int j = 0; j < str.length(); j++) {
					// 1. '(' 나 ')' 가 아니면 재낀다.
					if(str.charAt(j) != '(' && str.charAt(j) != ')') 
						continue;
					// 2.
					String newStr = str.substring(0, j) + str.substring(j + 1);
					if(!visited.contains(newStr)) {
						queue.offer(newStr);
						visited.add(newStr);
					}
				}
			}
		}
		return res;
	}

	public boolean isValid(String str) {
		int count = 0;
		for(char c : str.toCharArray()) {
			if(c == '(') {
				count++;
			} else if(c == ')') {
				count--;

				if(count < 0) 
					return false;
			}
		}
		return count == 0;
	}

	public static void main(String[] args) {
		String s = "(a)())()";
		BFS_RemoveInvalidParentheses a = new BFS_RemoveInvalidParentheses();
		System.out.println(a.removeInvalidParenteses(s));
	}
}































