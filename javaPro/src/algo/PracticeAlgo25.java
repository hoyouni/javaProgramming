package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeAlgo25 {
	public static void main(String[] args) {
		long answer=0;
		long n=4;
		int idx=0;

		ArrayList<Double> list = new ArrayList<Double>();

		while(list.size()<=n) {
			double num=Math.pow(3,idx);

			ArrayList list2 = (ArrayList) list.clone();
			for(int i=0; i<list2.size() ; i++) {

				double plus = (double) list2.get(i);
				list.add(num+plus);

			}
			list.add(num);
			Collections.sort(list);
			idx++;
		}
		
		double k = list.get((int)n-1);
		int result = (int)k;
		
		System.out.println(result);
	}

}



















