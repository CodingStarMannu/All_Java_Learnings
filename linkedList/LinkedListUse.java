package linkedList;

import java.util.Scanner;

public class LinkedListUse {
	
//	public static Node <Integer>createLinkedList() {
//		Node<Integer> n1 ;// this will create the reference
//		n1= new Node<>(10); // this will create a new Node;
//		Node<Integer> n2 = new Node<>(20);
//		Node<Integer> n3 = new Node<>(30);
//		Node<Integer> n4 = new Node<>(40);
//		
//	// connection between two nodes will be make by follow statement.	
//		n1.next = n2;
////		System.out.println("n1 "+ n1 + " Data " + n1.data + " next " + n1.next);
//		n2.next = n3;
////		System.out.println("n2 "+ n2 + " Data " + n2.data + " next " + n2.next);
//		n3.next = n4;
////		System.out.println("n3 "+ n3 + " Data " + n3.data + " next " + n3.next);
////		System.out.println("n4 "+ n4 + " Data " + n4.data + " next " + n4.next);
//		return n1;
//	}
//	
//	public static void print(Node<Integer>head) {
//		
//		Node<Integer> temp = head;//we will store the value of head (first node of LL)to the variable temp so we can access first node(head) after loop. 
//		
//		while(temp!= null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;// increment to the second node of the LL
//		}
//		System.out.println();
//		//the following loop will have no effect because head is null at the starting of the loop so it will not run.
////		while(head != null) {
////			System.out.print(head.data + " ");
////			head = head.next;// increment to the second node of the LL
////		}
////		System.out.println();
////		System.out.println("Print " + head);
////		System.out.println(head.data);
////		System.out.println(head.next);
////		System.out.println(head.next.data);
////		System.out.println(head.next.next);
////		System.out.println(head.next.next.data);
////		System.out.println(head.next.next.next.data);
//		
//		
////		 Node<Integer> temp = head;
////
////		    while(temp != null){
////		        System.out.print(temp.data +" ");
////		        temp = temp.next;
////		    }
////		    System.out.println();
//	}
//	
//	public static void increment(Node<Integer>head) {
////		head = new Node<Integer>(100);// this will create new element and than the increment function has no effect on our output.
//		 Node<Integer> temp = head;
//		 
//		 		    while(temp != null){
//		 		    	temp.data++;
//		 		        
//		 		        temp = temp.next;
//		 		    }
//		
//	}
//	
//	//counting the LL elements
//	
//	public static int length(Node<Integer> head){
//		int count=0;
//		Node<Integer>current = head;
//	
//			while(current!=null){
//				count++;
//				current = current.next;
//			}
//			return count;
//			
//		
//			
//		}
//	
//	//recursive method
//
//	public static int count(Node<Integer>node) {   // Base case
//    if (node == null)
//        return 0;
//
//    // Count is this node plus rest of the list
//    return 1 + count(node.next);
//}
//

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
	
	//find the nth node in LL

	public static int findNodeRec(Node<Integer> head, int n) {
    	return helper(head,0,n);
	}
    public static int helper(Node<Integer> head, int index, int n){
    if (head == null){
        return -1;
    }
    if(head.data == n){
        return index;
    }

    int ans = helper(head.next,index+1,n);
    return ans;
}
	
    
    //even after odd
    
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node<Integer>current=head;
        Node<Integer>evenHead=null;
		Node<Integer>oddHead=null;
		Node<Integer>evenTail=null;
	    Node<Integer>oddTail=null;

        
		while(current!=null)
		{
			if(current.data%2!=0)
			{
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
			
			}
			else
			{
				
                if (evenHead == null ) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
			}
            current = current.next;
	}
    if (oddHead != null) {
        
        oddTail.next = evenHead;

        if (evenTail != null) {

            evenTail.next = null;
        }

        return oddHead;

    } else {

        evenTail.next = null;

        return evenHead;
    }

   
    }
    
    
    //delete every N nodes
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
        Node<Integer> curr=head,t;
        int count;
        while(curr!=null)
        {
        for(count=1;count<M && curr!=null;count++)
        {
            curr=curr.next;
        }
        if(curr==null)
            return head;
        t=curr.next;
        for(count=1;count<=N && t!=null;count++)
        {
            t=t.next;
        }
        curr.next=t;
        curr=t;}
        return head;

    }
    //Swap nodes
    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(i == j){
            return head;
        }
        
        LinkedListNode<Integer> c1 = null;
        LinkedListNode<Integer> p1 = null;
        LinkedListNode<Integer> c2 = null;
        LinkedListNode<Integer> p2 = null;
        LinkedListNode<Integer> tem1 = head;
        LinkedListNode<Integer> tem2 = head;
        
        int count = 0;
        while(count < i){
            count++;
            p1 = tem1;
            tem1 = tem1.next;
        }
        c1 = tem1;
        
        count = 0;
        while(count < j){
            count++;
            p2 = tem2;
            tem2 = tem2.next;
        }
        c2 = tem2;
        
        if(i<j){
            if(p1 == null && j-i == 1){
                c1.next = c2.next;
                c2.next = c1;
                head = c2;
            }
            else if(p1 == null){
                c1.next = c2.next;
                c2.next = p2;
                p2.next = c1;
                head = c2;
            }
            else if(j - i == 1){
                p1.next = c2;
                c1.next =c2.next;
                c2.next = c1;
            }
            else{
                p1.next = c2;
                LinkedListNode<Integer> temp = c2.next;
                c2.next = c1.next;
                c1.next=temp;
                p2.next = c1;   
            }
        }
        else{
            if(p2 == null && i-j == 1){
                c2.next = c1.next;
                c1.next = c2;
                head = c1;
            }
            else if(p2 == null){
                c2.next = c1.next;
                c1.next = p1;
                p1.next = c2;
                head = c1;
            }
            else if(i - j == 1){
                p2.next = c1;
                c2.next =c1.next;
                c1.next = c2;
            }
            else{
                p2.next = c1;
                LinkedListNode<Integer> temp = c1.next;
                c1.next = c2.next;
                c2.next=temp;
                p1.next = c2;
            }
        }
        return head;
	}

   //other code
/*

Following is the Node class already written for the Linked List

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

*/

public class Solution {

public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
	//Your code goes here
	
	int min = Math.min(i, j), max = Math.max(i, j);
	i = min; j = max;
	if (head == null || (i == j)) return head;
	LinkedListNode<Integer> fakeHead = new LinkedListNode<>(-1);
	fakeHead.next = head;
	LinkedListNode<Integer> ptr1 = fakeHead, ptr2 = fakeHead;
	while (i > 0 || j > 0) {
		if (i > 0) {
			ptr1 = ptr1.next;
			i--;
		}
		if (j > 0) {
			ptr2 = ptr2.next;
			j--;
		}
	}

	if (max - min == 1) {
		ptr1.next = ptr2.next;
		ptr2.next = ptr1.next.next;
		ptr1.next.next = ptr2;
		return fakeHead.next;
	}

	ptr1.next.next = ptr2.next.next;
	ptr2.next = ptr1.next;
	ptr1.next = ptr2.next;
	ptr1.next.next = ptr2;

	return fakeHead.next;
	
}

public static LinkedListNode<Integer> swapNodeUtilff(LinkedListNode<Integer> node) {
	LinkedListNode<Integer> temp = node.next;
	node.next = temp.next;
	temp.next = null;
	return temp;
}

public static void swapNodeUtilss(LinkedListNode<Integer> node, LinkedListNode<Integer> toAdd) {
	toAdd.next = node.next;
	node.next = toAdd;
}

}

	
	
	public static void printRec(Node<Integer>head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRec(head.next);
	}
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printRec(head);
		
		
		
		
		
	
		
//		Node<Integer> firstNode /*or we can name it as head */= createLinkedList();
//// 		System.out.println("Main " + head);
//		increment(firstNode);
//		print(firstNode);//we can name firstNode head also
//		print(firstNode.next); 
//		print(head.next.next);
		
//		Node<Integer> n1 = new Node<>(10); // this will create a new node
//		System.out.println(n1);// it will give reference / address of node
//		System.out.println(n1.data);// this is to access data part 
//		System.out.println(n1.next);// this is to access the address of next element

		
		
//		   Node<Integer> node1 = new Node<Integer>(10);
//		    Node<Integer> node2 = new Node<Integer>(20);
//		    node2.next = node1;
//		    print(node2);
	}
	


}
