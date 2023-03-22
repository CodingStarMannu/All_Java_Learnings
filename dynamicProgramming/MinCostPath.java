package dynamicProgramming;

public class MinCostPath {
	
	//Brute Force approach
	
	public static int minCost(int[][]cost, int i, int j) {
		int m = cost.length; 
		int n = cost[0].length;
		 // Special Case 
		if(i==m-1 && j==n-1) {
		return cost[i][j];
		}
//		 Base Case 
		if(i>= m|| j>=n) {
		return Integer.MAX_VALUE;
		}
		int ans1 = minCost(cost,i+1,j);
		int ans2 = minCost(cost, i, j+1);
		int ans3 = minCost(cost, i+1, j+1);

		int myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
		 return myAns;
		
	}
	
	
	//Dp Code
	
	public static int minCostDp(int[][]cost, int i, int j, int dp[][]) {
		
		int m = cost.length; 
		int n = cost[0].length;
		 // Special Case 
		if(i==m-1 && j==n-1) {
		return cost[i][j];
		}
//		 Base Case 
		if(i>= m|| j>=n) {
		return Integer.MAX_VALUE;
		}
		
		int ans1,ans2, ans3;
		if(dp[i+1][j] == Integer.MIN_VALUE) {
			ans1 = minCost(cost,i+1,j);
			dp[i+1][j]= ans1;
		}else {
			ans1 = dp[i+1][j];
		}
		if(dp[i][j+1] == Integer.MIN_VALUE) {
			ans2= minCost(cost,i,j+1);
			dp[i][j+1]= ans2;
		}else {
			ans2 = dp[i+1][j+1];
		}
		if(dp[i][j+1] == Integer.MIN_VALUE) {
			ans3 = minCost(cost,i+1,j+1);
			dp[i+1][j+1]= ans3;
		}else {
			ans3 = dp[i+1][j+1];
		}
		
		ans1 = minCost(cost,i+1,j);
		ans2 = minCost(cost, i, j+1);
		ans3 = minCost(cost, i+1, j+1);

		int myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
		 return myAns;
		
	}
	
	// Iterative
	

	
	public static int minCostIt(int [][]cost) {
		
		int m = cost.length;
		int n = cost[0].length;
		
		int [][] dp= new int [m+1][n+1];
		
		for(int i =0; i<dp.length;i++) {
			for(int j =0; j<dp[i].length;j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i = m-1; i>=0; i--) {
			for(int j = n-1; j>=0; j--) {
				if(i ==m-1 && j==n-1) {
					dp[i][j]= cost[i][j];
					continue;
				}
				
				int ans1 = dp[i][j+1];
				int ans2 = dp[i+1][j];
				int ans3 = dp[i+1][j+1];
				
				dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}
	
//Top down Approach
	
	public static int minCostTopIt(int [][]cost) {
	
		int m = cost.length;
		int n = cost[0].length;
		
		int dp[][]= new int [m+1][n+1];
		
		for(int i = 1; i< m+1;i++) {
			for(int j =1; j< n+1; j++) {
				if(i ==1 && j==1) {
					dp[i][j] = cost[0][0];
				}else {
					int ans1 = dp[i-1][j];
					int ans2 = dp[i][j-1];
					int ans3 = dp[i-1][j-1];
					dp[i][j] = cost[i-1][j-1] + Math.min(ans1, Math.min(ans2, ans3))
				}
			}
		}
		return dp[n][m];
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] [] cost = {{1,5, 11}, {8,13,12}, {2,3,7}, {15, 16, 18}}; 
		
		int [][] dp = new int [cost.length+1][cost[0].length +1];
		for(int i =0; i< dp.length; i++) {
			for(int j =0; j<dp[0].length;j++) {
			dp[i][j] = Integer.MIN_VALUE;
			}
		}
		int ans = minCostIt(cost);
		 System.out.println(ans);
		}
		
}
