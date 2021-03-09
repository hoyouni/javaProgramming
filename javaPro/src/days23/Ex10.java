package days23;

import java.util.HashSet;
import java.util.Iterator;

public class Ex10 {

	public static void main(String[] args) {
		// 로또 게임  -- HashSet
		HashSet<Integer> lotto = new HashSet<Integer>(6);
		// System.out.println( lotto.size() );  // 0
		fillLotto(lotto);
		printLotto(lotto);

	}

	private static void printLotto(HashSet<Integer> lotto) {
		
		Iterator<Integer> ir = lotto.iterator();
		while (ir.hasNext()) {
			int  lottoNumber=  ir.next();
			System.out.printf("[%02d]", lottoNumber);
		}
		System.out.println();
		
	}

	private static void fillLotto(HashSet<Integer> lotto) {
		 
		while(lotto.size()<6) {
			int lottoNumber = (int)(Math.random()  * 45) +1;
			lotto.add(lottoNumber);
		}
		
		
	}

}
//









//