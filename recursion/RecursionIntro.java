package recursion;

public class RecursionIntro {
	
	public static int fact (int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int output = n* smallOutput;
		return output;
	}
	
	public static int sumn(int n) {
		if (n==0) {
			return 0;
		}
		int smalloutput = sumn(n-1);
		int output = n + smalloutput;
		return output;
	}
	
	public static void print1toN(int n) {
		if (n==0) {
			return;
		}
		print1toN(n-1);
		System.out.println(n);
//		print1toN(n-1);//if we call this after print it will reverse the whole numbers
	}
	
	
	//fibonacci number
	
	public static int fib(int n) {
		if (n==1 || n==2) {
			return 1;
		}
			
		
		int fib_n_1 = fib( n-1);
		int fib_n_2 = fib( n-2);
		int ans = fib_n_1 + fib_n_2;
		return ans;
		
	}
	
	//Sorted array
	
	public static boolean isSorted(int a[]) {
		if (a.length == 1) {
			return true;
			
		}
		if (a[0]> a[1]) {
			return false;
		}
		
		int smallArray[] = new int [a.length-1];
		for (int i =1; i<a.length;i++) {
			smallArray[i-1]=a[i];
		}
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
	}
	
	
	public static boolean isSortedBetter(int a[], int si) {
		if (si == a.length -1) {
			return true;
		}
		if (a[si]>a[si+1]) {
			return false;
		}
		boolean isSmallArraySorted = isSortedBetter(a, si+1);
		return isSmallArraySorted;
	}

	public static void main(String[] args) {
//		System.out.println(fact(5));
//		System.out.println(sumn(10));
//		print1toN(5);
//		System.out.println(fib(8));
		int a[]= {1,2,3,4,5,};
		isSortedBetter(a, 2);
//		System.out.print
		

	}

}
