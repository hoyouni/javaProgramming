package doItAlgo;

class GenericClassTester<T> {
	private T xyz;

	public GenericClassTester(T t) {
		this.xyz = t;
	}

	public T getGenericClassTester() {
		return xyz;
	}

}

public class Ex03C_03 {
	public static void main(String[] args) {
		GenericClassTester<String> s = new GenericClassTester("xyz");
		GenericClassTester<Integer> n  = new GenericClassTester(15);
		
		System.out.println(s.getGenericClassTester());
		System.out.println(n.getGenericClassTester());
	}
}






























