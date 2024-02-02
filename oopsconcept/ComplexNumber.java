package oopsconcept;

public class ComplexNumber {
	
	int real;
	int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	//setter & getter
	public void setReal(int num) {
		this.real = num;
	}
	
	public int getReal(int num) {
		return real;
	}
	
	public void setImaginary(int num) {
		this.imaginary = num;
	}
	
	public int getImaginary(int num) {
		return imaginary;
	}
	
	//print Statement
	public void print() {
		
		System.out.println(real + " " + "+" + " "+"i" + imaginary);
	}
	
	public void addCN(ComplexNumber c2) {
		this.real = this.real + c2.real;
		this.imaginary = this.imaginary + c2.imaginary;
		
	}
	
	public void multiply(ComplexNumber c2) {  //(a + ib) * (c + id)= ac + iad + ibc -bd;
		int r = this.real * c2.real - this.imaginary * c2.imaginary;

		this.imaginary = this.imaginary * c2.real + this.real * c2.imaginary;
		this.real =r;
		
	}
	
	public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
		int newreal = c1.real * c2.real - c1.imaginary * c2.imaginary;

		int newImaginary = c1.imaginary * c2.real + c1.real * c2.imaginary;
		c1.real =newreal;
		ComplexNumber c4 = new ComplexNumber(newreal,newImaginary);
		return c4;
	}
	

}
