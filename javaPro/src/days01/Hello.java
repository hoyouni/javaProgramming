package days01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
	public static void main(String[] args) throws Exception{
		System.out.print("����� �̸��� �����Դϱ�? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.printf("�̸��� \"%s\" �Դϴ�.", name);
	}
}
