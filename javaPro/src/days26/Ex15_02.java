package days26;

import java.io.IOException;
import java.util.ArrayList;

public class Ex15_02 {

	public static void main(String[] args) throws IOException { 
		
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
		 
		
		 
	}

} 







//