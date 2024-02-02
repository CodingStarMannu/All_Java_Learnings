package oopsconcept;

import exceptionsHandling.DivideByZeroException;

public class FractionUse {

	public static void main(String[] args) {
		
		Fraction f1;
		try {
			f1 = new Fraction(4,6);
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		f1.print();
		
		
//		f1.setNumerator(12);
//		f1.getNumerator();
//		f1.setDenominator(4);
//		f1.getDenominator();
		
//		f1.increment();
//		f1.print();
		
		Fraction f2 = new Fraction(4,8);
		f2.print();
//		f1.add(f2);
//		f1.print();
		
		Fraction f3 = Fraction.add(f1, f2);//static variant
		f3.print();
		
		
		
		
	}

}
