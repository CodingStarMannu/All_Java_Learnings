package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		
		ArrayList<Integer> output = new ArrayList<>();
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		for( int i =0; i< arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			map.put(arr[i],true);
		}
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1,2,3,3,2,4,5,2,1,6,7};
		ArrayList<Integer> output = removeDuplicates(arr);
		System.out.print(output);
		

	}

}
