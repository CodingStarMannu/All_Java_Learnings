package linkedList;

import java.util.Scanner;

public class InsertNodeInLL {
	
	
	 public static void print(Node<Integer> head){
	        while(head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        
	        System.out.println();
	    }
	

	
	public static Node<Integer>takeInput(){
		Scanner s  = new Scanner (System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data!=-1) {
			Node <Integer>currentNode = new Node <Integer>(data);
			
			if(head==null) {
				//Make this node as head node and tail node
				head = currentNode;
				tail = currentNode;
			}else {

				tail.next = currentNode;
				tail = currentNode; // tail = tail.next;
			}
			
			data = s.nextInt();
		}
		return head;
	}
	
	// inserting a node to a Linked List
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		
		Node<Integer>nodeToBeInserted = new Node<Integer>(data);
		
		if(pos ==0) {
			nodeToBeInserted.next = head;
			return nodeToBeInserted;
		}else {
		int count =0;
		Node <Integer> prev = head;
		while(count <pos -1 && prev != null) {
			count++;
			prev = prev.next;
		}
		
		if(prev != null) {
		nodeToBeInserted.next = prev.next;//follow make before break rule in LL always.The order should be same
		prev.next = nodeToBeInserted;
		}
		return head;
	}
		
}
	
	
	//Deleting a Node from Linked List
	
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		
		if (head == null){
			return null;
		}
		if (pos == 0) {
		return head.next ;
		}
		
		int count =0;
		Node<Integer> prev = head;

		while (prev != null && count<pos-1){
			prev = prev.next;
			count++;
		}
		if (prev==null)
			return head;
		
		if(prev.next!=null)
			prev.next = prev.next.next;
		
		return head;
	}
	
	
	//find the index of nth element
	

		public static int findNode(Node<Integer> head, int n) {
				return helper(head, 0, n); 
		}
		public static int helper(Node<Integer> head, int index, int n) {
			if (head == null)
				return -1;
			if (head.data == n)
				return index;
			int ans = helper(head.next, index + 1, n);
			return ans;
		}
			

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head =insert(head,0,80);
		print(head);
	}

}
