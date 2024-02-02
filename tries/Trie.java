package tries;


// Most Important for Interviews implement a Trie class
public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	
	//insert word 
	// O(WordLength will be the TimeComplexity for add function)
	private void addHelper(TrieNode root, String word) {
		
		if( word.length()==0) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0)- 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		addHelper(child,word.substring(1));
	}
	
	public void add(String word) {
		
		addHelper(root,word);
		
	}
	
	
	//search the word in the Trie.
	private boolean searchHelper(TrieNode root, String word) {
		
		if(word.length()== 0) {
			return root.isTerminal;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child, word.substring(1));
		
	}
	public boolean search(String word) {
		
		return searchHelper(root, word);
	}
	
	
	//Remove function
	
	public void removeHelper( TrieNode root, String word) {
		
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		
		removeHelper( child, word.substring(1));
		
		if(!child.isTerminal && child.childCount ==0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
	}
	
	public void remove(String word) {
		
		removeHelper(root,word);
	}
}

/*class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	private int numWords;

	public Trie() {
		root = new TrieNode('\0');
		numWords = 0;
	}
	

	public void remove(String word){
		if(remove(root, word)) {
			numWords--;
		}
	}
	

	private boolean remove(TrieNode root, String word) {
		if(word.length() == 0){
			if(root.isTerminating) {
				root.isTerminating = false;
				return true;
			}
			else {
				return false;
			}
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		boolean ans = remove(child, word.substring(1));
		// We can remove child node only if it is non terminating and its number of children are 0	

		if(!child.isTerminating && child.childCount == 0){
			root.children[childIndex] = null;
			child = null;
			root.childCount--;
		}
		return ans;
	}

	private boolean add(TrieNode root, String word){
		if(word.length() == 0){
			if(root.isTerminating) {
				return false;
			}
			else {
				root.isTerminating = true;
				return true;
			}
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));
	}

	public void add(String word){
		if(add(root, word)) {
			numWords++;
		}
	}
	
	public int countWords() {
		// Write your code here
		return numWords;
	}
	
}  */




import java.util.ArrayList;

class TrieNode {
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {

	private TrieNode root;
	public int count;

	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}





	/*..................... Palindrome Pair................... */


	public String reverse(String word) {

		String xString = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			xString += word.charAt(i);
		}
		return xString;

	}

	public boolean isPalindromePair(ArrayList<String> words) {
		
		for(int i=0;i<words.size();i++) {
			
			String string = reverse(words.get(i));
			
			Trie suffixTrie = new Trie();
			for(int j=0;j<string.length();j++) {
				suffixTrie.add(string.substring(j));
			}
			for(String word : words) {
				if(suffixTrie.search(word)) {
					return true;
				}
			}
			
			
		}
		return false;
		
	}


	
} 
