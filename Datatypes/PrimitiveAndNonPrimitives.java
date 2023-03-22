package Datatypes;

public class PrimitiveAndNonPrimitives {

//	public static void increment(int i) {
//			i++;
//		}
	
	public static void printArray(int[]arr) {
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] incrementArray(int[]input) {

		input = new int[7];// by default arrays are initialized with the value 0.
		for (int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		
//		System.out.print(input[i]);// now the array become 111111.
		}
		return input;
	}
		public static void main(String[] args) {
//			int i = 10;
//			increment(i);
//			System.out.println(i);
			
			int[] arr= {1,2,3,4,5};
//			System.out.println(arr);
			arr = incrementArray(arr);
			printArray(arr);
			

		}

	}
