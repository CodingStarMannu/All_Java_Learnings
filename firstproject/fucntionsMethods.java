package firstproject;

public class fucntionsMethods {
	
	public static double sum(int a, int b, double c) {
		double ans = a + b + c;
		return ans;
	}
	
	public static void printEvenNumbers(int start, int end) {
		
		if (start%2 !=0) {
			start++;
			
		}
		for (int i =2; i <= end; i+=2) {
			System.out.println(i);
		}
	}// when we don't need any output we use void; 

	public static void main(String[] args) {
//		
//		int num1= 10;
//		int num2= 20;
//		double ans = sum(num1,num2, 20.6);
//		System.out.println(ans);
		printEvenNumbers(3, 17);
		
//		int a = printEvenNumbers();// this will give an error
	}

}
