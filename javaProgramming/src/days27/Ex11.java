package days27;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.SequenceInputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Vector;

public class Ex11 {

	public static void main(String[] args) {
		// p 892 SequenceInputStream
		//          순차적
		// [여러 개의 입력스트림]을 연속적으로 연결해서 하나의 스트림으로 부터 데이터를 읽는 것과 
		// 같이 처리할 수 있도록 도와준다. 
		
		byte[] buf1 = { 1,2,3,4 };
		ByteArrayInputStream bis1 = new ByteArrayInputStream(buf1 );
		
		byte[] buf2 = { 5,6,7,8 };
		ByteArrayInputStream bis2 = new ByteArrayInputStream(buf2 );

		byte[] buf3 = { 9,10,11,12 };
		ByteArrayInputStream bis3 = new ByteArrayInputStream(buf3 );
		
		//SequenceInputStream sis = new SequenceInputStream(bis1,bis2);
		//SequenceInputStream sis2 = new SequenceInputStream( sis,, bis3) ;

		Vector<ByteArrayInputStream> list = new Vector<>();
		list.add(bis1);
		list.add(bis2);
		list.add(bis3);
		
		SequenceInputStream sis = new SequenceInputStream(  list.elements() );
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int data = 0;
		try {
			while( (data = sis.read()) != -1 ) {
				bos.write(data);
			}
		} catch (Exception e) { }		
		byte [] outSrc = bos.toByteArray();		
		System.out.println( Arrays.toString(outSrc) );

		// 읽기
		/*
		while ( ( b= bis1.read() ) != -1 ) {
			//
		}
		while ( ( b= bis2.read() ) != -1 ) {
			//
		}
		while ( ( b= bis3.read() ) != -1 ) {
			//
		}
		*/
	}

}
//









//