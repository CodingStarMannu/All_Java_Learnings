package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElementsInQueue {
	
	public static Queue<Integer>reverseQueue(Queue<Integer>front){
		
		if(front.size()==0) {
			return front;
		}
		int temp = front.poll();
		reverseQueue(front);
		front.add(temp);
		return front;
		
	}
	
	public static Queue<Integer> reverseKElements(Queue<Integer>Q, int k) {
		
		Queue<Integer>newQ = new LinkedList<Integer>();
		
		for(int i =0 ; i < k ; i++) 
			newQ.add(Q.poll());
		reverseQueue(newQ);
		while( Q.size() != 0)
			newQ.add(Q.poll());
		return newQ;
		
		}
	
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
