package saramin;

import java.util.Scanner;

public class Test4 {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String id = sc.next();
		String passwordF = sc.next();
		String passwordS = sc.next();

		boolean id_check = id_check(id);
		boolean password_OK = password_check(passwordF);

		boolean flag;
		if(passwordF.equals(passwordS)) {
			flag=true;
		}else {
			flag=false;
		}

		boolean check = id_check & password_OK & flag;
		if(check) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	
	public static boolean password_check(String passwordF) {
		boolean flag1=false;
		boolean flag2=false;
		boolean flag3=false;

		if(passwordF.length() > 20 || passwordF.length() < 8) {
			return false;
		}

		for(int i = 0; i < passwordF.length(); i++) {
			int get = passwordF.charAt(i);
			
			if((get >= 97 && get <= 122) || (get >= 65 && get <= 90)) {
				flag1 = true;
			}
			else if(get >= 48 && get <= 57) {
				flag2 = true;
			}
			else if(get == 33 || get == 64 || get == 35 || get == 36) {
				flag3 = true;
			}
		}
		boolean flag = flag1 & flag2 & flag3;
		return flag;
	}

	public static boolean id_check(String id) {
		if(id.length() > 20 || id.length() < 3) {
			return false;
		}

		boolean flag = true;
		for(int i=0 ; i < id.length() ; i++) {
			int get = id.charAt(i);

			if(!((get >= 97 && get <= 122) || (get >= 48 && get<= 57))) {
				flag=false; 
			}
		}
		return flag;
	}
}













