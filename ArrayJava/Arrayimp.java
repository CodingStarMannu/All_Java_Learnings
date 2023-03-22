package ArrayJava;

public class Arrayimp {
	
		
//		//find unique
//
//	    public static int findUnique(int[] arr){
//			int n = arr.length;
//	      
//	        int i =0;
//	        int j=0;
//	        for ( ; i <n;i++){
//	               int count=0;
//	             for(j=0; j<n;j++){
//	                 
//	                 if (arr[i]==arr[j]){
//	                     count++;
//	                 }
//	             
//	             }
//
//	            if (count==1){
//	                return arr[i];
//	            }
//
//	        }
//	        return -1;
//	    
//	    }
	
	
	//Find duplicate
	
	  public static int duplicateNumber(int arr[]) {
	    	int n = arr.length;
	        int i=0;
	        int j =0;
	        for(;i<n;i++){

	            int count=0;

	            for (j=0;j<n;j++){
	                if (arr[i]==arr[j]){
	                 count++;
	                  }
	            }
	            if (count!=1){
	                return arr[i];
	            }
	        }
	        return -1;
	    }
	  
	  //Triplet Sum
	  
	    public static int findTriplet(int[] arr, int x) {
	    	int i ,j,k;
	        int n = arr.length;
	        int count=0;
	        for (i=0;i<n;i++){
	            for (j=i+1;j<n;j++){
	                
	                for(k=j+1;k<n;k++){
	                    if(arr[i]+arr[j]+arr[k]==x){
	                        count++;
	                    }
	                }

	            }
	            
	        }
	        
	        return count;
	    }
	    
	    //Sort 0 1
	    
	    public static void sortZeroesAndOne(int[] arr) {
	        int n = arr.length;
	        int count = 0;
	        for(int i=0;i<n;i++){
	           if(arr[i]==0){
	               int temp = arr[i];
	               arr[i]=arr[count];
	               arr[count]=temp;
	               count++;
	           }
	        }
	    }
	    
	    //PAir sum
	    
	    public static int pairSum(int arr[], int x) {
	    	int i ,j;
	        int n = arr.length;
	        int count=0;
	        for (i=0;i<n;i++){
	            
	            for(j=i+1;j<n;j++){
	                if (arr[i]+arr[j]==x){
	                    count++;

	                }

	        }
	        }
	        return count;


	    }
	    
	    
	    // rotate array
	    
	      int n= arr.length;
	    	int arr2 []= new int [arr.length];
	        int k = d;
	        for(int i=0;i<=n-d-1;i++){
	            arr2[i]=arr[k];
	            k++;
	        }
	        k=d;
	        for(int j= 0;j<=d-1;j++){
	            arr2[n-k]= arr[j];
	            k--;
	        }
	        
	        for (int m = 0;m < arr2.length; m++) {
	            arr[m] = arr2[m];
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
