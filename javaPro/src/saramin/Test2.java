package saramin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class StackS {
   private int capacity;
   private int ptr;
   private int[] stk;

   public class EmptyIntStackException extends RuntimeException {
      public EmptyIntStackException() {
      }
   }

  
   public class OverflowIntStackException extends RuntimeException {
      public OverflowIntStackException() {
      }
   }

   public StackS() {
      ptr = 0;
      
      capacity = 10;
      try {
         stk = new int[capacity]; 
      } catch (OutOfMemoryError e) { 
    	  capacity = 0;
      }
   }

   public int push(int x) throws OverflowIntStackException {
      if (ptr >= capacity) { 
         
         throw new OverflowIntStackException();
      }
      return stk[ptr++] = x;
   }

   public int pop() throws EmptyIntStackException {
      if (ptr <= 0) { 
        
         throw new EmptyIntStackException();
      }
      return stk[--ptr];
   }

   public void dump() {
      if (ptr <= 0)
         System.out.println("underflow");
      else {
         for (int i = 0; i < ptr; i++)
            System.out.print(stk[i] + " ");
         System.out.println();
      }
   }
   
   public int size() {
		return ptr;
	}
}

public class Test2 {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int cnt = Integer.parseInt(br.readLine());

      StackS s = new StackS();

      while (true) {
         int menu = Integer.parseInt(br.readLine());
         
         if (menu == 0) {
            try {
               s.push(Integer.parseInt(br.readLine()));
               if(cnt == s.size()) {
            	   s.dump();
            	   break;
               }
            } catch (StackS.OverflowIntStackException e) {
               System.out.println("overflow");
            }
         } else if (menu == 1) {
            try {
               s.pop();
            } catch (StackS.EmptyIntStackException e) {
               System.out.println("underflow");
            }
         } else {
            s.dump();
            break;
         }
      }
   }
}