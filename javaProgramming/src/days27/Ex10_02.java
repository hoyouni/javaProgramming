package days27;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex10_02 {

	public static void main(String[] args) {
		// p 886 [ DateInputStream/ DataOutputStream ] 
		 
		String name  ;
		int kor , eng , mat ;
		int tot ;
		double avg ;
		boolean gender  ; 		
		//
		String fileName = "학생성적.dat";
		try (
				FileInputStream in = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(in);
				){
			
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();
			
			System.out.printf("%s,%d,%d,%d,%d,%.2f,%b\n"
					, name, kor, eng,mat,tot,avg,gender);
			
		} catch (Exception e) {
			 System.out.println(e.toString());
		}
		
		
		System.out.println("END");
	}

}
//









//