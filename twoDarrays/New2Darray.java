package twoDarrays;
import java.util.Scanner;
public class New2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number of rows:");
		int rows= s.nextInt();
		System.out.println("Enter number of cols:");
		int cols = s.nextInt();
		
		
		int [][]arr = new int[rows][cols];
		for (int i =0;i<cols;i++) {
			for( int j=0;j<rows;j++) {
				System.out.println("Enter the element at "+ j + " row " + i + " column");
				arr[j][i]= s.nextInt();
			}
		}
		
		for (int i =0;i<rows;i++) {
			for( int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
