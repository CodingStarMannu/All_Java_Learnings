package queue;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {

	Stack<Integer> s1; 
    Stack<Integer> s2;
	
	public QueueUsingTwoStacks() {
		
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	public int getSize() {
		return s1.size();
	}
	public boolean isEmpty() {
		return s1.size() ==0;
	}
	
	public void enQueue(int elem){
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(elem);	 
		  
	        // Push everything back to s1 
	        while (!s2.isEmpty()) 
	        { 
	            s1.push(s2.pop()); 
	            //s2.pop(); 
	        } 
		
		
	
	}
	public int deQueue() throws QueueEmptyException {
		if(s1.isEmpty()&& s2.isEmpty()) {
			throw new QueueEmptyException();
		}
		
		int x = (int) s1.peek();
		s1.pop();
		return x;
    }
}
