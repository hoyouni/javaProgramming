package days28;

import java.io.File;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		//    javaPro 폴더에   
		//    msg.txt 파일 객체를 생성...
		//    존재하다면   msg(1).txt
		//                   msg(2).txt
		String fileName = "msg.txt";		
		String name = "msg";  // 확장자를 뺀 파일명
		String ext = ".txt";       // 확장자		
		int index = 1;  // msg(1).txt  msg(2).txt		
		File f = new File(fileName);		
		 while ( f.exists()) {
			 fileName = String.format("%s(%d)%s", name, index, ext);
			 index++;
			 f  = new File(fileName);
		 }		 
		 // String fileName = getFileName(".", "msg.txt");
		 
		 f.createNewFile();
		 
		 System.out.println("END"); 

	}
	
	
	public static String getFileName(String parent, String fileName) { 
		String name = fileName.split("\\.")[0];
		String ext = fileName.split("\\.")[1];
		int index = 1;
		File f = new File(fileName);
		 while ( f.exists()) {
			 fileName = String.format("%s(%d).%s", name, index++, ext); 
			 f  = new File(fileName);
		 }
		 return fileName;  // msg(1).txt
	}

}
//









//