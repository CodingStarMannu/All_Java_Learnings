package oopsAdvanceConcept;

import java.util.Scanner;

public class PolynomialUse {

	public static void main(String[] args) {
		
		
		Polynomial p1 = new Polynomial();
		p1.setCoefficient(0,3);
		p1.setCoefficient(2,2);
		p1.print();
		
		Polynomial p2 = new Polynomial();
		p2.setCoefficient(0,3);
		p2.setCoefficient(2,2);
		p2.setCoefficient(1,4);
		p2.setCoefficient(2,5);
		p2.print();
//		
		p1.add(p2);
		p1.print();
		p2.print();
//		
//		p2.multiply(p1);
//		p2.print();
//		p1.print();
//		
//		Polynomial p3 = Polynomial.add(p1,p2);//static funcn
//		p3.print();
//		p1.print();
//		p2.print();
//		
//		int ans = p2.evaluate(10);
//		System.out.println(ans);
//		
		
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int degree1[] = new int[n];
//		for(int i = 0; i < n; i++){
//			degree1[i] = s.nextInt();
//		}
//		int coeff1[] = new int[n];
//		for(int i = 0; i < n; i++){
//			coeff1[i] = s.nextInt();
//		}
//		Polynomial first = new Polynomial();
//		for(int i = 0; i < n; i++){
//			first.setCoefficient(degree1[i],coeff1[i]);
//		}
//		n = s.nextInt();
//		int degree2[] = new int[n];
//		for(int i = 0; i < n; i++){
//			degree2[i] = s.nextInt();
//		}
//		 int coeff2[] = new int[n];
//		for(int i = 0; i < n; i++){
//			coeff2[i] = s.nextInt();
//		}
//		Polynomial second = new Polynomial();
//		for(int i = 0; i < n; i++){
//			second.setCoefficient(degree2[i],coeff2[i]);
//		}
//		int choice = s.nextInt();
//		Polynomial result;
//		switch(choice){
//		// Add
//		case 1: 
//			 result = first.add(second);
//			result.print();
//			break;
//		// Subtract	
//		case 2 :
//			 result = first.subtract(second);
//			result.print();
//			break;
//		// Multiply
//		case 3 :
//			 result = first.multiply(second);
//			result.print();
//			break;
//		}

//	}
		
		
		
	}

}
