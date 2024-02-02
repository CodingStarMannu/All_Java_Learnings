package strings;

public class PalindromeString {
	
	public static String palindrome(String str) {
		int i =0;
		int j=str.length()-1;
		while(i<(str.length())/2  ) {
	
			if (str.charAt(i)!= str.charAt(j)) {
				return"Not Palindrome";
			}else {
				i++;
				j--;
			}
			}
		return"Is a Palindrome String";
		
	}

	public static void main(String[] args) {
		String str = "d";
		String palindrome =palindrome(str);
		System.out.println(palindrome);

	}

}
