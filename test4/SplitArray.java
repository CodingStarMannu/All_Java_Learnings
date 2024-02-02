/* Given an integer array A of size N, check if the input array can be splitted in two parts such that -
- Sum of both parts is equal
- All elements in the input, which are divisible by 5 should be in same group.
- All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
- Elements which are neither divisible by 5 nor by 3, can be put in any group.
Groups can be made with any set of elements, i.e. elements need not to be continuous. And you need to consider each and every element of input array in some group.
Return true, if array can be split according to the above rules, else return false. */


package test4;

public class SplitArray {
	
	public static boolean splitArray(int input[]) {
		return splitArray(input,0,0,0);
		}
	    
	     public static boolean splitArray(int arr[], int si, int lsum, int rsum) 
		{ 
	         //lsum for sum of numbers divisible by 5 and rsum for sum of numbers divisible by 3
	  
	    	if (si == arr.length) 
	        {
	            return lsum == rsum;
	        }
	         
	    	if (arr[si] % 5 == 0)
	        {
	            lsum += arr[si];
	        }
	        else if (arr[si] % 3 == 0) 
	        {
	            rsum += arr[si]; 
	        }
	        else
	        {
	            return splitArray(arr,si+1, lsum+arr[si], rsum)  || splitArray(arr,si+1,lsum,rsum+arr[si]);
	        }
	         
	    	return splitArray(arr,si+1,lsum,rsum); 
		} 
			
		
		

	

	public static void main(String[] args) {
		 int arr[] = { 1, 4, 3 };
		    int n = arr.length;
		 
		    if (splitArray(arr, n))
		        System.out.println( "Yes");
		    else
		        System.out.println( "No");
		}

	}

}
