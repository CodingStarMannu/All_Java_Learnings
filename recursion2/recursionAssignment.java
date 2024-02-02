package recursion2;

public class recursionAssignment {
	
	//check palindrome
	
	public static boolean isStringPalindrome(String input) {
		if(input.length()<=1){
			return true;
		}else if( input.charAt(0)!= input.charAt(input.length()-1)){
			return false;
		}
		return isStringPalindrome(input.substring(1, input.length()-1));


	}
	
	//CountZeros
	
	public static int countZerosRec(int input){
		if (input ==0){
			return 1;
		}// just handle the input 0;
		if(input<10){
			return 0;
		}// base case
		int firstdigit = input%10;
		if(firstdigit==0){
			return 1 + countZerosRec(input/10);
		}
		return countZerosRec(input/10);
	}
	
	//convertStringIntoInteger
	public static int convertStringToInt(String input){
		if (input.length()==1){
			return input.charAt(0) - '0';
		}
		int smallOutput = convertStringToInt(input.substring(0, input.length()-1));
        int lastDigit = input.charAt(input.length()-1) - '0';
		return smallOutput*10 + lastDigit;
	}
	
	
	//addStarsbetweensamecharacters
	
	public static String addStars(String s) {
		if (s.length()<=1) {
			return s;
		}

		if (s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + addStars(s.substring(1));//s.substring(1)will print the string starting from index 1
		}
		return s.charAt(0)+ addStars(s.substring(1));
	}

	//Staircase
	
    public static int staircase(int n){
		
		 if (n==0){
			 return 1;
		 }else if (n<0){
			 return 0;
		 }else{
			 return staircase(n-1)+ staircase(n-2) + staircase(n-3);
		 }

	}
    
    //CheckAB
    
    public static boolean checkAB(String input) {
		if (input.length()==0){
			return true;
		}
		if (input.charAt(0)!='a'){
			return false;
		}
		if (input.length() >= 3 && "abb".equals(input.substring(0, 3))){
			return checkAB(input.substring(3));
		}else{
			return checkAB(input.substring(1));
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
