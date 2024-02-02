package recursionAdvance;

import java.util.Scanner;

public class Recursion {
	
	public static void printSubsequences(String input , String strSoFar) {
		
		if(input.length() ==0) {
			System.out.println(strSoFar);
			return;
		}
		
		String smallInput = input.substring(1);
		printSubsequences(smallInput, strSoFar);
		printSubsequences(smallInput, strSoFar + input.charAt(0));
	}
	
	public static String[] subsequences(String input) {
		if(input.length()== 0) {
			//base case
			String[] output = new String[1];
			output[0]= "";
			return output;
		}
		String[] smallOutput = subsequences(input.substring(1));// first character removed
		String [] output = new String[smallOutput.length * 2];
		
		for(int i =0; i < smallOutput.length;i++) {
			output[i] = smallOutput[i];
		}
		for(int i =0; i < smallOutput.length;i++) {
			output[smallOutput.length + i] = input.charAt(0)+ smallOutput[i];
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = s.next();
//		String[] output = subsequences(input);
//		for(String outputString : output) {
//			System.out.println(outputString);
//		}
		
		printSubsequences(input,"");

	}

}
