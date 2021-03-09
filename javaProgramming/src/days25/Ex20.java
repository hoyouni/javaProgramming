package days25;

import java.text.MessageFormat;

public class Ex20 {

	public static void main(String[] args) {
		
		// p 549 MessageFormat
		
		String pattern = "Name: {0} \nTel : {1} \nAge:{2}\nBloodType={3}";
		Object [] arguments = {"홍길동", "010-1233-1234", 20, 'A'};
		String msg = MessageFormat.format(pattern, arguments);
		System.out.println( msg );
        
		
		/*
		String msg = String.format("Name:%s\nTel=%s\nAge=%d\n %c\n"
				              ,  "홍길동","010-1234-1234", 20, 'A');
		System.out.println(msg);
		*/
	}

}
//









//