package days19;

public class NewCar {
	String name;
	String gearType;
	int initialCapacity;
	// 좋은 코딩 X
	//Engine engine = new Engine(); // engine 객체 인스턴스 필드 
	
	//인터페이스로 필드 선언
	IEngine engine; //선언만 하고 객체 생성시에 new 연산자로 생성하는것이 좋음
	//int[] m = new int[10];


	// constructor
	public NewCar() {
		engine = new L_Engine();
		
	}

	NewCar(String name, String gearType, IEngine engine) {
		this.name = name;
		this.gearType = gearType;
		this.engine = engine;
	}
	
	NewCar(String name, String gearType, IEngine engine, int initialCapacity) {
		this(name, gearType, engine);
		this.initialCapacity = initialCapacity;
	}


	// methods
	public void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}

	public void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}

	public void stop() {
		this.engine.stop();
	}

}
