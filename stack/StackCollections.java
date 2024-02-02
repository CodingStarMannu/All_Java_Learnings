package stack;

import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		
		Stack<Integer>stack = new Stack<>();
//		int arr[] = {5,6,7,8,9};
//		
//		for(int elem: arr) { //inhanced for loop traverse through the entries of the array not the indices.
//			stack.push(elem);
//		}
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.peek());// to get the topmost element
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
		
	      while(stack.isEmpty())
	        {
	            stack.push(10);
	        }
	        System.out.print(stack.pop()+" "+stack.size());
	    }
	

}
