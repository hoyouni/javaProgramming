package dataStructure;

class ArrayList {
	private Object[] elementData = new Object[100];
	private int size = 0;
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	public boolean add(int index, Object element) {
		for(int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		
		elementData[index] = element;
		size++;
		
		return true;
	}
	
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	public String toString() {
		String str = "[";
		for(int i = 0; i < size; i++) {
			str += elementData[i];
			if(i < size - 1) {
				str += ",";
			}
		}
		
		return str + "]";
	}
	
	public boolean remove(int index) {
		for(int i = index + 1; i < size; i++) {
			elementData[i - 1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		
		return true;
	}
	
} // class

// ArrayList 구현 
public class Ex03 {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(5);
		numbers.remove(2);
		System.out.println(numbers);
		
	}
}
































