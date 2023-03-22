package dynamicProgramming;

public class Knapsack {
	
	public static int knapsackIt(int W, int value[], int weight[]) {
		
		int n = value.length;
		int[][]dp= new int[n+1][W+1];
		for(int i = n-1; i>=0; i--) {
			for(int w =0; w<=W; w++) {
				
				int ans;
				if(weight[i]<=w) {
					int ans1 = value[i] + dp[i+1][w-weight[i]];
					int ans2 = dp[i+1][w];
					ans = Math.max(ans1, ans2);
				}else {
					ans = dp[i+1][w];
				}
				dp[i][w] = ans;
			}
		}
		return dp[0][W];
	}
	
	public static int knapsack(int maxWeight, int value[], int weight[], int startIndex) {
		
		//base case
		if(startIndex == value.length) {
			return 0;
		}
		
		int ans;
		if(weight[startIndex] <= maxWeight) {
			
			//including startIndex
			int ans1 = value[startIndex] + knapsack(maxWeight -weight[startIndex], value, weight, startIndex+1);// max weight is allowed is maxWeight -weight[startIndex]
			
			//excluding startIndex
			int ans2 = knapsack(maxWeight, value,weight, startIndex+1);
			
			ans = Math.max(ans1, ans2);
			
		}else {
			
			ans = knapsack(maxWeight, value, weight, startIndex+1);
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int value[] = { 200, 300, 100};
		int weight[] = {20, 25, 30};
		
		int maxWeight = 50;
	
		
		int ans = knapsack(maxWeight, value, weight, 0);
		int ans1 = knapsackIt(maxWeight,value,weight);
		System.out.println(ans1);

	}

}
