package days19;
/**
 * 날짜 2019. 8. 23.
 * 파일명 Ex02.java
 * p 381 인터페이스
 */
public class Ex02 {
	public static void main(String[] args) {
		/*
		 * [인터페이스]
		 * 1. 참조타입 : 배열, 클래스, [인터페이스]
		 * 2. 일종의 [추상클래스]이다.
		 * 3. 인스턴스 메소드나 필드는 없으며 상수와 추상메소드, static메소드, default메소드만 존재 
		 * 4. 모든 멤버 변수는 public static final 이며 생략 가능하고 메소드 역시 public abstract 이며 생략 가능(static 메소드나 디폴트 메소드는 예외)
		 * 
		 */
		
		//추상클래스, 인터페이스에도 업캐스팅 가능
		Attackable fighter = new FighterLevel1();
		Attackable fighter2 = new FighterLevel2();
		
		
		//fighter.attack(u);
		//fighter.move(x, y);
		//fighter.stop();
	
	} //main
	
	public static void disp(Attackable attack) {
		
	} //method
	
} //Ex02


//인터페이스 상속 : extends 를 이용
//인터페이스는 다중 상속이 가능 : 필드가 없기 때문에 
interface Movable {
	void move(int x, int y);
} //Movable

interface Stopable {
	void stop();
} //Stopable

interface Attackable extends Movable, Stopable {
	//void move;
	void attack(Unit u);
	//void stop;
} //Attackable

abstract class Fighter extends Unit implements Attackable {

	@Override
	public void move(int x, int y) {

	}

	@Override
	public void stop() {

	}

} //Fighter

class FighterLevel1 extends Fighter {

	@Override
	public void attack(Unit u) {

	}
} //FighterLevel1

class FighterLevel2 extends Fighter {

	@Override
	public void attack(Unit u) {

	}
} //FighterLevel2

class Unit {

} //Unit
























