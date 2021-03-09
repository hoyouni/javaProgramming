package doItAlgo;


// stack 두 개로 queue 구현 
class StackQueue {
	IntStack inqueue;
	IntStack outqueue;
	
	public StackQueue(int capacity) {
		this.inqueue = new IntStack(capacity);
		this.outqueue = new IntStack(capacity);
	}
	
	public void inQueue(int v) {
		inqueue.push(v);
	}
	
	public int outQueue() {
		if(outqueue.isEmpty()) {
			while(!inqueue.isEmpty()) {
				outqueue.push(inqueue.pop());
			}
		}
		return outqueue.pop();
	}
	
	
}

public class Ex04_01B_TwoStackToQueue {
	public static void main(String[] args) {
		StackQueue q = new StackQueue(30);
		q.inQueue(1);
		q.inQueue(2);
		
		System.out.println(q.outQueue());
		
		q.inQueue(3);
		
		System.out.println(q.outQueue());
		System.out.println(q.outQueue());
	}
}
































