package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1,80);
//		arr.remove(2);
//		Integer i = 10;
//		arr.remove(i);
		
//		arr.set(0, 100);
		
		for (int i =0; i<arr.size();i++) {
			System.out.println(arr.get(i));
			
		}
		
		// enhanced for loop  - for each loop
		
		for (int i : arr) {
			System.out.println(i);
		}
		
//		
//		System.out.println(arr.size());
//		System.out.println(arr.get(2));
		
	}

}
