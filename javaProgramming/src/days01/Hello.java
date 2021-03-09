package days01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {
	public static void main(String[] args) throws Exception{
		System.out.print("당신의 이름은 무엇입니까? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.printf("이름은 \"%s\" 입니다.", name);
	}
}
