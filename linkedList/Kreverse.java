package linkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kreverse {
    



//take input
public static Node<Integer> takeInput() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   Node<Integer> head = null, tail = null;

    String[] datas = br.readLine().trim().split("\\s");

    int i = 0;
    while(i < datas.length && !datas[i].equals("-1")) {
        int data = Integer.parseInt(datas[i]);
        Node<Integer> newNode = new Node<Integer>(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        i += 1;
    }

    return head;
}
//print function
	public static void print(Node<Integer> head){
    while(head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
    
    System.out.println();
}
	
	
	//algorithm
	
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		
        if (head == null || k == 0) {
       return head;
     }
  
     Node<Integer> current = head;
     Node<Integer> next= null;
     Node<Integer> prev = null;
     int count = 0;
     while (count < k && current != null) {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
         count++;
     }
     if (next != null)
         head.next = kReverse(next, k);

         return prev;
   }
	
	
	//main
	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader br = null;
		int t = Integer.parseInt(br.readLine().trim());

	        while (t > 0) {
	            
	            Node<Integer> head = takeInput();
	            int k = Integer.parseInt(br.readLine().trim());

	            Node<Integer> newHead = Kreverse.kReverse(head, k);
	            print(newHead);
	            
	            t -= 1;
	        }

	}
 
    
    
	

}
