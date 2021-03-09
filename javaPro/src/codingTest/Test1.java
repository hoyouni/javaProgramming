package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
	 public static int solution(String[] ip_addrs,String[] langs, int[] scores) {
	      int answer = 0;
	      String regex = "C.*";
	      
	      Map<String,Boolean> resultCheck = new HashMap<String, Boolean>();
	      Map<String,ArrayList<String[]>> check = new HashMap<>();
	      
	      String ip = null;
	      String lan = null;
	      String sco = null;
	      
	      
	      for(int i =0 ; i < ip_addrs.length; i++) {
	         ip = ip_addrs[i];
	         sco = scores[i]+"";
	         if(langs[i].matches(regex)) {
	            lan = "C";
	         }else {
	            lan = langs[i];
	         }
	         
	         if(check.containsKey(ip)&&resultCheck.get(ip)) {      
	            ArrayList<String[]> infoList = check.get(ip);
	            
	            if(infoList.size()>=3) {
	               resultCheck.put(ip, false);
	            }else if(infoList.size() ==2) {
	               
	               boolean flag = false;
	               String lan1, lan2;
	               
	               if(infoList.get(0)[0].matches(regex)) {
	                  lan1 ="C";
	               }else {
	                  lan1 = infoList.get(0)[0];
	               }
	               
	               if(infoList.get(1)[0].matches(regex)) {
	                  lan2 ="C";
	               }else {
	                  lan2 = infoList.get(1)[0];
	               }
	               
	               
	               if(lan.equals(lan1) && lan.equals(lan2) ) {
	                  flag = true;
	               }else if(sco.equals(infoList.get(0)[1])&&lan.equals(lan1)) {
	                  flag = true;
	               }else if(sco.equals(infoList.get(1)[1])&&lan.equals(lan2)) {
	                  flag = true;
	               }
	               
	               if(flag) {
	                  resultCheck.put(ip, false);
	               }else {
	                  addInfo(infoList,lan,sco);
	               }
	            }else {   
	               
	               String lan1;
	               
	               if(infoList.get(0)[0].matches(regex)) {
	                  lan1 ="C";
	               }else {
	                  lan1 = infoList.get(0)[0];
	               }
	               
	               if(lan.equals(lan1)&&sco.equals(infoList.get(0)[1])) {
	                  resultCheck.put(ip, false);
	               }else {
	                  addInfo(infoList, lan, sco);
	               }
	            }
	            
	         }else {                  
	            ArrayList<String[]> infoList = new ArrayList<>();
	            addInfo(infoList, lan, sco);
	            check.put(ip,infoList);
	            
	            resultCheck.put(ip, true);
	         }
	      }
	      
	      for(String key : resultCheck.keySet()) {
	         if(resultCheck.get(key)) {
	            answer += check.get(key).size();
	         }
	      }
	      
	      return answer;
	            
	   }
	   
	   public static void addInfo(ArrayList<String[]> infoList, String lan, String sco) {
	      String[] tempInfo = new String[2];
	      tempInfo[0] = lan;
	      tempInfo[1] = sco;
	      infoList.add(tempInfo);
	   }

	public static void main(String[] args) {
		String[] ip_addrs = {"5.5.5.5", "155.123.124.111", "10.16.125.0", "155.123.124.111", "5.5.5.5", "155.123.124.111", "10.16.125.0", "10.16.125.0"};
		String[] langs = {"Java", "C++", "Python3", "C#", "Java", "C", "Python3", "JavaScript"};
		int[] scores = {294, 197, 373, 45, 294, 62, 373, 373};
		int result = solution(ip_addrs, langs, scores);
		System.out.println(result);
	}
}




































