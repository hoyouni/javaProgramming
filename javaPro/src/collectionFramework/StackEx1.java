package collectionFramework;

import java.util.Stack;

// 스택을 이용하여 웹 브라우저의 앞 뒤로 구현
public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus();
		
		goBack();
		System.out.println("뒤로 가기 버튼을 눌렀을 경우");
		printStatus();
		
		goBack();
		System.out.println("뒤로 가기 버튼을 눌렀을 경우");
		printStatus();
		
		goForward();
		System.out.println("앞으로 가기 버튼을 눌렀을 경우");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("새로운 주소로 이동 후");
		printStatus();
	}

	private static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}

	private static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}

	private static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 '" + back.peek() + "' 입니다." + "\n");
	}

	private static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
}






























