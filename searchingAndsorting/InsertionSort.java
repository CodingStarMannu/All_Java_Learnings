package searchingAndsorting;

public class InsertionSort {
	
	
	public static void printArray(int []arr) {
		int n = arr.length;
		for (int i =0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

   
	public static void insertionsorting(int[]arr) {
		int n = arr.length;
		for (int i=1;i<n;i++) {
			
			int j =i-1;
			int temp= arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
				
			}
			
			arr[j+1]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,4,0,5,3};
		insertionsorting(arr);
		printArray(arr);
		
	}

}
