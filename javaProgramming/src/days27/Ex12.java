package days27;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class Ex12 {

	public static void main(String[] args) {
		// p 901
		// 1. 문자 스트림
		// 2. 스레드 간에 데이터를 주고 받을 때 사용한다. 
		// 3. 다른 스트림과는 달리 입력과 출력 스트림을 하나의 스트림으로 연결(connect) 해서 데이터
		///    를 주고 받는 다는 특징이 있다. 
		// PipedReader/ PipedWriter
		
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");
		
		inThread.connect(outThread.getOutput());
		
		inThread.start();				
		outThread.start();
		
		System.out.println(" 프로그램 종료 !!!! ");
	}

}

// Thread 클래스를 상속받아서 InputThread 클래스 선언
class InputThread extends Thread{
	// 필드 선언
	// 1. PipedReader    문자 스트림 객체 선언 : input
	//     스레드 간의 통신 입력 스트림
	PipedReader input = new PipedReader();
	// 2. StringWriter    문자 출력 스트림( String 문자열 )
	StringWriter sw = new StringWriter();
	
	// 3. 생성자
	public InputThread(String name) {
		super(name);  // Thread 의 생성자
	}
	
	// ?
	public void run() {
		try {
			int data = 0;
			while( (data=input.read()) != -1) {
				sw.write(data);
			}
			System.out.println(getName() + " received : " + sw.toString());
		} catch (IOException e) {
		}
	}

	// getter
	public PipedReader getInput() {
		// 
		return input;
	}

	// 메서드
	public void connect( PipedWriter output) {
		try {
			input.connect(output); // PR 연결  PW
		} catch (IOException e) { }
	} 
}

class OutputThread extends Thread{
	PipedWriter output = new PipedWriter();
	
	public OutputThread(String name) {
		super(name);
	}
	
	public void run() {
		try {
			String msg = "Hello";
			System.out.println(getName() + " sent : " + msg);
			output.write(msg);
			output.close();
		} catch (IOException e) {
		 
		}
	}

	public PipedWriter getOutput() {
		return output;
	}

	public void connect(PipedReader input) {
		try {
		} catch (Exception e) {}
	}
}
//









//