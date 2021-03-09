package days16;

public class Ex06 {

	public static void main(String[] args) {
		 
		
		/*
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		*/
		// 클래스의 복사( copy )와 복제( clone )
		Point p1 = new Point(10, 20);
		
		Point p4 = new Point( p1 );
		// 
		Point p2 = new Point( p1.x, p1.y   );  // 복제
		
		// 클래스 복사
		Point p3 = p1;
		
	} // main

}// class

class Point{
	int x;
	int y;
	
	public Point() {  
		
	}
	public Point(int i, int j) {
		 x = i;
		 y = j;
	}
	
	// 생성자를 이용한 인스턴스 복사
	//                    "    복제     "
	public Point(Point p1) {
		x = p1.x;
		y = p1.y;
	}
}









//