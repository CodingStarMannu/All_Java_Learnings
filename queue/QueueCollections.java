package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueCollections {
	// Queue is different from the stack and LL beacause it is not a class unlike stack and LL ..it is a interface

	public static void main(String[] args) {
		
		Queue<Integer>queue = new LinkedList<Integer>();
//		queue.add(10);
//		queue.add(20);
//		System.out.println(queue.size());
//		System.out.println(queue.peek());// front element
//		System.out.println(queue.poll());// to remove
//		System.out.println(queue.size());
		
//		   for(int i=1;i<5;i++)
//	        {
//			   queue.add(10+i);
//	        }
//	        System.out.print(queue.poll()+" "+queue.size());

		
	   Stack<Integer> s=new Stack<Integer>();
	   queue.add(5);
	   queue.add(10);
       s.push(10);
       s.push(20);
       System.out.print(queue.peek()+s.pop());
		
	}
	

}
