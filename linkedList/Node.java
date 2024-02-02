package linkedList;

public class Node<T> { // we are using generic here to give flexiblity to use any type of datatype like int , float , double, String etc. 
	public T data;
	public Node <T> next;//this is for the reference of next node.
	public Node(T data){
		this.data = data;
		next = null;// the default value of next node reference will be null.
	}
}
