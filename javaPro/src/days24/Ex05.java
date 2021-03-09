package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex05 {

	public static void main(String[] args) {
		// 학생명단.txt
		// FileReader , BufferedReader
		// FileWriter  , BufferedWriter
		// key String "1조"   value ArrayList

		//HashMap<String	,  ArrayList<String>> class5 = new HashMap<>();
		TreeMap<String	,  ArrayList<String>> class5 = new TreeMap<>();

		// 학생명단.txt 
		String  fileName = "..\\..\\test\\학생명단.txt "; 
		String team = null;
		String [] members = null;
		
		try(FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);){ 
			String line = null;		
			String member = null;
			ArrayList<String> mList = null;
			while(  ( line = br.readLine() ) != null ) {
				mList = new ArrayList<>();
				team = line.substring(0, 2);
				member = line.substring(2).trim();
				members = member.split("\\s+");	
				for (String name : mList) {
					mList.add(name);
				}
				class5.put(team, mList);
			}
		}catch(Exception e) {
			System.out.println("1. " + e.toString() );
		}	
		// 

		// HashMap/       value=ArrayList   출력...
		Set<Entry<String, ArrayList<String>>> eset = class5.entrySet();
		Iterator<Entry<String, ArrayList<String>>> ir = eset.iterator();
		while (ir.hasNext()) {
			Entry<String, ArrayList<String>> entry = ir.next();
			team = entry.getKey();
			System.out.printf("[%s]\n",team);
			Object [] m = entry.getValue().toArray();
			System.out.println( Arrays.toString(members) );
		}
		 


	}

}
//









//