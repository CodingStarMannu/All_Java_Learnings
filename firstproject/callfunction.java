package firstproject;

public class callfunction {
	
//		public static void b(){
//		    System.out.println("Inside b");
//		}
//		public static void a(){
//		    b();
//		    System.out.println("Inside a");
//		}
//		    
//		public static void main(String args[]) {
//		    a();
//		    System.out.println("Inside Main");
//		    }
	
	
//public static void c(int n) {
//	System.out.println("inside c "+ n);
//	n++;
//}
//
//public static void b (int n) {
//	c(n);
//	System.out.println("inside b "+ n);
//	n++;
//}
//
//public static void a (int n) {
//	b(n);
//	System.out.println("inside a " + n);
//	n++;
//}
//
//public static void main(String[]args) {
//	int n =10;
//	a(n);
//	System.out.println("Inside main "+n);
//}
	
	
//		public static int sum(int a,int b){
//		    int result=a+b;
//		    return result;
//		}
//		public static int increment(int n){
//		    n++;
//		    //System.out.println("Increment "+n);
//		    return n;
//		}
//		    
//		public static void main(String args[]) {
//		    int n=10;
//		    n=increment(n);//we have to store the value before calling to seec changes
//		    System.out.println(" Main "+n);
//		    }
	
//	public static void doubleValue(int a ){
//	    a = a * 2;
//	}
//	public static void main(String[] args) {
//	    int a = 8;
//	    doubleValue(a);
//	    System.out.println(a);
//	}
	
	public static int func(int a){
	    a += 10;
	    return a;
	}

	public static void main(String[] args) {
	    int a = 5;
	    func(a);
	    System.out.println(a);
	}
		
		
}


