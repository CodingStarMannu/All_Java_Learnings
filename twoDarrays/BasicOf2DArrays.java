package twoDarrays;

public class BasicOf2DArrays {

	public static void main(String[] args) {
//		int [][]arr2D = new int [3][4];
//		System.out.println(arr2D[2][1]);
//		arr2D[2][1]=12;
//		System.out.println(arr2D[3][1]);
//		System.out.println(arr2D[1][5]);
		
//		  int arr[][]=new int[4][5];
//		    for(int i=0;i<5;i++)
//		    {
//		        arr[i][0]=2;
//		    }
//		    System.out.print(arr[3][0]);
		
		
	    int arr[][]=new int[4][5];
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<5;j++)
	        arr[i][j]=i*j;
	    }
	    System.out.print(arr[3][4]);
		

	}

}
