package days27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex04_02 {

	public static void main(String[] args) {
		String originalPath = "C:\\rhdsetup.log";
		String copyPath = "W:\\rhdsetup_copy.log";
		 
		// > 처리 시간 : 5609758ns
		// > 처리 시간 : 1960561ns
		fileCopy_charStream(originalPath, copyPath );
	}

	// 보조 스트림을 사용해서 파일 복사( reader/writer )
	private static void fileCopy_charStream(String originalPath, String copyPath) {
		long start = System.nanoTime();
		
		File copyFile = new File(originalPath);
		//File copyFile = new File( "c\\aaa\\bbb\\", "abc.txt" );
		
		long fileSize = copyFile.length();
		System.out.printf("복사할 파일 크기 : %d(bytes)\n", fileSize);
		
		try(
				FileReader fr = new FileReader( copyFile );
				FileWriter fw = new FileWriter(copyPath);
				// 문자 보조 스트림 + 라인단위 처리 기능
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				){
			
			String line = null;
		    while (  (line = br.readLine()) != null ) {
				bw.write(line);
				bw.newLine();
			}
		    
			/*
			int c = -1;
			while( ( c =  fr.read()) != -1) {
				fw.write(c);
			}
			*/
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		 
		long end = System.nanoTime();
		System.out.println("> 처리 시간 : " + (end - start)+"ns");
	}

}
//









//