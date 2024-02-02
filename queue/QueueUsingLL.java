package queue;

import linkedList.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public void enqueue( T elem) {
		Node<T> newNode = new Node<>(elem);
		size++;
		if ( rear == null) {
			front = newNode;
			rear = newNode;
			
		}else {
			rear.next = newNode; 
			rear = newNode; // rear = rear.next
		}
	}
	public T front() throws QueueEmptyException {
		if( front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
		
	}
	public T dequeue() throws QueueEmptyException {
		if( front == null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if( front == null) {
			rear = null;
		}
		size--;
		return temp;
	}

}


/* 
 * import java.util.*;
 
public class Queue {
	private Node front;
	private Node rear;
	int size;
	





	public Queue() {
		//Implement the Constructor
		front = null;
		rear = null;
		size = 0;
	}
	


	


	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return size == 0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		Node newNode = new Node (data);
		size++;
		if ( rear == null) {
			front = newNode;
			rear = newNode;
			
		}else {
			rear.next = newNode; 
			rear = newNode; // rear = rear.next
		}
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if( front == null) {
			return -1;
		}
		int temp = front.data;
		front = front.next;
		if( front == null) {
			rear = null;
		}
		size--;
		return temp;

    }


    public int front() {
    	//Implement the front() function
		if( front == null) {
			return -1;
		}
		return front.data;

    }
}*/
