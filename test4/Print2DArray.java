/* Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time. */


package test4;

public class Print2DArray {

	public static void main(String[] args) {
		public static void print2DArray(int input[][]) {
			int c=0,n=input.length;
	        for(int i=0;i<input.length;i++){
	            c=0;
	            while(c<n-i){
	            for(int j=0;j<input[i].length;j++){
	                System.out.print(input[i][j]+" ");
	              
	            } 
	            c++;
	            System.out.println();
	            }

			}
		}

}
