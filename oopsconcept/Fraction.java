package oopsconcept;

import exceptionsHandling.DivideByZeroException;

public class Fraction {
	
	int numerator;
	int denominator;
	
	
	public Fraction(int numerator , int denominator) throws DivideByZeroException {
		
		if ( denominator ==0) {
			throw new DivideByZeroException();
			//throw error
//			denominator =1;
		}
		this.numerator = numerator;
		this.denominator= denominator;
		simplify();
	}
	private void simplify() {
		
		int gcd =1;
		int smaller = Math.min(numerator, denominator);
		for(int i =2; i<=smaller;i++) {
			if (numerator% i == 0 && denominator % i ==0) {
				gcd =i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void increment() {
		
		numerator = numerator + denominator;
		simplify();
	}
	
	
	
	
	//Getter And Setter
	
	public void setNumerator (int num) {
	
	this.numerator = num;
	simplify();
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator (int num) throws DivideByZeroException {
		if(num==0) {
			throw new DivideByZeroException();
//			return;
		}
		this.denominator = num;
		simplify();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void print() {
		
		System.out.println(numerator + "/" + denominator);
	}
	
	public void add(Fraction f2) {
		// first fraction is the fraction in which function is called 
		// second fraction is passed as arguments
		
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) throws DivideByZeroException {
		
		int newNume = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNume, newDeno);
		return f3;
	}
	
}
