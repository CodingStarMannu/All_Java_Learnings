package dynamicProgramming;

public class MinStepsToOne {
	
	//Brute force code recursive
	public static int countMinStepsToOne(int n) {

		if( n == 1){
			return 0;
		}

		int minus = 1 + countMinStepsToOne(n-1);

		int divideBy3 = Integer.MAX_VALUE;
		if( n % 3 == 0){
			divideBy3 = 1 + countMinStepsToOne(n/3);
		}

		int divideBy2 = Integer.MAX_VALUE;
		if( n % 2 ==0){
			divideBy2 = 1 + countMinStepsToOne(n/2);
		}

		return Math.min(Math.min(minus, divideBy3), divideBy2);
	}
	
	
	//recursive Dynamic Programming code
	
	public static int minStepsTo1(int n , int[] dp) {
		if( n==1) {
			return 0;
		}
		int ans1;
		if(dp[n-1] == -1) {
			ans1 = minStepsTo1(n-1, dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		
		int ans2 = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			if( dp[n/2] == -1) {
			ans2 = minStepsTo1(n/2, dp);
			dp[n/2] = ans2;
			}else {
				ans2 = dp[n/2];
			}
		}
		int ans3 = Integer.MAX_VALUE;
		if(n%3 == 0) {
			if(dp[n/3] ==-1) {
			ans3 = minStepsTo1(n/3, dp);
			dp[n/3] = ans3;
			}else {
				ans3 = dp[n/3];
			}
		}
		int myAns = Math.min(ans1, Math.min(ans2, ans3)) + 1;
		return myAns;
		
	}
	
	//Iterative DP code
	
	

	public static void main(String[] args) {
		
		int n = 15;
		int[] dp = new int [n+1];
		for(int i =0; i< dp.length; i++) {
			dp[i] = -1;
		}
		int ans = minStepsTo1(n, dp);
		
		System.out.println(ans);

	}

}
