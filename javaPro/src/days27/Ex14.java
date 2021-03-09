package days27;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex14 {

	public static void main(String[] args) throws IOException {
		// p 911 RandomAccessFile
		// 1. 입력 + 출력 스트림
		// 2. 기본 자료형을 읽고 쓰기 가능.
		// 3. ***    파일의 어느 위치나 읽기/쓰기 가능
		String s = "I Love noraml Java";
		String q = "javabook";
		
		String name = "random.txt";		
		String mode = "rw";  // 읽기 + 쓰기
		
		try( RandomAccessFile raf = new RandomAccessFile(name, mode) ){			
			raf.writeBytes(s);			
		}catch(Exception e) {			
		}
		
		System.out.println(" 아무키나 누르면 계속합니다. ");
		System.in.read();
		System.in.skip(System.in.available());
		
		try( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			raf.seek( 7 ); // 파일 포인터( file-pointer ) 이동
			raf.writeBytes(q);
		}catch(Exception e) {}
		
		System.out.println(" 아무키나 누르면 계속합니다. ");
		System.in.read();
		System.in.skip(System.in.available());
		
		try( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			raf.seek( 2 ); // 파일 포인터( file-pointer ) 이동
			String line =  raf.readLine();
			System.out.println( line );
		}catch(Exception e) {}
	}

}
//









//