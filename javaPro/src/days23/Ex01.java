package days23;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author k≡n¡k
 * @Source Ex01.java
 * @Date 2019. 8. 29. - 오전 9:09:12
 * @Subject LinkedList 예제 
 */
public class Ex01 {

	public static void main(String[] args) {
		 LinkedList<String> list = new LinkedList<String>();
		 list.add("정영진");
		 list.add("김재우");
		 list.add("김건영");
		 
		 // list.remove(1);
		 // list.remove("김재우");
		 // list.remove();  == list.remove(0)
		 
		 // 반복자(기억)
		 Iterator<String> ir = list.iterator();
		 while (ir.hasNext()) {
			String name =  ir.next();
			System.out.println(name);
		}
		 // 열거자(기억)  X
		 // 2번째 노드(요소) 출력
		 String name = list.get(1);
		 //System.out.println(name);
		 // 
		 //list.getFirst();    == list.get(0)
		 //list.getLast();    == list.get( 크기 - 1)
		 // list.clear();		 
		 // list.contains(o)
		 // list.element()   head
		 // list.indexOf(o)
		 // list.lastIndexOf(o)
		 
		 //list.offer(e);        == list.add(e) / list.add(index, e)
		 //list.offerFirst(e);  == list.addFirst(e);
		 //list.offerLast(e);  == list.addLast(e);
		 
		 System.out.println("===");
		 //list.peek();       // 요소 얻어오는 메서드  get()
		 //list.peekFirst();
		 //list.peekLast();
		 
		 // 첫 번째 노드(요소) 제거+ 반환
		 // list.pop(); == list.remove() == list.removeFirst()
		 
		 //list.poll();
		 //list.pollFirst();
		 //list.pollLast();
		 
	}

}
// 정영진(?)
// 김재우(?)
// 김건영( 병원 )
// 경섭, 영재, 상만 ( 학교  )





// 호연( 8/30 오후 조퇴 ~  9/4 오후 출석 예정 )









//