package priorityqueue;

import java.util.PriorityQueue;

public class InBuildPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,5,6,10,1,2,5,7,9};
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>(); // by default it is minPQ
		 for( int i =0; i<arr.length; i++) {
			 pq.add(arr[i]);
		 }
//		 System.out.println(pq.peek());
//		 System.out.println(pq.isEmpty());
//		 
		 while(!pq.isEmpty()) {
			 System.out.println(pq.peek());
			 pq.poll();
		 }
	}

}
