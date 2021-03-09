package days27;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Ex05 {

	public static void main(String[] args) {
		// p 875
		// (메모리 스트림)바이트배열   
		// 바이트스트림
		// ByteArray + InputStream/OutputStream
		// 1. 메모리 스트림
		// 2. 주로 다른 곳에 입출력 하기 전에 데이터를  메모리 상에  임시 담아서 변환해서 사용..
				
		// (메모리 스트림) 
		// 문자스트림
		// CharArray + Reader/Writer
		
		byte [] inSrc = {};
		byte [] outSrc = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int b = 0;
		while(   (b= bis.read()) != -1 ) {
			bos.write(b);
		}
		
		// bos -> outSrc 출력
		outSrc = bos.toByteArray();
		
		// 파일 -> [       fis    fos]  -> 파일
		// byte[] ->[  bis    bos ] -> byte[]
		// inSrc       메모리스트림          outSrc

	}

}
//









//