package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
//		StringBuffer are mutable.We can perform insert append delete and other operations on StringBuffer.
// StringBuffer does not stored on stringpool unlike strings.
//		StringBuffer str= new StringBuffer("abc");
//		str.setCharAt(0, 'f');
//		str.append("def");
//		
////		System.out.println(str + " "+ str.length());
//		String s= "d";
//		for(int i =0; i<5;i++) {
//			s=s+"z";
////			System.out.println(s);
//		}
//		System.out.println(s);

		
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)('a'+i));
//		    System.out.println(str1);
		}
		System.out.println(str1);
		
		

	}

}
