package hashmap;

import java.util.HashMap;
import java.util.Set;

public class InternalMapUse {
	
	
	//Maximum Frequency Number
	
	  public static int maxFrequencyNumber(int[] arr){ 

			HashMap<Integer,Integer> h = new HashMap<>();
			for( int i = 0 ; i< arr.length; i++){
				if ( !h.containsKey(arr[i])){
						h.put(arr[i],1);
				}else{
						h.put(arr[i], h.get(arr[i])+1);// get is function in hashMap to get the frequency 
				}
			}

			int max = 0;
			int maxKey = Integer.MIN_VALUE;
			for( int i =0 ; i< arr.length; i++){
				if ( max < h.get(arr[i])){
					max = h.get(arr[i]);
					maxKey = arr[i];
				}
			}
	return maxKey;

		
	    }

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		//insert 
		
		map.put("abc", 1);
		map.put("def",3);
		
		//size
		
		map.put("abc", 4);
		System.out.println(map.size());
		
		//presence
		
		if ( map.containsKey("abc")) {
			System.out.println("map has abc");
		}
		if ( map.containsKey("abc1")) {
			System.out.println("map has abc1");
		}
		
		//get Value
		
		int v = map.get("abc");
		System.out.println(v);
		
		
		int v1 = 0;
		if ( map.containsKey("abc1")) {
			v1 = map.get("abc1");
		}
		 
		System.out.println(v1);
		
		//remove
		 
		map.remove("abc1");
//		if ( map.containsKey("abc")) {
//			System.out.println("map has abc");
//		}
		
		//iterate
		
		Set<String> keys = map.keySet();
		for(String s: keys) {
			System.out.println(s);
		}
		
		

	}

}
