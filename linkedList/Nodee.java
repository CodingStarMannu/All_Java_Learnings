package linkedList;
import java.util.Scanner;
public class Nodee<T> {
	T data;
	Nodee <T>next;
	Nodee(T data){
		this.data = data;
		this.next =null;
		}
	
	public class LinkedList{
	
		public static void print(Nodee<Integer>head) {
			Nodee<Integer>currNode = head;
			while(currNode!=null) {
				System.out.print(currNode + " ");
				currNode = currNode.next;
			}
			System.out.println();
			
		}
		
		public static void addFirsNode(Nodee<Integer>head){
			head = new Nodee<Integer>(100);
			Nodee<Integer> newNode = head;
			if (head == null) {
		
			}
			newNode.next = head;
			head = newNode;
			
		}
//			
//			while(newNode!= null) {
//				newNode.data++;
//				newNode = newNode.next;
//			}
			
			public static void main(String[] args) {
				Nodee<Integer> List = addFirsNode();
				addFirsNode(head);
		}


	}
}
