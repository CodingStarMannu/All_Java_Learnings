package firstproject;
import java.util.Scanner;
public class CheckPrime {
	
	
	public static boolean checkprime1(int n) {
		
		int div=2;
	   boolean isPrime = true;
	   while(div<=2) {
		   if (n%div==0) {
			   isPrime = false;//not prime
			   break;
		   }
		   div = div +1;
		   
	   }
	   return isPrime;
	}

	public static void main(String[] args) {

		  int n;
		     Scanner s=new Scanner(System.in);
		      n=s.nextInt();
		     boolean isPrime=checkprime1(n);
		     System.out.println(isPrime);
		    }
   
   
   
//   int div=2;
////   boolean isPrime = true;
//   while(div<=2) {
//	   if (n%div==0) {
////		   System.out.println(div +" "+ "Composite");
//		   System.out.println("Composite");
////		   isPrime = false;
//		   return;
//	   }
//	   div = div +1;
//	   
//   }
//   System.out.println("Prime");
   
//   if (isPrime){
//	   System.out.println("Prime");
//
//	 }else {
//		   System.out.println("Composite");
//
//	 }
   
   

	}


