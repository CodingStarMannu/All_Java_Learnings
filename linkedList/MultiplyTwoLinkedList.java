package linkedList;

public class MultiplyTwoLinkedList {
	
	
	// first we have to reverse the LL1
	public static Node<Integer>reverse(Node<Integer>head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer>curr = head;
		Node<Integer>prev = null;
		
		while(curr != null) {
			Node<Integer>forward = curr.next;
			
			curr.next = prev;
			
			prev = curr;
			curr = forward;
		}
		
		return prev;
		
	}
	
	//multiply a single element of LL2 with reversed LL1
	
	public static Node<Integer> multiplyLLWithDigit(Node<Integer>head, int dig) {
		//create a dummy node
		Node<Integer> dummy = new Node<Integer>(-1);
		Node<Integer> ansCurr = dummy; //answer current
		Node<Integer> curr = head;
		int carry = 0;
		
		while( curr != null || carry != 0 ) {
			
			int sum = carry + (curr != null ? curr.data : 0) * dig;
			
			int digit = sum % 10;
			carry = sum / 10 ;
			
			ansCurr.next = new Node<Integer>(digit);
			
			if ( curr != null) curr = curr.next;
			ansCurr = ansCurr.next;
			
		}
		
		return dummy.next;
		 
		
	}
	
	//addTwoLinkedList
	
	public static void addTwoLL(Node<Integer>head,Node<Integer>ansItr){
		
		Node<Integer> c1 = head;
		Node<Integer> c2 = ansItr;
		
		int carry =0;
		
		while( c1!=null || carry != 0) {
			
			int sum = carry + ( c1 != null ? c1.data : 0) + ( c2.next != null ? c2.next.data : 0);
			
			int digit = sum % 10;
			carry = sum /10;
			
			if ( c2.next != null) c2.next.data = digit;
			else c2.next = new Node<Integer>(digit);
			
			if( c1 != null) c1 = c1.next;
			c2 = c2.next;
			
		}
	}
	
	public static Node<Integer> multiplyTwoLL(Node<Integer>head1 , Node<Integer> head2){
		
		head1 = reverse(head1);
		head2 = reverse(head2);
		
		Node<Integer> head2Itr = head2;
		Node<Integer> dummy = new Node<Integer>(-1);
		Node<Integer>ansItr = dummy;
		
		
		while( head2Itr != null) {
			Node<Integer>prod = multiplyLLWithDigit(head1 , head2Itr.data);
			head2Itr = head2Itr.next;
			
			addTwoLL(prod,ansItr);
			ansItr = ansItr.next;
		}
		return reverse (dummy.next);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
