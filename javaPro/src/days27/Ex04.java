package days27;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex04 {

	public static void main(String[] args) {
		String originalPath = "C:\\rhdsetup.log";
		String copyPath = "W:\\rhdsetup_copy.log";
		 
		// > 처리 시간 : 5609758ns
		fileCopy_charStream(originalPath, copyPath );
	}

	private static void fileCopy_charStream(String originalPath, String copyPath) {
		long start = System.nanoTime();
		
		try(
				FileReader fr = new FileReader(originalPath);
				FileWriter fw = new FileWriter(copyPath);
				){
			int c = -1;
			while( ( c =  fr.read()) != -1) {
				fw.write(c);
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		 
		long end = System.nanoTime();
		System.out.println("> 처리 시간 : " + (end - start)+"ns");
	}

}
//









//