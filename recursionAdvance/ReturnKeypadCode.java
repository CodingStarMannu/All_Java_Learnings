package recursionAdvance;

import java.util.Scanner;

public class ReturnKeypadCode {
	
	public static String getOptions(int digit) {
		
		if(digit ==2) {
			return "abc";
		}
		if(digit ==3) {
			return "def";
		}
		if(digit ==4) {
			return "ghi";
		}
		if(digit ==5) {
			return "jkl";
		}
		if(digit ==6) {
			return "mno";
		}
		if(digit ==7) {
			return "pqrs";
		}
		if(digit ==8) {
			return "tuv";
		}
		if(digit ==9) {
			return "wxyz";
		}
		return "";
	}
	
	
	// printKeypad
	public static void printKeypadCombinations(int input, String stringSoFar) {
		if(input == 0) {
			System.out.println(stringSoFar);
			return;
		}
		int lastDigit =input%10;
		int smallInput = input/10;
		String optionsLastDigit = getOptions(lastDigit);
		for(int i =0; i< optionsLastDigit.length(); i++) {
			printKeypadCombinations(smallInput, optionsLastDigit.charAt(i)+ stringSoFar);
		}
	}
	
	//return keypad
	public static String[] keypad(int n) {
		if(n ==0 || n==1) {
			String[]output = new String[1];
			output[0]= "";
			return output;
		}
		
		String[]smallOutput = keypad(n/10);
		int lastDigit = n%10;
		String lastDigitOptions = getOptions(lastDigit);
		String[] output = new String[smallOutput.length * lastDigitOptions.length()];
		
		int count =0;
		for ( int i = 0; i < smallOutput.length;i++) {
			for(int j =0; j< lastDigitOptions.length();j++) {
				output[count]= smallOutput[i] + lastDigitOptions.charAt(j);
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int input = s.nextInt();
//		String[]output = keypad(input);
//		for(String OutputString : output) {
//			System.out.println(OutputString);
//		}
		
		printKeypadCombinations(input,"");

	}

}
