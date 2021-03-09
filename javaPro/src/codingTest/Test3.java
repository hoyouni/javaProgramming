package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test3 {
    public static int[] solution(String[] purchase) {
    	String[] grade = {"bronze", "silver", "gold", "pla", "dia"};
    	//
    	String[] newChar = null;
    	Map<String, Integer> list = new TreeMap<String, Integer>();
    	for(int i = 0; i < purchase.length; i++) {
    		newChar = purchase[i].split(" ");
    		list.put(newChar[0].replace("2019", "").replace("/", ""), Integer.parseInt(newChar[1]));
    	}
    	System.out.println(list);
    	
    	Iterator<Entry<String, Integer>> ir = list.entrySet().iterator();
    	List<Integer> listA = new ArrayList<Integer>();
    	List<Integer> listB = new ArrayList<Integer>();
    	while(ir.hasNext()) {
    		Entry<String, Integer> ir2 = ir.next();
    		listA.add(Integer.parseInt(ir2.getKey()));
    		listB.add(ir2.getValue());
    	}
    	
    	System.out.println(listA);
    	System.out.println(listB);
    	
    	List<Integer> listC = new ArrayList<Integer>();
    	int cnt = 0;
    	int index = 1;
    	for(int i = 0; i < listA.size() - 1; i++) {
    		if(listA.get(index) - listA.get(i) < 30) {
    			cnt = listB.get(i);
    			listC.add(cnt);
    		}
    	}
    	
    	return null;
    }
	public static void main(String[] args) {
		String[] purchase = {"2019/01/01 5000", "2019/01/20 15000", "2019/02/09 90000"};
		int[] result = solution(purchase);
		System.out.println(Arrays.toString(result));
	}
}




































