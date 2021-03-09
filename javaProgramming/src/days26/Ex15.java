package days26;

import java.io.IOException;
import java.util.ArrayList;

public class Ex15 {

	public static void main(String[] args) throws IOException {
		
		// 이름 입력하세요? kenik 엔터
		//System.in.read();
		//System.in.read(b);
		
		System.out.print("> 이름 입력하세요?" );
		
		// 배열
		// byte [] b = new byte[10];
		// 컬렉션 ?  List( ArrayList )
		ArrayList<Byte> list = new ArrayList<>(); 
		int i = -1;
		 
		// Ctrl + Z   -1
		while( (i = System.in.read()) != -1 ) {
			// System.out.println(i);
		    list.add(    (byte) i    );
		}
		// System.out.println(    list.size() );
		// ArrayList<Byte> ->  byte []
		byte [] bs = new byte[list.size()];
		for (int j = 0; j < bs.length; j++) {
			    bs[j]= list.get(j);
		}
		String name = new String( bs , 0, bs.length-2 );
		System.out.println( " > name : " + name  );
		System.out.println( " END ");
		
		 
		
		 
	}

}
//

/*
         ArrayList<Byte> list = new ArrayList<>();
		 System.out.print("> 이름 입력하세요? ");
		 int size = 0 ;
		 
		 try {
			 int i = 0;
			 while(  (i=  System.in.read() ) != -1 ) {
				 if( i == 13 ) break;
				 list.add((byte)i);
			 }
			 
		} catch (IOException e) {
			e.printStackTrace();
		} 
		  
		 byte[] result = new byte[list.size()];
		 for(int i = 0; i < list.size(); i++) {
		     result[i] = list.get(i) ;
		 }
		 
		String name = new String(  result );
		System.out.println(name);
 * */







//