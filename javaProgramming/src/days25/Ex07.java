package days25;

public class Ex07 {

	public static void main(String[] args) {
		// p 694 
		
		Direction d1 =  Direction.EAST;
		System.out.println(d1);
		System.out.println(d1.name());
		System.out.println(d1.ordinal());
		System.out.println(d1.getValue());
		
		//System.out.println(d1.valueOf("EAST"));
		//System.out.println(Direction.valueOf("EAST"));
		
		/*
		Direction [] dArr = Direction.values();
		for (Direction d : dArr) {
			System.out.printf("%s - %d\n", d.name(), d.ordinal());
		}
		*/

	}

}
//









//