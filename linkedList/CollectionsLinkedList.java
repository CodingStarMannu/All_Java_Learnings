package linkedList;

import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer>list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,100);
		list.addFirst(80);
		list.addLast(60);
		list.set(0, 90);//this will not change size it will replace the value.
		list.remove();
		list.isEmpty();
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		for(int i =0 ; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
