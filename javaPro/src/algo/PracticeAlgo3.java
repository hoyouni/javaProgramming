package algo;

public class PracticeAlgo3 {
	public static int solution(String skill, String[] skill_trees) {
		char[] step = skill.toCharArray();
		int count = 0;
		for(int i = 0; i < skill_trees.length; i++) {
			if(skill_trees[i].charAt(0) == step[0]) { //CBADF
				//System.out.println(skill_trees[i]);
				count++;
			}
			else if(skill_trees[i].charAt(0) < step[0]) { //BACDE AECB BDA
				if(!skill.contains(Character.toString(skill_trees[i].charAt(0)))) {
					count++;
				}
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int result = solution(skill, skill_trees);
		System.out.println(result);
	}
}




















