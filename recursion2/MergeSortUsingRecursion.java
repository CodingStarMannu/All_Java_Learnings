package recursion2;

public class MergeSortUsingRecursion {
	
	
	public static void merge(int s1[], int s2 [], int d[]) {
		int i =0;
		int j =0;
		int k =0;
		while(i < s1.length && j < s2.length) {
			if (s1[i]<= s2[j]) {
				d[k]=s1[i];
				i++;
				k++;
			}else {
				d[k]=s2[j];
				j++;
				k++;
			}
		}
		if(i<s1.length) {
			while(i<s1.length) {
				d[k]= s1[i];
				i++;
				k++;
			}
		}
		if(j < s2.length) {
			while(j < s2.length) {
				d[k]= s2[j];
				j++;
				k++;
			}
		}
	}
	
	

   public static void mergeSort(int a[]) {
	   if (a.length <=1) {
		   return;
	   }
	   int b[]= new int [a.length /2];
	   int c[]= new int [a.length - b.length];
	   
	   for(int i =0; i < a.length /2; i++) {
		   b[i]=a[i];
	   }
	   
	   for (int i =a.length/2; i < a.length;i++) {
		   c[i - a.length /2]= a[i];
	   }
	   
	   mergeSort(b);
	   mergeSort(c);
	   merge(b,c,a);
   }
	public static void main(String[] args) {
		int a[]= {1,4,2,3,11,34,25,12,23,2};
		mergeSort(a);
		for(int i =0 ; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
	
	
	
	
	
	
	
	
	//how to merge two arrays
//  public static int[] merge(int arr1[], int arr2[]) {
//  	
//      int i =0;
//      int j = 0;
//      int k =0;
//      int m = arr1.length;
//      int n = arr2.length;
//      int arr3[]=new int[m+n];
//      while(i<m && j< n){
//          if (arr1[i]<=arr2[j]){
//              arr3[k]=arr1[i];
//              i++;
//              k++;
//          }else{
//              arr3[k]=arr2[j];
//              j++;
//              k++;
//          }
//
//      }
//      while(i<m){
//          arr3[k]=arr1[i];
//          i++;
//          k++;
//      }
//      while(j<n){
//          arr3[k]=arr2[j];
//          j++;
//          k++;
//      }
//      return arr3;
//  
//  }

}
