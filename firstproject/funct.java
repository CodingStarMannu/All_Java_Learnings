package firstproject;
import java.util.Scanner;
public class funct {
	
//	  public static int factorial(int num) {
//	        int fact=1;
//	     for(int i=1;i<=num;i++){
//	         fact=fact*i;
//	     } 
//	     return fact; 
//	    }
//	  
//	  public static int facto(int n , int r) {
//		  int factN = factorial(n);
//	        int factR = factorial(r);
//	        int factNR = factorial(n-r);	
//		 int result=factN/(factR*factNR);
//		  return result;
//	  }
//	    public static void main(String[] args) {
//	        Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//	        int r=s.nextInt();
//	        int result= facto(n,r);
//	        System.out.println(result);
	        
	        public static void main(String[] args) { 
//	        	int p = 100;
//	        	if(p > 20) {
//	        	    if(p < 20) {
//	        	        System.out.print("coding");
//	        	    }
//	        	} else {
//	        	    System.out.print("ninjas");
//	        	}
	        	
	           
	              
//	                 int x , y = 1;
//	                 x = 10;
//	                 if (x != 10 && x / 0 == 0)
//	                     System.out.println(y);
//	                 else
//	                     System.out.println(++y);
	        	
//	            int a = 10, b = 20, c = 100;
//
//	            if(a <= b && b != 20) {
//	                System.out.println("hello");
//	            }
//	            else if(c >= a && c >= b) {
//	                System.out.println("hi");
//	            }
//	            else {
//	                System.out.println("hey");
//	            }
	        	
//	            int a = 10, b = 20, c = 100;
//
//	            if(a <= b || c <= b) {
//	                System.out.println("hello");
//	            }
//	            else if(a <= b || a <= c) {
//	                System.out.println("hi");
//	            }
//	            else {
//	                System.out.println("hey");
//	            }
//	        	int a = 6;
//	        	int b = 12;
//	        	while (a < b) {
//	        	    System.out.print("In the loop");
//	        	    a += 2;
//	        	    b -= 2;
//	        	}
	        	
//	        	int x = 10;
//	        	while(x >= 0) {
//	        	    x = x - 1;
//	        	    System.out.print(x);
//	        	    x--;
//	        	}
	        	
	          
//	        		  int r,sum=0,temp;    
//	        		  int n=454;//It is the number variable to be checked for palindrome  
//	        		  
//	        		  temp=n;    
//	        		  while(n>0){    
//	        		   r=n%10;  //getting remainder  
//	        		   sum=(sum*10)+r;    
//	        		   n=n/10;    
//	        		  }    
//	        		  if(temp==sum)    
//	        		   System.out.println("palindrome number ");    
//	        		  else    
//	        		   System.out.println("not palindrome");    
//	        		}  
	        
	        			Scanner s = new Scanner(System.in);
	        			int n = s.nextInt();
	        			int[] arr=new int[n]; 
	        			
	        	        int d = arr[1] - arr[0];
	        	        for (int i = 1; i < n; i++){
	        	            if (arr[i] - arr[i-1] != d){
	        					System.out.println("false");
	        				}else{
	        					System.out.println("true");
	        				}
	        	              
	        	         
	        	        
	        	    }
	        	     

	        	 
	}
}

