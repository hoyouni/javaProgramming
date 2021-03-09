package days26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;

public class Ex14 {

	public static void main(String[] args) {
		// 
		// String path = ".\\src\\days26\\BMW.jpg";
		String path = "src\\days26\\BMW.jpg";
		
		try {
			InputStream is = new FileInputStream(path);
			int b = 0 ;
			 
			// 0~255  정수
			while(  (b =  is.read()  )!=-1 ) {
				// System.out.println(b);  // Integer.toBinaryString(b)
				// 
				//DecimalFormat df = new DecimalFormat("00000000");
				//String data =  df.format( Integer.parseInt(Integer.toBinaryString(b) ));
				//System.out.println(data);
				
				String data =  String.format("%08d"
						  , Integer.parseInt(Integer.toBinaryString(b)  ) );
				System.out.println(data);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { 
					e.printStackTrace();
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