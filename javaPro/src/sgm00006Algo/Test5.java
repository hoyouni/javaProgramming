package sgm00006Algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {
	public static int solution(int n) {
        String num = Integer.toString(n, 3);
        String[] list = num.split("");
        List<String> list2 = new ArrayList<String>();
        
        String str = "";
        for(int i = 0; i < list.length; i++) {
        	list2.add(list[list.length - 1 - i]);
        	str += list2.get(i);
        }
        
        int result = Integer.parseInt(str, 3);
        
		return result;
    }
	public static void main(String[] args) {
		int n = 45;
		int result = solution(n);
		System.out.println(result);
	}

}














