package programmers;

import java.util.LinkedList;
import java.util.Queue;

// 다른 사람 풀이 
class Programmers_Lv3_WordChangeSol {

	static class Node {
		String next;
		int edge;

		public Node(String next, int edge) {
			this.next = next; // target 과 비교할 단어 
			this.edge = edge; // 단어가 변환될 때 edge가 하나씩 늘어남
		}
	}

	public int solution(String begin, String target, String[] words) {
		int n = words.length;
		int ans = 0;

		// for (int i=0; i<n; i++)
		//  if (words[i] != target && i == n-1) return 0;

		Queue<Node> q = new LinkedList<>();

		boolean[] visit = new boolean[n];
		q.add(new Node(begin, 0));

		while(!q.isEmpty()) {
			Node cur = q.poll();
			if (cur.next.equals(target)) {
				ans = cur.edge;
				break;
			}

			for (int i=0; i<n; i++) {
				if (!visit[i] && isNext(cur.next, words[i])) {
					visit[i] = true;
					q.add(new Node(words[i], cur.edge + 1));
				}
			}
		}

		return ans;
	}

	// 현재 단어와 비교 대상 단어 차이가 하나 밖에 나지 않는다면 true 그 이상 차이나면 false ex) hit 과 hot 은 하나 차이
	static boolean isNext(String cur, String n) {
		int cnt = 0;
		for (int i=0; i<n.length(); i++) {
			if (cur.charAt(i) != n.charAt(i)) {
				cnt++;
				if (cnt > 1) 
					return false;
			}
		}

		return true;
	}    

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

		Programmers_Lv3_WordChangeSol p2 = new Programmers_Lv3_WordChangeSol();

		int result = p2.solution(begin, target, words);
		System.out.println(result);

	}
}





































