package recursion;

// 미로찾기 문제
public class Ex16 {
	private static int n = 8;
	private static int[][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	private static final int PATHWAY_COLOR = 0;
	private static final int WALL_COLOR = 1;
	private static final int BLOCKED_COLOR = 2;
	private static final int PATH_COLOR = 3;
	
	public static boolean findMazePath(int x, int y) {
		if(x < 0 || y < 0 || x >= n || y >= n) { // 범위에서 벗어나면 false
			return false;
		}
		else if(maze[x][y] != PATHWAY_COLOR) // 지나갈 수 없는 길이라면 false
			return false;
		else if(x == n-1 && y == n - 1) { // 출구라면 true
			maze[x][y] = PATH_COLOR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOR;
			if(findMazePath(x-1, y) || findMazePath(x, y+1) || findMazePath(x+1, y) || findMazePath(x, y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOR;
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean result = findMazePath(2,1);
		System.out.println(result);
	}
}
















