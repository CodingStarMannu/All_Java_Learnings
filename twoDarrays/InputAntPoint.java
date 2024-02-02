package twoDarrays;
import java.util.Scanner;

public class InputAntPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number of rows:");
		int rows= s.nextInt();
		System.out.println("Enter number of cols:");
		int cols = s.nextInt();
		
		
		//taking input or printing array row wise
//		int [][]arr = new int[rows][cols];
//		for (int i =0;i<rows;i++) {
//			for( int j=0;j<cols;j++) {
//				System.out.println("Enter the element at "+ i + " row " + j + " column");
//				arr[i][j]= s.nextInt();
//			}
//		}
//		
//		for (int i =0;i<rows;i++) {
//			for( int j=0;j<cols;j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		//printing column wise
		
		int [][]arr = new int[rows][cols];
		for (int i =0;i<cols;i++) {
			for( int j=0;j<rows;j++) {
				System.out.println("Enter the element at "+ i + " column " + j + " row");
				arr[j][i]= s.nextInt();
			}
		}
		
		for (int i =0;i<cols;i++) {
			for( int j=0;j<rows;j++) {
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		
		
		
		//
		
//		   int[][] arr = new int [2][2]; 
//		    for (int i = 0; i < 2; i++) { 
//		        for (int j = 0; j < 2; j++) { 
//		            System.out.print(arr[i][j] + " "); 
//		        } 
//		    }
		
//		int [][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		
//		System.out.println(arr2d.length);//length will be number of rows in 2d array
//		System.out.println(arr2d);//reference for 2d array
//		System.out.println(arr2d[0]);//reference for 0th row
//		System.out.println(arr2d[1]);//reference for 1st row
//		
//		System.out.println(arr2d.length);//number of rows in 2d array
//		System.out.println(arr2d[0].length);//number of columns in 0th row
		
		
//		 int[][] arr = { { 1, 2 }, { 3, 4 } }; 
//		    System.out.println(arr[0][0]+arr[1][1]); 
		
	}

}
