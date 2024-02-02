package searchingAndsorting;

public class BubbleSort {
	
	public static void printArray(int []arr) {
		int n = arr.length;
		for (int i =0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubbleSort(int[]arr) {
		
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			//n-1 rounds
			for(int j =0;j<n-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,4,0,5,3};
		bubbleSort(arr);
		printArray(arr);
		
	}
}	

