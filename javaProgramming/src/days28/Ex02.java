package days28;

import java.io.File;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		String pathname = "W:\\sample\\test.txt";
		// String pathname = "W:\\sample\\";		
		// String pathname = "..\\Hello.java";
		File f = new File(pathname );
		// 1.  존재 유무 확인
		//System.out.println( f.exists() );   // false
		
		// 2.  f 파일객체가 파일/디렉토리 확인
		//System.out.println( f.isDirectory()  );  // true
		//System.out.println( f.isFile()  );           // false
		
		// 3.
		//W:\\sample 폴더가 있는 지 확인 하고 폴더 먼저 생성
		// ㄱ. 디렉토리 유무 확인
		File dir = new File("W:\\sample\\box");
		if( !dir.exists() ) {
			// ㄴ. 디렉토리 생성
			//dir.mkdir();
			dir.mkdirs();  
		}		 
		
		if( !f.exists()) {
			f.createNewFile(); 
		}
		
		System.in.read();
		System.out.println("엔터치면 파일명 변경합니다. ");
		System.in.skip(System.in.available());
		
		// 1. test.txt -> smaple.txt
		// 파일객체.renameTo(변경할파일객체)
		f.renameTo(new File("W:\\sample\\sample.txt"));
		
		// sample.txt 파일 삭제 
		f = new File("W:\\sample\\sample.txt");
		System.out.println(   f.delete()   );  // true, false
		//		f.deleteOnExit();
		
		
		System.in.read();
		System.out.println("파일 삭제 \n엔터치면 파일명 변경합니다. ");
		System.in.skip(System.in.available());
		
		// smaple 폴더 삭제
		//
		dir = new File("W:\\sample\\box");
		dir.delete();
		
		System.out.println("END");

	}

}
//









//