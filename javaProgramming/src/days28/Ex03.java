package days28;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		String pathname = ".";
		// 
		File f = new File(pathname );
		
		// System.out.println(  f.isDirectory() );
		// System.out.println( f.getCanonicalPath() );
		
		// 자식폴더와 파일 목록 출력...
		/*
		String[] lists = f.list();
		for (int i = 0; i < lists.length; i++) {
			System.out.println( lists[i]);			
		}
		*/
		
		File[]  lists = f.listFiles();
		for (int i = 0; i < lists.length; i++) {
			File f2 = lists[i];
			long fileLength = f2.length();
			
			Long l = f2.lastModified();			
			Date d = new Date(l);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
			String lastModified = sdf.format(d);
					
			
			System.out.printf("%s\t%s\t%d(bytes)\t\t%s\n",
					f2.isDirectory() ? "폴더":"파일",
					f2.getName(), 
					fileLength,
					lastModified
					);
		}
		
		

	}

}
//









//