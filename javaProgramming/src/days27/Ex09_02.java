package days27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex09_02 {

	public static void main(String[] args) {
		// p 886 DateInputStream/ DataOutputStream 
		String name  ;
		int kor  , eng  , mat , tot  ;
		double avg  ;
		boolean gender  ;
		
		String fileName = "학생성적.txt";
		try(
				FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
				){
			String line = null;
			while( ( line = br.readLine() )!= null ) {
				if( line.equals("") ) continue;
				//System.out.println( line );			   
				String[] data  = line.split(",");
				name =   data[0] ;
				kor = Integer.parseInt(data[1]);
				eng = Integer.parseInt(data[2]);
				mat = Integer.parseInt(data[3]);
				tot = Integer.parseInt(data[4]);
				avg = Double.parseDouble(data[5]);
				gender = Boolean.parseBoolean(data[6]);
				
				System.out.printf("%s,%d,%d,%d,%d,%.2f,%b\n"
				, name, kor, eng,mat,tot,avg,gender);
				
				 
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("END");
	}

}
//









//