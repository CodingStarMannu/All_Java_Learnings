package ArrayJava;

public class arrayquestions {


	
	public static void mul(int [] arr)
	{
		System.out.println(arr);
	    for(int i=0;i<5;i++)
	    arr[i]*=i;
	}
//	public static void main (String[] args) {
//	    int arr[]={1,2,3,4,5};
////	    mul(arr);
//	    for(int i=0;i<5;i++) {
//		    arr[i]*=i;
//	    System.out.println(arr[i]);
//	    }
//	    
//	    for(int i=0;i<5;i++)
//	    {
//	        System.out.println(arr[i]);
//	    }
	// }
//
//	
//	public static void mul(int [] arr)
//	{
//	    for(int i=0;i<5;i++)
//	    arr[i]*=i;
//
//	}
//	public static void main (String[] args) {
//	    int arr[]={1,2,3,4,5};
//	    mul(arr);
//	    for(int i=0;i<5;i++)
//	    {
//	        System.out.print(arr[i]);
//	    }
//	}
public static void change(int input[]){
input = new int[5];
input[0] = 15;
}

public static void main(String args[]){
    int arr[] = new int[5];
    change(arr);
    System.out.println(arr[4]);
}
	
}
	

