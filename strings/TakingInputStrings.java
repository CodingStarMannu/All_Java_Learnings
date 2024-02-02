package strings;

import java.util.Scanner;

public class TakingInputStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
//		String str;
//		str = s.next();//it deals with token and give output till space (delimeter).
////		str = s.nextLine();//it gives the whole line as output
//		System.out.println(str+ " " + str.length());
		
		String str1=s.next();
		String str2=s.nextLine();
		String str3=str2+str1;
		System.out.println(str3);
	}

}
