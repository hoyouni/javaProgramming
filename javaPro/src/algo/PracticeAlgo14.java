package algo;

public class PracticeAlgo14 {
	static int answer = 0;
	
	public static int solution(int[] numbers, int target) {
		dfs(numbers, 0, 0, target, " ");
		return answer;
	}

	public static void dfs(int[] numbers, int index, int sum, int target, String str) {
		System.out.printf("index = %d : sum = %d : str = %s : answer = %d target : %d\n", index, sum, str, answer, target);
		if(index>numbers.length) 
			return;
		if(index == numbers.length){
			if(sum==target){
				//System.out.println(str);
				answer++;
			}
			return;
		}
		
	
		dfs(numbers, index+1, sum + numbers[index], target, str + "+");
		dfs(numbers, index+1, sum - numbers[index], target, str + "-");
	
	}
	

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int result = solution(numbers, target);
		System.out.println(result);
	}
}

