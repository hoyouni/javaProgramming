package days15;

import days14.Point;

/**
 * @Author k≡n¡k
 * @Source Ex07.java
 * @Date 2019. 8. 19. - 오후 3:01:50
 * @Subject 클래스 앞에 선언할 수 있는 접근지정자의 종류와 특징( 암기 ) 
 */
public class Ex07 {

	public static void main(String[] args) {
		// public Point 클래스와 Ex07 클래스는 서로 다른 패키지 안에 선언되어져 있다. 
		
		// Point cannot be resolved to a type
        Point p1 = new Point();
        //p1.dispPoint();

        
        Point p2 = new Point();
        p2.x = 20;
        System.out.println(p2.x);
        // 멤버 앞에 붙는 접근 지정자 설명 p 348
        // 접근제어자(지정자)를 사용할 수 있는 곳 ?    클래스 앞, 멤버(필드 앞, 메서드 앞, ***[생성자 앞], ***[생성자 앞])
        
        // 1.  public - 접근 제한이 없다. ( 다른 패키지 )
        // 2.  default - 같은 패키지 내에서만 접근이 가능하다. 
        //      (   int y   )
        // 3.  private - 같은 클래스 내에서만 접근이 가능하다. 
        // 4.  protected = default + 상속( 자속 클래스 에서 접근 가능 )
        
	}

}
//









//