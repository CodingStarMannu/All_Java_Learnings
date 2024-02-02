package oopsconcept;

public class Test {
	  
//	        int a; 
//	        int b; 
//
//	    public void set(int a, int b) 
//	    {  
//	        b = a; 
//	        this.b = b; 
//	    } 
//
//	    void display() 
//	    { 
//	        System.out.println("a=" + a + " b=" + b); 
//	    }
	
	
//	 public static void main(String[] args) 
//	    {  
//	        Constructor geek3 = new Constructor("Dharmesh", 26); 
//	    } 
	
	
//	int a; 
//    int b; 
//    public Test() 
//    {   
//        this(10, 20);   
//        System.out.print("constructor one "); 
//    } 
//   public Test(int a, int b) 
//    { 
//        this.a = a; 
//        this.b = b; 
//        System.out.print("constructor two "); 
//    } 
	
	 static int a = 10; 
	    int b = 20; 
	    static void fun1() 
	    { 
	        a = 20;                             //Line 1
	        b = 10;                             //Line 2
	        fun2();                             //Line 3
	        System.out.print(this.b);           //Line 4
	    } 
	    void fun2() 
	    {     
	        System.out.println("from m2"); 
	    }
	    
	    /* Line 2: static functions cannot use non-static variables.

Line 3: Static function cannot call non-static function.

Line 4:this or super keyword cannot be used inside a static function. */
}
