package algoStudy.StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmialAddresses {
	public String makeLocalName(String email) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < email.length(); i++) {
			// 1
			if(email.charAt(i) == '.') {
				continue;
			}
			
			if(email.charAt(i) == '+' || email.charAt(i) == '@') {
				break;
			}
			
			// 2
			String str = String.valueOf(email.charAt(i));
			sb.append(str);
		}
		return sb.toString();
	}
	
	public String makeDomainName(String email) {
		int index = email.indexOf("@");
		email = email.substring(index, email.length());
		return email;
	}
	
	public int solution(String[] input) {
		long start = System.currentTimeMillis();
		
		// 1
		Set<String> set = new HashSet<>();
		
		// 2
		for(String email : input) {
			String localName = makeLocalName(email);
			String domainName = makeDomainName(email);
			set.add(localName + domainName);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end - start));
		return set.size();
	}
	
	public static void main(String[] args) {
		String[] input = {
				"test.email+james@coding.com",
				"test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com"
				};
		UniqueEmialAddresses u = new UniqueEmialAddresses();
		int output = u.solution(input);
		System.out.println(output);
	}
}



























