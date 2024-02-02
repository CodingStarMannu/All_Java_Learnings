package generics;

public class PairUse {
	
	public static void main(String[]args) {
		
		Pair<String,Integer>pInner = new Pair<String,Integer>("ab", 100);
		Pair <Pair<String,Integer>,String> p = new Pair<>();
		p.setFirst(pInner);
		System.out.println(p.getFirst());
		System.out.println(p.getFirst().getFirst());
		System.out.println(p.getFirst().getSecond());
		
		
		
//		p.setSecond("ABCD");
//		System.out.println(p.getSecond());
		
//		Pair <String , Integer>pSI = new Pair <String, Integer>("ab",10);
//		pSI.setFirst("Name");
//		pSI.getFirst();
		
		
		
		
		
//		Pair <String> S = new Pair<>();
//		S.setFirst("abcdef");
//		
//		System.out.println(S.getFirst()+ " "+ S.getSecond());
//		
		
//		Pair<Integer> p = new Pair<>(10,20);
//		
//		p.setFirst ("aa");
//		p.setFirst(10);
//		
//		String f = (String)p.getFirst();
		
		//we should specify the type at time of creating a variable or a reference variable Otherwise it will give runtime error 
		
		
//		System.out.println(p.getFirst()+ " " + p.getSecond());
//		
//		PairString pS = new PairString("aa" , "bb");
//		PairDouble pD = new PairDouble(3.1, 7.4);
		
//		Pair <String> pS = new Pair<String>("aa", "bb");
//		System.out.println(pS.getFirst()+ " " + pS.getSecond());
//		pS.setFirst("xyz");
//		
////		Pair <int> pI = new Pair <int>(10,30) ; // We can not use primitive datatypes here in generics.
//		
//		//There are in build classes called Wrapper classes available in java-: Integer for int , Character for char and Double for double. 
//		Pair <Integer> pI = new Pair <Integer>(10,30);
//		System.out.println(pI.getFirst()+ " " + pI.getSecond());
//		
//		Pair <Double> pD = new Pair <Double>(10.4,30.5);
//		System.out.println(pD.getFirst()+ " " + pD.getSecond());
//		
//		Pair <Vehicle> pV = new Pair <Vehicle>(new Vehicle(), new Vehicle());
		
	}

}
