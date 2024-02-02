package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// https://gist.github.com/yugalbatra/14e3a28035067b431eb70703a223aea0
public class ReverseQ {
	
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		if(input.size()==0) 
		return;
        int temp=input.poll();//The poll() method of Queue Interface returns and removes the element at the front end of the container. It deletes the element in the container. The method does not throws an exception when the Queue is empty, it returns null instead.
        reverseQueue(input);
        input.add(temp);
	
	}

	
	//reverse queue using stack
  public static Queue<Integer> reverseQUsingStack(Queue<Integer>queue) {
	  
	  Stack<Integer>stack = new Stack<Integer>();
	  while(!queue.isEmpty()) {
		  stack.push(queue.peek());//peek will give front element of the queue without removing it.
		  queue.remove();
	  }
	  
	  while(!stack.isEmpty()) {
		  queue.add(stack.peek());
		  stack.pop();
	  }
	  return queue;
	  
	  
	  
  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
