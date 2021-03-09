package days27;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex10 {

	public static void main(String[] args) {
		// p 886 [ DateInputStream/ DataOutputStream ] 
		//           1) 바이트 스트림
		//           2) 보조 스트림   - FilterInputStream/FilterOutputStream의 자식
		//           3)        읽기/쓰기( byte ) X
		//               *** 기본 자료형( 8 가지 )으로 읽기/쓰기가 가능하다( 장점 )
		String name = "조영지";
		int kor = 99, eng = 99, mat = 87;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		boolean gender = true ;   // 남자 true  여자 false		
		//
		String fileName = "학생성적.dat";
		try (
				FileOutputStream out = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(out);
				){
			// 
			// 기본형 바로 쓰기작업할 수 있는 메서드 ...
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
		} catch (Exception e) {
			 System.out.println(e.toString());
		}
		
		
		System.out.println("END");
	}

}
//









//