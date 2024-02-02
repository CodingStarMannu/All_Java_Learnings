package stack;

public class StackUse {

	public static void main(String[] args)throws StackFullException, StackEmptyException {
		
//		StackUsingArray stack = new StackUsingArray();
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		int arr[] = {1,2,3,4,5,6};
		
		for ( int i =0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		while( ! stack.isEmpty()) { //then pop element from stack
			System.out.println(stack.pop());
		}
		
		
		
		//stack.data[1]= 100; we have to make the stack data variable private.
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		System.out.println(stack.size());
//		System.out.println(stack.pop());
//		stack.push(8);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
//		System.out.println(stack.top());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		stack.pop();

	}

}
