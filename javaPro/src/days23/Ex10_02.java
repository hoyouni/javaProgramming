package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex10_02 {

	public static void main(String[] args) {
		
		System.out.print("> 게임횟수, 입금액 입력 ? ");
		int n, money;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		money = scanner.nextInt();
		ArrayList<HashSet<Integer>> lottos =
				new ArrayList<HashSet<Integer>>(n);
		
		fillLottos(lottos, n); 
		
		printLottos(lottos); 

	}

	// [ 출력 형식 ]
	//1게임 : [][][][][][]
	//2게임 : [][][][][][]
	//3게임 : [][][][][][]
	private static void printLottos(ArrayList<HashSet<Integer>> lottos) {
		 //
		int cnt = 1;
		Iterator<HashSet<Integer>> ir = lottos.iterator();
		while (ir.hasNext()) {
			HashSet<Integer> lotto =  ir.next();
			System.out.printf("%d게임 : ", cnt++);
			Iterator<Integer> ir2 = lotto.iterator();
			while (ir2.hasNext()) {
				int	lottoNumber =  ir2.next();
				System.out.printf("[%02d]", lottoNumber);
			}
			System.out.println();
		}
	}

	private static void fillLottos(ArrayList<HashSet<Integer>> lottos, int n) {
		for (int i = 0; i < n; i++) {
			lottos.add(getLotto());
		}
	}

	private static void printLotto(HashSet<Integer> lotto) {
		
		Iterator<Integer> ir = lotto.iterator();
		while (ir.hasNext()) {
			int  lottoNumber=  ir.next();
			System.out.printf("[%02d]", lottoNumber);
		}
		System.out.println();
		
	}

	private static HashSet<Integer> getLotto( ) {
		HashSet<Integer> lotto = new HashSet<Integer>(6);
		while(lotto.size()<6) {
			int lottoNumber = (int)(Math.random()  * 45) +1;
			lotto.add(lottoNumber);
		}
		return lotto;
	}

}
//









//