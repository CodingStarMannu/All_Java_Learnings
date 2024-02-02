package recursion2;

public class RecursionWithStrings {
	
	
	//replace char
//	public static String replaceChar(String s , char a , char b) {
//		if (s.length()==0) {
//			return s;
//			
//		}
//		String smallOutput = replaceChar(s.substring(1), a , b);
//		if (s.charAt(0)== a) {
//			return b + smallOutput;
//		}else {
//			return s.charAt(0) + smallOutput;
//		}
//	}
	
	
	
	//remove X
	
	public static String removeX(String input) {
		if (input.length()==0) {
			return "";
		}
		String smallOutput = removeX(input.substring(1));
		if (input.charAt(0)=='x') {
			return removeX(input.substring(1));
		}
		 return input.charAt(0) + smallOutput;
	}
	
	
	//replace Pi
	
	public static String replacePi(String s) {
		if (s.length()<=1) {
			return s;
		}
		if (s.charAt(0)== 'p' && s.charAt(1)=='i') {
			//call recursion on string of length n-2;
			String smallOutput  = replacePi(s.substring(2));
			return "3.14" + smallOutput;
		}else {
			//call recursion on string of lnegth n-1;
			String smallOutput= replacePi(s.substring(1));
			return s.charAt(0)+ smallOutput;
		}
	}
	
	
	//removeConsecutive Duplicates
	
	public static String removeConsecutiveDuplicates(String s) {
		if (s.length()<=1) {
			return s;
		}
		if (s.charAt(0)==s.charAt(1)) {
			String smallOutput= removeConsecutiveDuplicates(s.substring(1));
			return smallOutput;
		}else {
			String smallOutput= removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	
	
	// findFirstIndex
	
	public static int firstIndex(int input[], int x) {
		int  i=0;
		int length=input.length;
	return find(input, x,i,length-1);
		
	}

	public static int find(int input[], int x,int i, int len){

		if(i>len) return -1;
		if(input[i]==x){
			return i;
		}
		return find(input,x,i+1,len);
		
// FindLastIndex
		
		public static int lastIndex(int input[], int x ){
			int  si=0;
			int len=input.length;
		return findLastIndex(input, x,si,len-1);
		}//This is called helper func or code

		public static int findLastIndex(int input[],int x, int si, int len){
		if (si == len) {
				return -1;
			}
			int ans = findLastIndex(input, x, si+1,len);
			if (ans != -1) {
				return ans;
			}else {
				if (input[si]==x) {
					return si;
				}else {
					return -1;
				}
			}
			}
		
		

	public static void main(String[] args) {
//		System.out.println(replaceChar("abcdxgxcxhmxpcmhhxxx", 'x', 'y'));
//		System.out.println(removeX("abcdxgxcxhmxpcmhhxxx"));
//		System.out.println(replacePi("apiapibpicpidpiip"));
		System.out.println(removeConsecutiveDuplicates("aaavvvvddddggggehhrhhhhhh"));
	}

}
