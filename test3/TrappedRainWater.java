package test3;

public class TrappedRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution {
		    public int trap(int[] height) {
		    int n = height.length;
		    int left[]= new int [n];
		    int right [] = new int [n];

		    left[0] = height[0];
		    for(int i =0;i<n; i++){
		        height[i]< left[i-1];
		    }else{
		        left[i]=height[i];
		    }

		    right[n-1]= height[n-1];
		    for(int i=n-2;i>=0;i--){
		        if (height[i]= right[i]){
		            right[i] = right[i+1];
		        }else{
		            right[i]= height[i];
		        }
		        int ans =0;
		        for(int i =0 ; i<n; i++){
		            ans = ans + Math.min(left[i],right[i])-height[i];
		        }
		    }
		    }
		}
	}

}
