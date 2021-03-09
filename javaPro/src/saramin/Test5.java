package saramin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test5 {
   
   public static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int fNum = Integer.parseInt(st.nextToken());
      int SNum = Integer.parseInt(st.nextToken());
      
      String line = br.readLine();
      LinkedList<Object> list = new LinkedList<Object>();
      
      for(int i = 0; i < SNum; i++) {
         st = new StringTokenizer(br.readLine());
         
         int start =Integer.parseInt(st.nextToken());
         int end =Integer.parseInt(st.nextToken());
         
         char text = (char)check(start , end , line);
         list.add(text);
      }
      br.close();
      
      for(int i = 0 ; i < list.size(); i++) {
         System.out.println(list.get(i));
      }
   }
   
   public static int idxMax(int[] getAlpha) {
      int max = getAlpha[0];
      int idx = 0;
      for(int i = 1 ; i < getAlpha.length; i++) {
         if(getAlpha[i] > max) {
            max = getAlpha[i];
            idx = i;
            
         }
      }
      return idx;
   }
   
   public static int check(int start , int end , String line) {
      int[] getAlpha = new int[26];
      for(int i = start-1; i < end ; i++) {
         int find = line.charAt(i);
         getAlpha[find-65]++;
      }
      int idx = idxMax(getAlpha);
      return idx+65;
   }
}














