package days21;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

/**
 * 날짜 2019. 8. 27.
 * 파일명 Ex07.java
 */
public class Ex07 {
	public static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		for(byte b : bArr) 
			sj.add(String.format("%02X", b));
		return sj.toString();
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가";

		byte[] bArr = str.getBytes("UTF-8");
		byte[] bArr2 = str.getBytes("CP949");

		System.out.println("UTF-8: " + joinByteArr(bArr));
		System.out.println("CP949: " + joinByteArr(bArr2));

		System.out.println("UTF-8: " + new String(bArr, "UTF-8"));
		System.out.println("CP949: " + new String(bArr2, "CP949"));




		/*
		//String.valueOf() : 인자값을 문자열로 바꾸는 함수 
		//							 인자에 객체가 들어왔다면 toString() 으로 바꿔줌
		//String n = String.valueOf(10);
		//n = String.valueOf(true);

		//String n = "abc ";
		//System.out.println(n.trim()); //마지막 문자열에 담긴 공백을 제거하는 함수

		String data = "문자열의 앞 뒤 공백 제거";
		byte[] datas = data.getBytes(); //String -> byte 배열로 변환 


		for (byte b : datas) {
			System.out.println(b);
		}
		 */
	}
}
