package days26;

/**
 * @Author k≡n¡k
 * @Source Ex12.java
 * @Date 2019. 9. 3. - 오후 12:17:27
 * @Subject p 868 Chapter 15 입출력 IO 
 */
public class Ex12 {

	public static void main(String[] args) {
		/*
		 * >  <
		 * [ 자바의 입출력( Input / Output ) ]
		 * 1. 입출력?  스트림( Stream )   "흐르는 물", 단방향
		 * 2. 스트림 기능적 종류  
		 *    ㄱ. 입력 스트림 :   BufferedReader,   FileReader
		 *    ㄴ. 출력 스트림 :   BufferedWriter ,    FileWriter
		 * 3. 스트림 종류
		 *    ㄱ. 바이트 스트림
		 *         1) 1 byte( 8 bit )
		 *         2) 바이트, 정수, 바이트 배열 
		 *         3) 최상위 부모 클래스: InputStream( 입력 스트림 )
		 *                                     OutputStream( 출력 스트림 )
		 *         
		 *         파일
		 *         File +InputStream/OutputStream   바이트스트림  ??.exe  ??.dll
		 *         File +Reader/Writer                       문자 스트림   ??.txt
		 *         
		 *         메모리(바이트 배열)  스트림
		 *         ByteArray + InputStream/OutputStream 바이트 스트림
		 *         
		 *         프로세스( 프로세스 간의 통신 ) ? 실행 중 인 프로그램
		 *         Piped + InputStream/OutputStream 바이트 스트림
		 *         
		 *         오디오 장치
		 *         Audio + InputStream/OutputStream 바이트 스트림
		 *         
		 *         등등 
		 *         
		 *    ㄴ. 텍스트(문자) 스트림
		 *         1) 2byte
		 *         2) 한문자, 문자배열, 문자열...    
		 *         3) 최상위 부모 클래스 : Reader( 입력 스트림 )
		 *                                      Writer ( 출력 스트림 )
		 * 
		 * 
		 *  4. [보조] 스트림   p 871
		 *     : 스트림의 기능을 보완하기 위해 사용되는 스트림
		 *     :                          
		 *    필터 바이트 스트림 
		 *    Filter  + InputStream/OutputStream
		 *    버퍼 바이트 스트림
		 *    Buffered + InputStream/OutputStream
		 *    데이터( 기본형 )  바이트 스트림
		 *    Data + InputStream/OutputStream
		 *    
		 *    두 개의 스트림을 하나로 연결 바이트 스트림
		 *    SequenceInputStream/ X
		 *    
		 *    라인번호   바이트 스트림
		 *    LineNumber + InputStream/ X
		 *    
		 *    객체 단위 바이트 스트림
		 *    Object + InputStream/OutputStream
		 *    
		 *    인쇄(print)
		 *    X / PrintStream 바이트 스트림
		 *    
		 *    
		 * */
	}

}
//









//