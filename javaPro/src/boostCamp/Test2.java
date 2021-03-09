package boostCamp;

import java.util.LinkedList;

public class Test2 {
   
   public static void main(String[] args) {
      int[] arrayA= {1, 2, 3, 2};   
      int[] arrayB= {1, 3};      
      LinkedList<Integer> setA = new LinkedList<Integer>();
      LinkedList<Integer> setB = new LinkedList<Integer>();
      int[] answer = new int[5];

      for(int i = 0; i < arrayA.length; i++) {
         if(setA.contains(arrayA[i])) {
            continue;
         }
         setA.add(arrayA[i]);
      }
      
      for(int i = 0; i < arrayB.length; i++) {
         if(setB.contains(arrayB[i])) {
            continue;
         }
         setB.add(arrayB[i]);
      }
      
      answer[0] = setA.size();
      answer[1] = setB.size();
      answer[2] = sum(setA, setB);
      answer[3] = complement(setA, setB);
      answer[4] = intersect(setA, setB);
       
   }
   
   public static int sum(LinkedList<Integer> setA, LinkedList<Integer> setB ) {
      LinkedList<Integer> listA = (LinkedList<Integer>) setA.clone();
      LinkedList<Integer> listB = (LinkedList<Integer>) setB.clone();
      
      for(int i = 0; i < listB.size(); i++) {
         if(listA.contains(listB.get(i))) {
            continue;
         }else {
            listA.add(listB.get(i));
         }
      }
      
      return listA.size();
   }
   
   public static int complement(LinkedList<Integer> setA , LinkedList<Integer> setB ) {
      LinkedList<Integer> listA = (LinkedList<Integer>)setA.clone();
      LinkedList<Integer> listB = (LinkedList<Integer>)setB.clone();
      
      for(int i = 0; i < listB.size(); i++) {
         if(listA.contains(listB.get(i))) {
        	 listA.remove(listB.get(i));
         }
      }
      
      return listA.size();
   }

   public static int intersect(LinkedList<Integer> setA , LinkedList<Integer> setB) {
      LinkedList<Integer> listA = (LinkedList<Integer>) setA.clone();
      LinkedList<Integer> listB = (LinkedList<Integer>) setB.clone();
      LinkedList<Integer> listC = new LinkedList<Integer>();
      
      for(int i = 0; i < listA.size(); i++) {
         if(listB.contains(listA.get(i))) {
        	 listC.add(listA.get(i));
         }
      }
      
      return listC.size();
   }
   
}
































