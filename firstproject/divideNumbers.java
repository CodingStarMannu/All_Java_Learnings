 package firstproject;

public class divideNumbers {
	
	public static int divideNumber(int num, int deno) {
		if (deno ==0) {
			return Integer.MIN_VALUE;
		}
		System.out.println("Inside division function");
		return num/deno;
	}
	
	public static void printDivisionResult(int num, int deno) {
		if (deno ==0) {
			// exit the fuction
			System.out.println("Division by zero is not allowed");
			return;
		}
		System.out.println(num/deno);
		
	}

	public static void main(String[] args) {
	int num = 8;
	int deno = 0;
	printDivisionResult(num,deno);
	int result = divideNumber(num,deno);
	if (result>0) {
		
	}
	System.out.println(result);

	}

}
