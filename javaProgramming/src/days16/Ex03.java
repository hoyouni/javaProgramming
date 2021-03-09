package days16;

/**
 * @Author k≡n¡k
 * @Source Ex03.java
 * @Date 2019. 8. 20. - 오전 11:13:26
 * @Subject p 287 가변인자(varargs)와 오버로딩.
 *                          Object... args
 */
public class Ex03 {

	public static void main(String[] args) {
		// System.out.printf(String format, Object... args)
		// String format = "%d %d %d %c";
		// System.out.printf(format, 10, 20, 30, 'A');
		
		int result =  sum(1,2);
		System.out.println(result);
		
		result =  sum(1,2,3);
		System.out.println(result);

		result =  sum(1,2,3,4);
		System.out.println(result);
		
		result =  sum(1,2,3,4,5);
		System.out.println(result);
		
		// 
		int [] m = {1,2,34,3,4,54, 43,4,443,4,34};
		result =  sum(m);
		System.out.println(result);
	}
	
	private static int sum(int... m) {
		int result = 0;
		 for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}

	/*
	private static int sum(int[] m) {
		int result = 0;
		 for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}

	private static int sum(int i, int j, int k, int l, int m) { 
		return i+j+k+l+m;
	}

	private static int sum(int i, int j, int k, int l) { 
		return i+j+k+l;
	}

	// 오버로딩
	private static int sum(int i, int j, int k) {
		 
		return i+j+k;
	}

	private static int sum(int i, int j) {		 
		return i+j;
	}
	*/

}
//









//