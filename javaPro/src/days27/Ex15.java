package days27;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex15 {

	public static void main(String[] args) throws IOException {
		// 
		int [] score = {
				1, 100, 90,90, 
				2,  70, 90, 100,
				3, 100, 100, 100,
				4, 70,60,80,
				5, 70,90,100
		};

		String name = "score.dat";		
		String mode = "rw";  // 읽기 + 쓰기

		try( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			for (int i = 0; i < score.length; i++) {
				raf.writeInt(score[i]);  // 4바이트 
			}
			
			System.out.println(" 엔터 치면 3번 학생의 성적 정보 출력... 계속합니다. ");
			System.in.read();
			System.in.skip(System.in.available());

			// 3번  4*4*(3-1)
			raf.seek(4*4*(3-1));
			int no =  raf.readInt();
			int kor =  raf.readInt();
			int eng =  raf.readInt();
			int mat =  raf.readInt();
			
			System.out.printf("%d번 학생: %d, %d, %d \n",
					no, kor, eng, mat
					);
			// 3 번학새의 영어 0 수정
			raf.seek( 4*4*(3-1) + 4+4);
			raf.writeInt(0);
			
			// 
			raf.seek(4*4*(3-1));
			 no =  raf.readInt();
			 kor =  raf.readInt();
			eng =  raf.readInt();
			 mat =  raf.readInt();
			
			System.out.printf("%d번 학생: %d, %d, %d \n",
					no, kor, eng, mat
					);
		}catch(Exception e) {}
	}

}
//









//