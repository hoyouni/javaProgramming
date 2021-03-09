package days24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex08 {

	public static void main(String[] args) {
		Properties  pmap = new Properties();
		
		// Properties<String, String> 컬렉션 클래스 , Map 계열
		String fileName ="jdbc_config.properties";
		
		try {
			pmap.load(new FileReader(fileName));
		} catch (IOException e) { 
			e.printStackTrace();
		}  
		
		
		/*
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			String line = null;
			while(  (line=br.readLine()) != null ) {				
				if( !line.startsWith("#") ) {
					String [] entry =  line.split("=");
					pmap.setProperty(entry[0], entry[1]);
				}
			}
			
		}catch(Exception e) {}
		*/
		pmap.list(System.out);

	}

}
//









//