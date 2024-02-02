package oopsconcept;

public class ComplexNumberUse {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(2,3);
//		c1.print();
//		c1.setReal(5);
//		c1.setImaginary(6);
//		c1.print();
//		
		ComplexNumber c2 = new ComplexNumber(4,9);
//		
//		c1.print();
//		c2.print();
//		c1.addCN(c2);
//		c1.print();//c1 after adding c2
//		
//		ComplexNumber c3 = new ComplexNumber(5,8);
//		c3.multiply(c1);//(a + ib) * (c + id)= ac + iad + ibc -bd;
//		c3.print();
//		c2.print();
		
		ComplexNumber c4 = new ComplexNumber(c1,c2);
		c1.print();
		c2.print();
		c4.print();
		

	}

}
