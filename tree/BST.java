package tree;

public class BST {

	private BinaryTreeNode<Integer> root;
	private int size;
	
	
	
	//to check presence(isPresent)
	
	public boolean isPresent(int x) {
		
		return isPresentHelper(root,x);
	}
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node , int x) {
		if ( node == null) {
			return false;
			}
			if ( node.data == x) {
				return true;
			}
			if ( x < node.data) {
				//call on left side
				return isPresentHelper(node.left ,x);
			}else {
				//call on the right side
				return isPresentHelper(node.right , x);
			}
		
	}
	
	//insert function
	
	public void insert ( int x) {
		root = insertHelper(root, x);
		size++;
		
	}
	
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer>node, int x) {
		if( node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		if(x >= node.data) {
			node.right = insertHelper(node.right, x);
		}else {
			node.left = insertHelper(node.left , x);
		}
		return node;
	}
	
	//Largest
	
	private static int minimum(BinaryTreeNode<Integer>root) {
		
		if( root == null) {
			return Integer.MAX_VALUE;
		}
		int minimumLeft = minimum(root.left);
		int minimumRight = minimum(root.right);
		return Math.min(root.data,Math.min(minimumLeft , minimumRight)); // We use Math.max to find the largest number
	}
	
	//delete
	
	
	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteHelper(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	private static BSTDeleteReturn deleteHelper(BinaryTreeNode<Integer>node , int x){
		
		if(node == null) {
			return new BSTDeleteReturn(null, false);
		}
		if(node.data < x) {
			BSTDeleteReturn outputRight = deleteHelper(node.right , x);
			node.right = outputRight.root;
			outputRight.root = node;
			return outputRight;
		}
		if(node.data > x) {
			BSTDeleteReturn outputLeft = deleteHelper(node.left , x);
			node.left = outputLeft.root;
			outputLeft.root = node;
			return outputLeft;
		}
		//0 children
		if(node.left == null && node.right == null ) {
			return new BSTDeleteReturn(null, true);
		}
		//only left children
		if(node.left != null && node.right == null) {
			return new BSTDeleteReturn(node.left, true);
		}
		//only right children
		if(node.left == null && node.right != null) {
			return new BSTDeleteReturn(node.right, true);
		}
		//both children are present
		int rightMin = minimum(node.right);
		node.data = rightMin;
		BSTDeleteReturn outputRight = deleteHelper(node.right, rightMin);
		node.right = outputRight.root;
		return new BSTDeleteReturn(node,true);
		
	}
	
	
	//size
	public int size() {
		return size;
	}
	
	private static void printTreeHelper(BinaryTreeNode<Integer> node) {
		
		if ( node == null) {
			return;
		}
		System.out.print(node.data + ":");
		if(node.left != null) {
			System.out.print("L" + node.left.data + ", ");
		}
		if(node.right != null) {
			System.out.print("R" + node.right.data);
		}
		System.out.println();
		
		
		printTreeHelper(node.left);
		printTreeHelper(node.right);
		
	}
	
	
	//Largest BST
	public class Solution {

	    public static class BSTReturn {
	        int min;
	        int max;
	        boolean isBST;
	        int height;
	    }

	    public static BSTReturn largestBSTHelper(BinaryTreeNode<Integer> root) {
	        if (root == null) {
	            BSTReturn output = new BSTReturn();
	            output.max = Integer.MIN_VALUE;
	            output.min = Integer.MAX_VALUE;
	            output.isBST = true;
	            output.height = 0;
	            return output;
	        }

	        BSTReturn left = largestBSTHelper(root.left);
	        BSTReturn right = largestBSTHelper(root.right);

	        BSTReturn output = new BSTReturn();

	        int min = Math.min(root.data, Math.min(left.min, right.min));
	        int max = Math.max(root.data, Math.max(left.max, right.max));

	        output.min = min;
	        output.max = max;

	        output.isBST = left.max < root.data && right.min > root.data && left.isBST && right.isBST;

	        if (output.isBST) {
	            output.height = Math.max(left.height, right.height) + 1;
	        } else {
	            output.height = Math.max(left.height, right.height);
	        }

	        return output;
	    }

	    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
	        BSTReturn ans = largestBSTHelper(root);
	        return ans.height;
	    }

	}

	public void printTree() {
		printTreeHelper(root);
	}
		
}
