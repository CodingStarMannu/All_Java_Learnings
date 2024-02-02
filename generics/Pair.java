package generics; 

// We have to create same classes for variable type String, DOuble etc. So If the class is different in terms of type of variable .We can use generics instead. 
// By using Generics we can leave the selection of variable type at the time of object declaration.
public class Pair<T,S> {
	
	//variables
	private T first;//we are replacing all int with 'T'or we can use any word or letter instead of 'T'.
	private S second;
	
	
	public Pair() {}
	
	//Constructor
	public Pair (T first, S second) {
		this.first =  first;
		this.second = second;
		
	}
	
	
	//Getter and Setter
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second = second;
	}

	

}
