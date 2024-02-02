package hashmap;

import java.util.HashMap;

public class ArrayIntersection {
	
	public static void printIntersection(int[]arr1, int[]arr2) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for( int i = 0; i< arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				int value = map.get(arr1[i]);
				map.put(arr1[i], value + 1);
				
			}else {
				map.put(arr1[i],1);
			}
		}
		
		for( int i=0; i < arr2.length; i++) {
			if( map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if(freq > 0) {
					System.out.print(arr2[i]+ " ");
					map.put(arr2[i], freq--);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr1 = { 4,2,1,5,6,2,4,1,6,7,3,5};
		int[]arr2 = {5, 6, 7, 1, 4, 5,7,9};
		printIntersection(arr1,arr2);

	}

}
