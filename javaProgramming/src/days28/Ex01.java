package days28;

import java.io.File;
import java.io.IOException;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 9. 5. - 오전 7:41:33
 * @Subject 자바 입출력 ( IO )    p 915
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		// 1. 가장 많이 사용되는 입출력 대상( 중요 )
		// *** 2. 파일 + 디렉토리
		
		String pathname = "..\\Hello.java";
		File f = new File(pathname);
		
		/*
		String parent = "C:\\D\\Class\\JavaClass\\";
		String child = "Hello.java";
		File f = new File(parent, child);
		*/
		
		// 1. getName()
		String fileName = f.getName();
		System.out.println( fileName );  // Hello.java
		
		// 2. Hello                   .java
		//System.out.println("> 확장자가 없는 파일명 : " + fileName.split("\\.")[0] );
		//System.out.println("> 확장자 : " + fileName.split("\\.")[1] );
		
		System.out.println("> 확장자가 없는 파일명 : " + fileName.split("[.]")[0] );
		System.out.println("> 확장자 : " + fileName.split("[.]")[1] );
		
	   int pos = fileName.lastIndexOf(".");
	   fileName.substring(0, pos);
	   fileName.substring(pos);
		
	   // 3. 경로 ( 상대 경로 로 표시했을 때 )
	   System.out.println( f.getPath() );
	   System.out.println( f.getAbsolutePath());   // 절대경로
	   System.out.println( f.getCanonicalPath() ); // 정규경로
	   
	   // 4.  ..
	   System.out.println( f.getParent() );
	   
	   // 5.  경로 구분   역슬래쉬(\)      static 변수
	   System.out.println( File.separator );        // String
	   System.out.println( File.separatorChar ); // Char
	   
	   // *** 6.  C:\D\Class\JavaClass\javaPro  사용자 경로 확인하기 
	   System.out.println( System.getProperty("user.dir") );
	   
		 

	}

}
// 여원경(09:13), 정영진(10:30), 김호연(09:18)
// 박성재(30), 정의호(09:10), 천재희(09:35)
 


// 김수빈( 학교 )








//