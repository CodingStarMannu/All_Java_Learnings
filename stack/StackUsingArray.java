package stack;

public class StackUsingArray {
	
	private int data[];
	
	private int topIndex; //index of the topmost index of the stack.
	
	//constructor1
	public StackUsingArray() {
		data = new int[3];
		topIndex = -1;
	}
	
	// constructor2
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
	}
	
	//size
	public int size() {
		return topIndex +1;
	}
	
	//to check array empty or not
	public boolean isEmpty() {
//		if ( topIndex ==-1) {
//			return true;
//		}else {
//			return false
//		}
		
		return topIndex == -1;
	}
	
	// taking input to the stack
	
//	public void push(int elem) throws StackFullException {
//		
//		//If stack is full
//		if(topIndex == data.length - 1) {
////			StackFullException e = new StackFullException();
////			throw e;
//			
//			throw new StackFullException();
//		}
//		
////		topIndex++;
//		data[++topIndex] = elem;
//		
//	}
	
	
	//New method to double the capacity
	
	public void push(int elem) {
		
		//If stack is full
		if(topIndex == data.length - 1) {
//			StackFullException e = new StackFullException();
//			throw e;
			
		 doubleCapacity();
		 
		}
		
		topIndex++; // first we have to increase the topIndex than insert element
		data[topIndex] = elem;
		
	}
	
	private void doubleCapacity() {
		System.out.println("doubleCapacity");
		int temp[] = data;
		data = new int[2* temp.length];
		for (int i =1; i < temp.length; i++) {
			data[i]= temp[i];
		}
	}

	
	//created StackEmptyException and funtion for topIndex
	public int top() throws StackEmptyException {
		if ( topIndex == -1) {
			//Throw StackEmptyException
			throw new StackEmptyException();
		}
		return  data[topIndex];
		
	}
	
	//to pop elements
	public int pop() throws StackEmptyException {
		if ( topIndex == -1) {
			//Throw StackEmptyException
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		//or 
		// int temp = data [topIndex--];
		return temp;
		
		
	}

}
