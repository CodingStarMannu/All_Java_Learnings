package recursion;
import java.util.Scanner;

public class checknumberpresentArray {
	
	
	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input, x, input.length-1);
		
	}
	 public static boolean checkNumber(int input[], int x, int len){
	 	if(len<0){
	 		return false;
	 	}
	 	if(input[len]==x){
	 		return true;
	 	}
	 	return checkNumber(input, x, len-1);
	 } 

	public static void main(String[] args) {
		static Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checknumberpresentArray.checkNumber(input, x));
	}
	

}
