package tree;
import java.util.*;
import java.util.Scanner;

import queue.QueueEmptyException;
import queue.QueueUsingLL;


public class TreeTest {
	
	
	
	//Count the leaf nodes
	
	private static int count =0;
	public static int countLeafNodes(TreeNode<Integer> root){
		
		if(root == null){
	            return 0;
	        }
		if ( root.children.size()==0){
			count++;
		}
		for( int i =0; i < root.children.size(); i++){
			countLeafNodes(root.children.get(i));
		}
		return count;

	}
	
	//Post Order traversal
	
	public static void printPostOrder(TreeNode<Integer> root){
		
		for ( int i  = 0 ; i < root.children.size(); i++){
			printPostOrder(root.children.get(i));
		}

		System.out.print(root.data + " ");

	}
	
	//PreOrder Traversal
	
	public static void printPreOrder(TreeNode<Integer> root){
		
		System.out.print(root.data + " ");
		for ( int i  = 0 ; i < root.children.size(); i++){
			printPreOrder(root.children.get(i));
		}

	}
	
	//Check if generic tree contain element x
	
	private static boolean isPresent = false;
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		if ( root == null){
			return isPresent;
		}
		if ( root.data == x){
			isPresent = true;
			return  isPresent;
		}

		for( int i = 0; i< root.children.size(); i++){
			isPresent = checkIfContainsX(root.children.get(i), x);
		}
		return isPresent;

	}
	
	
	//Node having sum of children and node is max
	
	static class Pair {
		TreeNode<Integer> node;
		int sum;
		Pair ( TreeNode<Integer> node, int sum){
			this.node = node;
			this.sum = sum;
		}
	}

	private static ArrayList<Pair> a1= new ArrayList<>();
	private static int maxSum = Integer.MIN_VALUE;
	private static Pair maxPair;

	private static Pair maxPairfn(TreeNode<Integer>root){
        int allsum=root.data;
        
        for(int i=0;i<root.children.size();i++){
            allsum+=root.children.get(i).data;
        }
        
        Pair result=new Pair(root,allsum);
        a1.add(result);
        
        for(int i=0;i<root.children.size();i++){
            maxPairfn(root.children.get(i));
        }
        
        for(int i=0;i<a1.size();i++){
            if(a1.get(i).sum>maxSum){
                maxSum=a1.get(i).sum;
                maxPair=a1.get(i);
            }
        }
        return maxPair;

	} 
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		
		Pair result = maxPairfn(root);
        return result.node;

	}
	
	
	//Check Identical
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		if ( root1 == null){
			if ( root2 == null){
				return true;
			}else {
				return false;
			}
		}
		if( root1.data != root2.data){
			return false;
		}
		int childCount1 = root1.children.size();
		int childCount2 = root2.children.size();

		if ( childCount1 != childCount2){
			return false;
		}

		for ( int i  = 0 ; i < childCount1; i++)
			if ( !checkIdentical(root1.children.get(i), root2.children.get(i)))
			return false;

			return true;
	}
	
	//Next larger element
	

	private static TreeNode<Integer>nextLarger=new TreeNode<>(Integer.MAX_VALUE);
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
	 if(root.data > n && root.data < nextLarger.data){
            nextLarger=root;
        }
        for(int i=0;i<root.children.size();i++){
            findNextLargerNode(root.children.get(i),n);
        }
        
        return nextLarger;
	}
	
	//Second Largest Element In Tree
	private static TreeNode<Integer>largest=new TreeNode<>(Integer.MIN_VALUE);
    private static TreeNode<Integer>secondLargest=new TreeNode<>(Integer.MIN_VALUE);
    
    
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        if(root.data>largest.data){
            if(largest.data != Integer.MIN_VALUE){
                secondLargest=largest;
            }
            largest=root;
        }else if(root.data>secondLargest.data && root.data<largest.data){
            secondLargest=root;
        }
        
        for(int i=0;i<root.children.size();i++){
            findSecondLargest(root.children.get(i));
        }
        return secondLargest;
	}
	
	//Replace node with depth
	
	private static void replace(TreeNode<Integer> root, int depth) {
	root.data = depth;

	for (int i = 0; i < root.children.size(); i++) {
		replace(root.children.get(i), depth + 1);
	}
}

public static void replaceWithDepthValue(TreeNode<Integer> root) {
	int depth = 0;
	replace(root, depth);
}
	
	//Take input in Generic Tree
	
	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			
			TreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter the no of children for : " + front.data);
			int numChild = s.nextInt();
			for( int i =0 ; i< numChild; i++) {
				System.out.println("Enter the " + i + "th child data for :" + front.data);
				int childData = s.nextInt();
				TreeNode<Integer>childNode = new TreeNode<>(childData);
				front.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	//Sum of all Nodes
	public static int sumOfAllNode(TreeNode<Integer> root){
	if(root==null){
            return 0;
        }
		
           int sum = root.data;
          for(int i = 0;i<root.children.size();i++){
            sum = sum +sumOfAllNode(root.children.get(i));  
          }
        return sum;
	}
	
	// Number Of Nodes
	
	public static int numberOfNodes(TreeNode<Integer> root) {
		
		int count =1;
		for(int i =0; i< root.children.size(); i++) {
			int childCount = numberOfNodes(root.children.get(i));
			count += childCount;
		}
		return count;
	}
	
	public static void printTree(TreeNode<Integer>root) {
		
		//special case not the base case
		if(root == null) {
			return;
		}
		
		
		System.out.print(root.data + ": ");
		for(int i =0; i< root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for( int i  = 0 ; i< root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}

	public static void main(String[] args) throws QueueEmptyException {
		
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		node2.children.add(node5);
		TreeNode<Integer> root = takeInput();
		printTree(root);
//		System.out.println(numberOfNodes(root));

	}

}
