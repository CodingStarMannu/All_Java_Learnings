package strings;

public class StringsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	     char arr[]={'C','o','d','i','n','g'};
//	      String str="Coding";
//	      String str1="";
//	      System.out.println(str1.length());
//	      System.out.println(str.charAt(2));
//	      System.out.println(str.charAt(6));
//	      
//	      char arr2[]={'C','o','d','i','n','g'};
//	      String strr1="Coding";
//	      String str2="is fun";
//	      String str3="Ceding";
//	      System.out.println(strr1.contains("ing"));
//	      strr1=strr1.concat(str2);
//	      System.out.println(strr1.equals(str3));
//	      System.out.println(strr1.compareTo(str3));
//	      //str1+=str2
//	      //System.out.println(strr1.length());
//	      System.out.println(strr1);
//	      //System.out.println(strr.charAt(2));
//	      //System.out.println(strr.charAt(6));
	      
	      /*
	       String is a non-primitive datatype.
The length() function returns an integer value.
The maximum length of String in java is 2,14,74,83,647.
Strings can store spaces as well
	       */
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
		
//		char arr[]={'C','o','d','i','n','g'};
//	      String str1="Coding";
//	      String str2="is fun";
//	      String str3="Ceding";
//	      System.out.println(str1.contains("ing"));
////	      str1=str1.concat(str2);
////	      System.out.println(str1.equals(str3));
////	      System.out.println(str1.compareTo(str3));
//	      //str1+=str2
//	      //System.out.println(str1.length());
//	      System.out.println(str1);
	      //System.out.println(str.charAt(2));
	      //System.out.println(str.charAt(6));
//		String a="coding",b="ninjas";
//		if(a.contains("ing"))
//		{
//		    a+=b;
//		}
//		else
//		{
//		    b+="ing";
//		}
//		System.out.print(b+a);
		
//		String a="coding";
//		for(int i=2;i<4;i++)
//		{
//		    System.out.print(a.substring(i));
//		}
		
		String a="coding";
		for(int i=2;i<5;i++)
		{
		    System.out.print(a.substring(i-2,i+1));
		}
	}

}
