package timeComplexity;

public class Arrayintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Solution {

			public static long maximumSumPath(int[] X, int[] Y) {
			long maxsum=0;
		    long s1=0,s2=0;
		    int i=0,j=0;
		    int m = X.length;
		    int n = Y.length;
		    
		    while(i<m && j<n){
		        if(X[i]<Y[j]){
		            s1+=X[i];
		            i++;
		        }
		        else if(X[i]>Y[j]){
		            s2+=Y[j];
		            j++;
		        }
		        else{
		            maxsum+=Math.max(s1,s2)+X[i];
		            s1=0;
		            s2=0;
		            i++;
		            j++;
		        }
		    }
		    //Adding remaining elements
		    while (i<m)
		        s1+=X[i++];
		    while (j<n)
		        s2+=Y[j++];
		    maxsum+=Math.max(s1,s2);
		    return maxsum;
		}
		}
	}

}






public class Solution {
	
	public static String minLengthWord(String str){

		String[] arr = str.split(" ");
		int i = 0;
		int minlength;
		
		minlength = Integer.MAX_VALUE;
		String  smallest = "";
	
		for (i = 0; i < arr.length; i++) {
			if (arr[i].length() < minlength) {
				smallest = arr[i];
				minlength = arr[i].length();
			}
			
		}
		return smallest;
	}

}

