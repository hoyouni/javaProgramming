package days24;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Properties;

public class Ex07 {

	public static void main(String[] args) {
		// p 651 해싱과 해싱함수
		// [해싱] 이란? (해시함수)를 이용해서 데이터를 (해시테이블)에 저장하고 검색하는 [기법].		
		// [해시함수] ? 데이터 저장소를  알려주어 원하는 데이터를 빠르게 찾을 수 있다.
		// 해싱을 구현한 컬렉션 클래스 ?   Hashtable, HashSet, HashMap , Hash~~
		// 해싱기법 =  배열 + 링크드리스트 ( 자료 구조 )
		
		
		//  p 658 Properties 컬렉션 클래스
		// 1. HashMap의 구버전 ( 권 장 )
		// 2. Hashtable을 상속받아서 구현.
		// 3. 특징 :   Map 계열
		//               key-value
		//               String - String
		// 4. 사용 :  애플리케이션의 환경설정
		//              데이터를 파일로 부터 읽고/쓰기
		
		Properties  pmap = new Properties();

		pmap.setProperty("driver", "oracle.jdbc.OracleDriver");
		pmap.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		pmap.setProperty("uid", "scott");
		pmap.setProperty("pwd", "tiger");
		
		// 파일 쓰기...
		String fileName ="jdbc_config.properties";
		try(Writer writer = new FileWriter(fileName);){
			pmap.store(  writer , "> JDBC 설정 정보 <");
			//pmap.storeToXML( new FileOutputStream("jdbc_config.xml") , "> JDBC 설정 정보 <");
		}catch(Exception e) {
			System.out.println(">< : " + e.toString());			
		}
		
		System.out.println(" END ");
		
		
		
		
		/*
		pmap.put("driver", "oracle.jdbc.OracleDriver");
		pmap.put("url", "jdbc:oracle:thin:@localhost:1521:xe");
		pmap.put("uid", "scott");
		pmap.put("pwd", "tiger");
		*/
		//System.out.println( pmap.size() );
		//System.out.println( pmap.get("url") );
		
		// pmap.entrySet();
		//pmap.containsKey(key);
		//pmap.containsValue(value);
		// pmap.isEmpty();
		// Set pmap.keySet(  )   + iterator
		/*
		Enumeration en = pmap.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			System.out.println(key);
		}
        */
		
		// Enumeration<Object> pmap.elements()
		
		// [ket 해당되는 value 를 가져올 때 사용하는 메소드]
		//Object pmap.get(key);
		//***String  pmap.getProperty(key); ***
		
		// 저장
		// pmap.save(out, comments);
	}

}
//









//