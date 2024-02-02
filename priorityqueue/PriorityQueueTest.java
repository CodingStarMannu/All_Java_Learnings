package priorityqueue;

public class PriorityQueueTest {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub

		Priority_Queue<String> pq = new Priority_Queue<String>();
		pq.insert("abc", 15);
		pq.insert("efgh", 13);
		pq.insert("ijklm", 90);
		pq.insert("nopqrs", 150);
		pq.insert("tuvwxyz", 120);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}

}  
