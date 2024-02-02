package queue;

import java.util.Stack;

public class QueueUsingStack<T> {
	
	Stack<T>s1;
	Stack<T>s2;
	int size;
	
	public QueueUsingStack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
