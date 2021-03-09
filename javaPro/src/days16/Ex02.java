package days16;

import days14.Point;

public class Ex02 {

	public static void main(String[] args) {
		int x= 10, y = 20;
		int [] m = {10,20};
		System.out.printf("x=%d, y=%d\n", x, y);
		//swap(x, y);
		
		// [참조타입 매개변수] 
		Point p = new Point();
		p.x= 10;
		p.setY(20);
		// swap(m);
		swap(p);
		System.out.printf("x=%d, y=%d\n", x, y);
	}

	private static void swap(Point p) {
		int temp = p.x;
		p.x = p.getY();
		p.setY( temp );
	}

	private static void swap(int[] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}

	private static void swap(int x, int y) {  // call by value
		int temp = x;
		x = y;
		y = temp;
	}

}
//









//