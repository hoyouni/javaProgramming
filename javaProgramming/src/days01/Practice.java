
package days01;

import java.io.IOException;

public class Practice {
	public static void main(String[] args) throws IOException  {

		int lineNum = 1;
		for(int i = 0; i < 256; i++) {

			if(i % 10 == 0) {
				System.out.printf("%d : ", lineNum);
				lineNum++;
			}
			System.out.printf("[%d]", i);

			if(i % 10 == 9) {
				System.out.println();

				if(lineNum % 10 == 1) {
					System.out.print("엔터를 치시오");
					System.in.read();
					System.in.skip(System.in.available());
				}
			}
		}

	}
}
