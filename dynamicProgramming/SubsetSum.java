package dynamicProgramming;

public class SubsetSum {
	
	static boolean isSubsetPresent(int[] arr, int n, int sum) {

	    //     if (sum == 0)
	    //         return true;
	    //     if (n == 0)
	    //         return false;
	 
	    //     // If last element is greater than
	    //     // sum, then ignore it
	    //     if (arr[n - 1] > sum){

	    //         return isSubsetPresent(arr, n - 1, sum);
	    //     }else{
	    //         return isSubsetPresent(arr, n - 1, sum) || isSubsetPresent(arr, n - 1, sum - arr[n - 1]);
	    //     }
	 
	    //     /* else, check if sum can be obtained
	    //     by any of the following
	    //         (a) including the last element
	    //         (b) excluding the last element */
	        

	    // }



	    // The value of subset[i][j] will be
	        // true if there is a subset of
	        // arr[0..j-1] with sum equal to i
	        boolean subset[][] = new boolean[sum + 1][n + 1];
	 
	        // If sum is 0, then answer is true
	        for (int i = 0; i <= n; i++)
	            subset[0][i] = true;
	 
	        // If sum is not 0 and arr is empty,
	        // then answer is false
	        for (int i = 1; i <= sum; i++)
	            subset[i][0] = false;
	 
	        // Fill the subset table in bottom
	        // up manner
	        for (int i = 1; i <= sum; i++) {
	            for (int j = 1; j <= n; j++) {
	                subset[i][j] = subset[i][j - 1];
	                if (i >= arr[j - 1])
	                    subset[i][j] = subset[i][j] || subset[i - arr[j - 1]][j - 1];
	            }
	        }
	 
	        /* // uncomment this code to print table
	        for (int i = 0; i <= sum; i++)
	        {
	        for (int j = 0; j <= n; j++)
	            System.out.println (subset[i][j]);
	        } */
	 
	        return subset[sum][n];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
