package searchingAndsorting;

public class selectionSort {
	
	public static void printArray(int []arr) {
		int n = arr.length;
		for (int i =0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void SelectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0 ; i<n-1; i++) {
			// insert element at ith position;
			
			int min = Integer.MAX_VALUE;
			int minIndex =-1;
			
			for(int j=i;j<n-1-i; j++){
				//finding the minimum element among j positions
				
				if (arr[j]<min) {
					min = arr[j];
					minIndex=j;
					
				}
			}
			
			//Swap element at minIndex with its element
			int temp = arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]= temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,4,0,5,3};
		SelectionSort(arr);
		printArray(arr);
		
	}

}
