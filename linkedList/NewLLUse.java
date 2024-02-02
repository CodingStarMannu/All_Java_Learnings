package linkedList;

import java.util.Scanner;


class DoubleNode{

    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(){

    }

    DoubleNode(Node<Integer> head, Node<Integer> tail){
      this.head= head;
      this.tail= tail;
    }
}
public class NewLLUse {
	
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
//				Node <Integer> tail = head;
//				while(tail.next != null) {
//					tail = tail.next;
//				}
//				//Now tail will refer to the last node
//				//connect current node after last node
				tail.next = currentNode;
				tail = currentNode; // tail = tail.next;
			}
			
			data = s.nextInt();
		}
		return head;
	}
	
	
	
	public static void printRec(Node<Integer>head) {
//		if (head == null) {
//			return;
//		}
//		System.out.print(head.data + " ");
//		printRec(head.next);
//	}	
	
	//Reverse LL 
	if (head == null) {
		return;
	}
	printRec(head.next);
	System.out.print(head.data + " ");
	
}
	
	//insert the element in LL
	public static Node<Integer>insertR(Node<Integer>head, int elem, int pos){
		if ( head == null && pos >0) {
			return head;
		}
		if ( pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}else {
//			Node<Integer>smallerHead = insertR(head.next, elem, pos -1);
//			head.next = smallerHead;
//			return head;
			head.next = insertR(head.next, elem, pos -1);
			return head;
		}
	}

	
//	public static Node<Integer>insert(Node<Integer>head, int ele, int index){
//		if(head == null && index > 0) {
//			return head;
//			}
//		if(index ==0) {
//			Node<Integer>newNode = new Node<>(ele);
//			newNode.next = head;
//			return newNode;
//		}else {
//		Node<Integer>smallerHead = 	insert(head.next, ele, index-1);
//		head.next = smallerHead;
//		return head;
//		}
//}
	
	//Delete Element in Linked list
	
	public static Node<Integer>deleteR(Node<Integer>head, int pos){
		if(head==null&& pos>0)
		{
			return head;
		}
		if(pos==0)
		{ 
			if(head==null) //incase of a LL of length 5 if position =5 then this if will handle the null pointer exception
				return head;
			else
				return head.next;
		}
		Node<Integer>next=deleteR(head.next, pos-1);
		head.next=next;
		return head;
	}
	
	//Reverse LL recursively

	public static Node<Integer>reverseLinkedListRec(Node<Integer>head, int pos){
//		Node<Integer> currNode = head;
//		if( currNode == null || currNode.next == null) {
//			return currNode;
//		}
//		 LinkedListNode<Integer> reverseL = reverseLinkedListRec(head.next);
//	        
//	        head.next.next = head;
//	        head.next = null;
//	        return reverseL;
	        
	        
	        //0r other way
		 if(head==null || head.next==null){
	            return head;
	        }
		 Node<Integer> smallHead = reverseLinkedListRec(head.next);
		 Node<Integer> reverseTail = head.next;
		 reverseTail.next = head;
		 head.next = null;
		 return smallHead;
		 
		
		
	        
	        
	        
	        
	      // the following code perform same 0peration but the time complexity will be  O(n^2)  
//	        if(head==null || head.next==null){
//	            return head;
//	        }
//	        Node<Integer> smallHead= reverseR(head.next);
//	        Node<Integer> tail= smallHead;
//	        while(tail.next != null){
//	          tail= tail.next;
//	        }
//	        tail.next =head;
//	        head.next= null;
//	        return smallHead;
//	      }

	}
	
	public static DoubleNode reverseRBetter(Node<Integer> head){
	    DoubleNode ans;
	    if(head==null || head.next ==null){
	        ans= new DoubleNode(head, head);// we can use this line beacuse we have already made a constructor for head and tail.
//	        ans= new DoubleNode();
//	        ans.head= head;
//	        ans.tail= head;
	        return ans;
	    }

	    DoubleNode smallAns= reverseRBetter(head.next);
	    smallAns.tail.next= head;
	    head.next= null;
	    ans = new DoubleNode();
	    ans.head= smallAns.head;
	    ans.tail= head;
	    return ans;
	}
		
	
	//Mid of LL using slow and fast
	public static Node<Integer>midLL(Node<Integer>head){
	Node<Integer> slow=head;
    Node<Integer> fast=head;
    
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;	
 }
	
	
	// Merge two sorted LL
	public static Node<Integer> mergeSortedList(Node<Integer>head1,Node<Integer>head2){
		
		if ( head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> temp1 = head1, temp2 = head2;
		Node<Integer>head = null, tail = null;
		
		if(temp1.data <= temp2.data) {
			head = temp1;
			tail = temp1;
			temp1 = temp1.next;
		}else {
			head = temp2;
			tail = temp2;
			temp2 = temp2.next;
		}
		while(temp1!=null && temp2 != null) {
			if(temp1.data <= temp2.data) {
			tail.next = temp1;
			tail = temp1;
			temp1 = temp1.next;
			}else {
				tail.next = temp2;
				tail = temp2;
				temp2 = temp2.next;
			}
		}
		
		//One list is over
		
		if(temp1 != null) {
			//first list is remaining
			tail.next = temp1;
		}else {
			tail.next = temp2;
		}
		
		return head;
		
	}
	
	
	

	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insertR(head, 20 ,8);
		printRec(head);
		

	}

}
