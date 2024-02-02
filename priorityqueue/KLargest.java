package priorityqueue;

import java.util.PriorityQueue;

public class KLargest {
	
	public static void printKLargest(int []arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//put k elements in the PQ
		for( int i =0; i<k; i++) {
			pq.add(arr[i]);
		}
		
		//start from k and compare the remaining elements of array with PQ and replace with smallest element
		for( int i =k; i< arr.length; i++) {
			
			if(pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		while( ! pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,6,2,3,7,8,9,10,1,24,22,1,6,7};
		int k =4;
		printKLargest(arr,k);
		
	}
	
	//time Complexity = O(nlogk)
	//space Complexity = O(k)	

}
