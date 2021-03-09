package days29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01 {

	public static void main(String[] args) {
		// p 934 직렬화( Serialization ) ? 객체를 데이터스트림으로 만드는 것.
		
		// 컴퓨터 파일(메모리)   [객체] 읽기/쓰기
		// A  -- 네트워크  -- B
		//        [ 객체  ] 읽기/쓰기
		// 스트림( Stream ) 객체 단위로 읽기/쓰기
		// 객체   스트림화 시키는 작업( 직렬화 )    읽기/쓰기
		
		// p 935 ObjectInputStream    / ObjectOutputStream
		//           역직렬화                                 직렬화(  스트림에 객체를 출력 )
		
		// 한 멤버의 정보를 네트워크 전송/수신
		// 한 멤버의 정보를 파일 쓰기/읽기  ***
		/*
		Member m1 = new Member("정영진", 1, true);
		String fileName = "member.dat";
		// "정영진/1/true" 쓰기
		// 한 라인   읽기 ->  / 구분자 잘라내기 -> 정영진, 1 , true  형변환해서 사용.
		m1.writeExternal(fileName);		
		Member m2 = m1.readExternal(fileName);
		*/
		
		Student s1 = new Student("정영진", 90, 89, 100, 279, 93.45, true);
		String fileName = "student.dat";
		try(
		FileOutputStream out = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(out);
				){
			oos.writeObject(s1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("= END =");

		try(
				FileInputStream in = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(in);
						){ 
			
			    Student s2 = (Student) ois.readObject();
			    System.out.println( s2.getName());
			     System.out.println( "gender : " +s2.isGender() );
				}catch(Exception e) {
					e.printStackTrace();
				}


	} // main

} // class

// 직렬화가 가능한 클래스
class Student implements Serializable{
	// static 필드는 직렬화 X
	private static String eduName = "쌍용교육센터";
	private transient String name;
	private int kor,eng,mat;
	private int tot;
	private double avg;
	private  transient boolean gender; // 직렬화 포함 X
	
	public static String getEduName() {
		return eduName;
	}

	public static void setEduName(String eduName) {
		Student.eduName = eduName;
	}

	public Student() {
		super(); 
	}

	public Student(String name, int kor, int eng, int mat, int tot, double avg, boolean gender) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	// 필드 boolean gender;
	// getter  : isGender();
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
}

class Member{
	private String name;
	private long type;
	private boolean gender;
	
	public Member() {}

	public Member(String name, long type, boolean gender) {
		super();
		this.name = name;
		this.type = type;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	} 
	
	// 파일로부터 객체 정보를 반환하는 메서드
	public Member readExternal(String fileName) {
		Member m = null;
		try(
				FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr); 
				) {
			
			String name =  br.readLine();
			long type =  Long.parseLong( br.readLine() );
			boolean gender=  Boolean.parseBoolean( br.readLine() );
			
			m = new Member(name, type, gender);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return m;
		
	}
	
	// 자기 자신 객체를 파일 저장 메서드
	public void writeExternal(String fileName) {
		try(
				FileWriter fw = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(fw);
				){
			
			bw.write(this.name+"\n");
			bw.write(this.type+"\n");
			bw.write(this.gender+"\n");
			
			System.out.println(" 객체 저장 완료....");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
// 자바 프로젝트 진행
// 2019.09.09(월) 발표 

// 쉬는 시간 지켜 주세요... 
//                   ***  50분 ~ 정각   ***
*/

// 정영진(10시)

// [ id/pwd ->   "kenik/1234" ]








//