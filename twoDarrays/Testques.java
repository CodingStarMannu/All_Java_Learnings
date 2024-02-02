package twoDarrays;

public class Testques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Rectangular numbers
		Send Feedback
		Print the following pattern for the given number of rows.
		Pattern for N = 4
		4444444
		4333334
		4322234
		4321234
		4322234
		4333334  
		4444444
		Input format : N (Total no. of rows)
		Output format : Pattern in N lines
		Sample Input :
		3
		Sample Output :
		33333
		32223
		32123
		32223
		33333
		*/

		public class RectangularNumbers { 
		    // coding ninjas solution
		    public static void print(int n) {
		        // Write your code here
		        int i, j, a;
		        for (i = -(n - 1); i < n; i++) {
		            a = n;
		            for (j = -(n - 1); j < n; j++) {
		                if (Math.abs(i) < Math.abs(j)) {
		                    if (j < 0) {
		                        System.out.print(a);
		                        a--;
		                    } else {
		                        a++;
		                        System.out.print(a);
		                    }
		                } else {
		                    System.out.print(a);
		                }
		            }
		            System.out.println();
		        }
		    }
		    
		    
		    
		    
		    //
		    

public static int tripletSum(int[] arr, int num) {
	 Arrays.sort(arr);
     int n = arr.length;
     
     int numTriplets = 0;
     
     for (int i=0; i<n; i++) {
         int pairSum = num - arr[i];
         int numPairs = 0;
         
         int start = i + 1;
         int stop = n - 1;
          
          while (start < stop) {
             if (arr[start] + arr[stop] < pairSum) {
                 start++;
             } else if (arr[start] + arr[stop] > pairSum) {
                 stop--;
             } else {
                if (arr[start] == arr[stop]) {
                    int totalCount = (stop - start) + 1;
                    numPairs += (totalCount * (totalCount - 1) / 2);
                    break;
                }
                 
                 int tempI = start + 1;
                 int tempJ = stop - 1;		
	}

}
