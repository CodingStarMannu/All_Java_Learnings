package oopsAdvanceConcept;

public class Polynomial {
	
	private int coefficients[];
	private int nextElementIndex;
	
	public Polynomial() {
		
		coefficients = new int [5];
		nextElementIndex =0;
		
	}
	
	public void setCoefficient(int deg, int coeff) {
		if(deg>= coefficients.length-1) {
			 // create a new array with size = deg +1
			int temp[]= coefficients;
			 coefficients = new int [deg +1];
			 
			 //copy values from temp to coefficients
			 for(int i =0 ; i< temp.length; i++) {
				 coefficients[i] = temp[i];
			 }
		}
			
			 
		
		coefficients[deg]= coeff;
	}
	
	public int getCoefficient(int degree) {
		
		if (degree<this.coefficients.length){
			return coefficients[degree];
		}else {
			return 0;
		}
	}
		
	
	
	public int degree() {
		return nextElementIndex;
	}
	
	public void print() {
		
		for (int i = 0 ; i< coefficients.length; i++) {
			if(coefficients[i]!=0) {
				System.out.print(coefficients[i]+ "x"+ i + " ");
			}
		}
	}
		
	
	
	public Polynomial add(Polynomial p) {
		Polynomial ans = new Polynomial();
		int p1 = this.coefficients.length;
		int p2 = p.coefficients.length;
		
		int len = Math.min(p1, p2);
		int i =0;
		for( i =0; i < len;i++) {
			ans.setCoefficient(i, this.coefficients[i]+ p.coefficients[i]);
		}
		
		while(i<p1) {
			ans.setCoefficient(i, this.coefficients[i]);
			i++;
		}
		while(i<p2) {
			ans.setCoefficient(i,p.coefficients[i]);
			i++;
		}
		return ans;
		
		
	
		
	}
	
	public Polynomial subtract(Polynomial p) {
		Polynomial ans = new Polynomial();
		int p1 = this.coefficients.length;
		int p2 = p.coefficients.length;
		
		int len = Math.min(p1, p2);
		int i =0;
		for( i =0; i < len;i++) {
			ans.setCoefficient(i, this.coefficients[i] - p.coefficients[i]);
		}
		
		while(i<p1) {
			ans.setCoefficient(i, this.coefficients[i]);
			i++;
		}
		while(i<p2) {
			ans.setCoefficient(i, -p.coefficients[i]);
			i++;
		}
		return ans;
	}

	
	
	public Polynomial multiply(Polynomial p) {
		Polynomial ans = new Polynomial();
		for (int i =0 ; i<this.coefficients.length;i++) {
			for(int j =0 ; j < p.coefficients.length;j++) {
				int degreeterm = i+j;
				int coeffterm = this.coefficients[i]*p.coefficients[j];
				int oldcoeff = ans.getCoefficient(degreeterm);
				ans.setCoefficient(degreeterm, coeffterm + oldcoeff);
			}
		}
		return ans;
	}
	
//	public int evaluate(int x) {
//		
//	}
//	
//	public static Polynomial add(Polynomial p1, Polynomial p2) {
//		
//	}

	
	
	

}
