package days27;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex09 {

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
		
		String fileName = "학생성적.txt";
		// [학생성적.txt] 저장
		// 파일 출력 스트림 : [FileWriter] , FileOutputStream
		try(
				FileWriter fw = new FileWriter(fileName  , true);
				PrintWriter pw = new PrintWriter(fw);
				){
			/*
			String info = String.format("%s,%d,%d,%d,%d,%.2f,%b\n"
					, name, kor, eng,mat,tot,avg,gender);
			fw.write(info);
			*/
			pw.printf("%s,%d,%d,%d,%d,%.2f,%b\n\r"
					, name, kor, eng,mat,tot,avg,gender);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("END");
	}

}
//









//