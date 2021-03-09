package collectionFramework;

import java.util.Arrays;

public class Practice2 {
	 public static String solution(int n) {
		 String[] str = {"수", "박"};
		 String[] result = new String[n];
		 String result2 = "";
		 int index = 0;
		 int cnt = 0;
		 
		 while(index < n) {
			 result[index] = str[cnt];
			 result2 += result[index];
			 cnt++;
			 index++;
			 if(cnt > 1) {
				 cnt = 0;
			 }
		 }
		 
		 
		 
	      return result2;
	  }
	
	public static void main(String[] args) {
		int n = 3;
		String result = solution(n);
		System.out.println(result);
	}
}
















