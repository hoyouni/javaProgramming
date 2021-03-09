package days26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

public class Ex14_02 {

	public static void main(String[] args) {
	 
		String path = "src\\days26\\BMW.jpg";
		
		// 버퍼
		byte [] b = new byte[100];
		
		try {
			InputStream is = new FileInputStream(path);
			// int read() 0~255 정수
			
			// int read(byte [] b)         75 byte
			int size = -1;
			DecimalFormat df = new DecimalFormat("00000000");
			
			while(  (size = is.read( b )) != -1 ) {
				//System.out.println( Arrays.toString(b) );
				for (int i = 0; i < size; i++) {
					
				    try {
						String a =  Integer.toBinaryString( b[i]);
						int x =  Integer.parseInt( a );
						String data =  df.format( x);
						System.out.println(data);	
				    }catch(java.lang.NumberFormatException e) {
				    	System.out.println("11111111");
				    }
					
					//String data =  String.format("%08d"
					//		  , Integer.parseInt(Integer.toBinaryString(  b[i] )  ) );
					//System.out.println(data);
					
				}
			}
			 
			 
		} catch (FileNotFoundException e) { 
			// java.io.FileNotFoundException
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		
		
	}


}
//  "00000"101
// "101"   b.length()  8-3=5

// "101" ->  101
// String.format("%08d", 11) ;  //  0000101









//  김수빈( 9/5 목 ) 