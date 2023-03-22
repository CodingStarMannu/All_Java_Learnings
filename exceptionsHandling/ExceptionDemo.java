package exceptionsHandling;

public class ExceptionDemo {

	public static int fact ( int n ) throws NegativeNumberException {
		
		if (n<0) {
			throw new NegativeNumberException();
		}
		int ans =1;
		for(int i =0 ; i<=n; i++) {
			ans = ans*i;
		}
		return ans;
	}
		
		public static int divide(int a , int b) throws DivideByZeroException{
			if (b==0) {
				throw new DivideByZeroException();
//				throw new ArithmeticException();
			}
			return a/b;
		
	}
			
	
	
	public static void main(String[] args) {
//		String s = null;
//		System.out.println(s.length());//this will give NullPointerException.
		
//		System.out.println(4/0);// this will give ArithmeticException.
		
//		System.out.println("Main");//exception disrupts the normal execution .
		 try {
			 
		//File f = new file();
		divide(10,0);
		divide(10,5);
		System.out.println(fact(1));
		System.out.println("Within Try");
		
		}//The ‘try’ block should be followed by either a ‘catch’ block or a ‘finally’ block.
		 catch(DivideByZeroException e) {
			System.out.println("Divide by Zero Exception raised");
//			e.printStackTrace();
		}catch(NegativeNumberException e) {
			System.out.println("Negative Number Exception");
		}catch(Exception e) {
			System.out.println("Generic Exception");
		}finally {
			System.out.println("Finally");// finally will always excute and after finally all the statements will also execute.
		}
		 
		 System.out.println("main");
		 
		 
		 
	}
	
	
	
	
	
	
/*	static int divideByZero(int a, int b){ 
        int i = a/b;  
        return i; 
    } 
    static int computeDivision(int a, int b) { 
        int res =0; 
        try
        { 
          res = divideByZero(a,b); 
        } 
        catch(NumberFormatException ex) 
        { 
           System.out.println("Exception occured");  
        } 
        return res; 
    } 
    public static void main(String args[]){ 
        int a = 1; 
        int b = 1; 
        int i=0;  
        try
        { 
             i = computeDivision(a,b); 

        } 
        catch(ArithmeticException ex) 
        { 
            System.out.println(ex.getMessage()); 
        }
        System.out.print(i);
    } */
} 
	
