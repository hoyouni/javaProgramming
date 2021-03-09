package socar;

class Solution {
   public int sol(String[] drum) {
      int answer = 0;
      for (int i = 0; i < 1; i++) {
         for (int j = 0; j < drum.length; j++) {
            if (drum[i].charAt(j) == '#') {
               int count = dfs(drum, i, j, 0);
               if(count >= 1) {
                  answer++;
               }
            }
         }
      }

      return answer;
   }

   private int dfs(String[] drum, int i, int j, int count) {
      if (i < 0 || i > drum.length || j < 0 || j > drum.length) {
         return count;
      }
      if (i == drum.length) {
         count++;
         return count;
      }

      if (drum[i].charAt(j) == '#') {
         count = dfs(drum, i + 1, j, count);
      } else if (drum[i].charAt(j) == '*') {
         count = dfs(drum, i + 1, j, '*', count);
      } else if (drum[i].charAt(j) == '<') {
         count = dfs(drum, i, j - 1, count);
      } else if (drum[i].charAt(j) == '>') {
         count = dfs(drum, i, j + 1, count);
      }

      return count;

   }

   private int dfs(String[] drum, int i, int j, char c, int count) {
      if (i < 0 || i > drum.length || j < 0 || j > drum.length) {
         return count;
      }
      if (i == drum.length) {
         count++;
         return count;
      }
      
      if (drum[i].charAt(j) == '#') {
         count = dfs(drum, i + 1, j, '*',  count);
      } else if (drum[i].charAt(j) == '*') {
         return 0;
      } else if (drum[i].charAt(j) == '<') {
         count = dfs(drum, i, j - 1, '*',  count);
      } else if (drum[i].charAt(j) == '>') {
         count = dfs(drum, i, j + 1, '*',  count);
      }

      return count;
   }

}

public class Test2 {
   public static void main(String[] args) {
      Solution s = new Solution();
      String[] drum = { "######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######" };
      System.out.println(s.sol(drum));

   }
}















