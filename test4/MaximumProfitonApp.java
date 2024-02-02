/* You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.
Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :
 m * x
where m is total number of subscribers whose budget is greater than or equal to x.*/

package test4;
import java.util.*;
import java.lang.*;
public class MaximumProfitonApp {

	public static void main(String[] args) {

	public static int maximumProfit(int budget[]) {
			   Arrays.sort(budget);
	
	        
	        int ans=Integer.MIN_VALUE;
	        int n=budget.length;
	    	for(int i=0;i<n;i++)
	    	{
	        	ans=Math.max(ans,budget[i]*(n-i));
	    	}
	    	return ans;
	
		
	}
}
