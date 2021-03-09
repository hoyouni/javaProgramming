package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex09 {

	public static void main(String[] args) {
		// [시스템의 속성] 확인하는 방법.
		Properties prop =  System.getProperties();
		
		
		
		prop.list(System.out);
		
		/*
		Enumeration<Object> en = prop.keys();
		while (en.hasMoreElements()) {
			String p_key = (String) en.nextElement();
			String p_value = System.getProperty(p_key);
			System.out.printf("%s : %s\n", p_key, p_value);
		}
		*/
		
		
		
		/*
		//              속성(k,v)
		System.getProperties();
		System.getProperty(key);
		System.getProperty(key, def);
		
		//              환경
		System.getenv();
		System.getenv(name);
		*/
		

	}

}
//









//