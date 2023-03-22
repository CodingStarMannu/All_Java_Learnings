package dynamicProgramming;

public class SuperSequence {
	
	public static int smallestSuperSequence(String str1, String str2) {

		int m = str1.length();
	    int n =str2.length();
	    int[][] dp = new int[m+1][n+1];
	    
	    // initialize the first row and first column of the dp array
	    for (int i = 0; i <= m; i++) {
	        dp[i][0] = i;
	    }
	    for (int j = 0; j <= n; j++) {
	        dp[0][j] = j;
	    }
	    
	    // fill the dp array using bottom-up approach
	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (str1.charAt(i-1) ==str2.charAt(j-1)) {
	                dp[i][j] = 1 + dp[i-1][j-1];
	            } else {
	                dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
	            }
	        }
	    }
	    
	    // return the length of the shortest super sequence
	    return dp[m][n];
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
