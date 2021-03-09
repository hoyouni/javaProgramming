package days11;

public class Ex03 {
	
	public static void main(String[] args) {
		 int [] m = {10,20,30};
		 // 
		 int [] temp = new int[m.length + 3];
		 // 
		 for (int i = 0; i < m.length; i++) {
			temp[i] = m[i];
		}
		 temp[3] = 100;
		 m = temp;
		 
		 for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]", m[i]);
		}
		 System.out.println();
	}
}
	
	// 삭제할 값 : 5
	// 삭제할 인덱스값 : 5
	//  	m[0]=1	m[1]=2	m[2]=3	m[3]=100	m[4]=4	m[5]=7	m[6]=7	m[7]=0	m[8]=0	
	/*
	public static void main(String[] args) {
		//int index = 0;
		int index [] = {0};
		add(index);

		System.out.println(index[0]);
	}

	private static void add(int [] index) {
		// 
		index[0]++;
		
	}
	*/


//









//