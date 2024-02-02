package queue;

public class QueueUse {
	

	public static void main(String[] args) {
		
//		QueueUsingArray queue =  new QueueUsingArray(3);
		QueueUsingLL <Integer> queue = new QueueUsingLL<>(); 
		
		int arr [] = {10,20,30,40,50,60};
		for(int elem : arr) {
//			try {
				queue.enqueue(elem);
//			}catch (QueueFullException e) {
//				
//		}
		}	
			while(!queue.isEmpty()) {
				try {
					System.out.println(queue.dequeue());
				} catch (QueueEmptyException e) {
					//Will never reach here
				}
			}
				
	}

}
