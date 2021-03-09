package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex17 {

	public static void main(String[] args) {
		// BMW.jpg
		// D 복사..
		String originalPath =  "C:\\Program Files\\EditPlus\\editplus.exe";
		String name ="W:\\editplus_copy.exe";
		
		try(  FileInputStream fis = new FileInputStream(originalPath);
				FileOutputStream fos = new FileOutputStream(name);){
			int b;
			while(   ( b = fis.read() ) != -1 ) {
				System.out.println(b);
				fos.write(b);
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println(" END ");

	}

}
//









//