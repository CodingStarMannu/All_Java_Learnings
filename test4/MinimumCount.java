/* Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.*/

package test4;

public class MinimumCount {
	
	
	public static int minCount(int n){
		if (n <= 3)
	            return n;
	 
	        // getMinSquares rest of the
	        // table using recursive
	        // formula
	        // Maximum squares required is
	        int res = n;
	        // n (1*1 + 1*1 + ..)
	 
	        // Go through all smaller numbers
	        // to recursively find minimum
	        for (int x = 1; x <= n; x++)
	        {
	            int temp = x * x;
	            if (temp > n)
	                break;
	            else
	                res = Math.min(res, 1 +
	                          minCount(n - temp));
	        }
	        return res;
	    
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
